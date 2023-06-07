public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
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
        if (currentStation >= 10) {
            currentStation = 0;

        }

    }

    public void prev() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = 9;

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
/*

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
    }*/