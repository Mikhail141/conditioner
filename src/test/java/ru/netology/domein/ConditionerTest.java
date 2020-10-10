package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    void getMaxTemperatureAndsetMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 40;

        conditioner.setMaxTemperature(expected);

        assertEquals(40, conditioner.getMaxTemperature());


    }

    @Test
    void getMinTemperatureAndsetMinTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 10;

        conditioner.setMinTemperature(expected);

        assertEquals(10, conditioner.getMinTemperature());
    }

    @Test
    void getCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 22;

        conditioner.setCurrentTemperature(expected);

        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    void isOnAndsetOn() {
        Conditioner conditioner = new Conditioner();
        boolean on = false;
        conditioner.setOn(on);

        assertEquals(on, conditioner.isOn());
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 20;
        int expected = 21;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(expected);
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    public void increaseCurrentTemperatureMoreMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 45;
        int expected = 45;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(expected);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int currentTemperature = 25;
        int expected = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 45;
        int expected = 44;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperaturemMore() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 15;
        int expected = 15;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}




