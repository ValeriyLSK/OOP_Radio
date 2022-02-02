package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBoundaryValuesOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBoundaryValuesTwo() {

        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMute () {

        Radio radio = new Radio();
        radio.muteVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolumeBoundaryValuesOne () {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBoundaryValuesTwo () {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurnDownVolume () {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.turnDownVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeBoundaryValues () {

        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation () {

        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBoundaryValuesOne () {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBoundaryValuesTwo () {

        Radio radio = new Radio();
        radio.setCurrentStation(40);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStation () {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchTheNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStationBoundaryValuesOne () {

        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.switchTheNextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStationBoundaryValuesTwo () {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchTheNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStation () {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchThePreviousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStationBoundaryValuesOne () {

        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.switchThePreviousStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStationBoundaryValuesTwo () {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchThePreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


}