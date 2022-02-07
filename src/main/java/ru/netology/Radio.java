package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int amountStations = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = calculateMaxStation();
    private int minStation = 0;
    private int currentStation;


    public Radio(int amountStations) {
        this.amountStations = amountStations;
        maxStation = calculateMaxStation();
    }


    public int calculateMaxStation() {
        return amountStations - 1;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void muteVolume() {
        setCurrentVolume(minVolume);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            return;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchTheNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void switchThePreviousStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}
