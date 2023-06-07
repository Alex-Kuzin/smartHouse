public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    public Radio (){}
    public Radio(int size){
        maxStation = size - 1;

    }


    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = maxStation - 1;
            return;
        }

        if (newCurrentStation >= maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }

        if (newCurrentVolume >= 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        currentStation++;
        if (currentStation >= maxStation) {
            currentStation = minStation;

        }

    }

    public void prev() {
        currentStation--;
        if (currentStation < minStation) {
            currentStation = maxStation - 1;

        }
    }

    public void addVolume() {
        currentVolume++;
        if (currentVolume >= 100) {
            currentVolume = 100;

        }

    }

    public void downVolume() {
        currentVolume--;
        if (currentVolume < 0) {
            currentVolume = 0;

        }
    }
}