public class Radio {
    private int maxStation = 10;
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
        return 0;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = maxStation - 1;
            return;
        }

        if (newCurrentStation >= maxStation) {
            currentStation = 0;
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
            currentStation = 0;

        }

    }

    public void prev() {
        currentStation--;
        if (currentStation < 0) {
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