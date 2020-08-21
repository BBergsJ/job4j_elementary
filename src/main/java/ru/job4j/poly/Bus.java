package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        boolean drive = true;
    }

    @Override
    public void passengers(int count) {
        count++;
    }

    @Override
    public int gasStation(int liters) {
        int gas = 45;
        return gas * liters;
    }
}
