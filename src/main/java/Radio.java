public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }

        if (newCurrentStation >= 10) {
            currentStation = 0;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next(int newCurrentStation) {
        newCurrentStation++;
        if (newCurrentStation >= 10) {
            currentStation = 0;
            return;
        }
        currentStation = newCurrentStation;

    }

    public void prev(int newCurrentStation) {
        newCurrentStation--;
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }
        currentStation = newCurrentStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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

    public void addVolume(int newCurrentVolume) {
        newCurrentVolume++;
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void downVolume(int newCurrentVolume) {
        newCurrentVolume--;
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        currentVolume = newCurrentVolume;
    }
}