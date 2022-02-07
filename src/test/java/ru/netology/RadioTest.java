package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBoundaryValuesOne() {

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBoundaryValuesTwo() {

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMute() {

        radio.muteVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolumeBoundaryValuesOne() {

        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBoundaryValuesTwo() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurnDownVolume() {

        radio.setCurrentVolume(100);
        radio.turnDownVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeBoundaryValues() {

        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBoundaryValuesOne() {

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBoundaryValuesTwo() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBoundaryValuesThree() {

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStation() {

        radio.setCurrentStation(0);
        radio.switchTheNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStationBoundaryValuesOne() {

        radio.setCurrentStation(8);
        radio.switchTheNextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStationBoundaryValuesTwo() {

        radio.setCurrentStation(9);
        radio.switchTheNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStation() {

        radio.setCurrentStation(9);
        radio.switchThePreviousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStationBoundaryValuesOne() {

        radio.setCurrentStation(1);
        radio.switchThePreviousStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStationBoundaryValuesTwo() {

        radio.setCurrentStation(0);
        radio.switchThePreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTheNextStationBoundaryValuesConstructor() {
        Radio radio1 = new Radio(30);
        radio1.setCurrentStation(29);
        radio1.switchTheNextStation();
        int expected = 0;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchThePreviousStationBoundaryValuesConstructor() {
        Radio radio1 = new Radio(30);
        radio1.setCurrentStation(0);
        radio1.switchThePreviousStation();
        int expected = 29;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationConstructor() {
        Radio radio1 = new Radio(30);
        radio1.setCurrentStation(29);
        int expected = 29;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }
}