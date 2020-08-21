package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryNew = new Battery(78);
        Battery batteryOld = new Battery(7);
        System.out.println("New battery - " + batteryNew.load + " Old battery - " + batteryOld.load);
        batteryNew.exchange(batteryOld);
        System.out.println("New battery - " + batteryNew.load + " Old battery - " + batteryOld.load);
    }
}
