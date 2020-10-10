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
        int currentTemperature = 45;
        int expected = 45;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void increaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 15;
        int expected = 15;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 21;
        int expected = 20;
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
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 16;
        int expected = 15;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}




