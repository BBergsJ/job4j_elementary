package ru.job4j.stream;

public class Car {
    private String brand;
    private String model;
    private String country;
    private String color;
    private int year;
    private int hp;
    private int km;

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", country='" + country + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", hp=" + hp
                + ", km=" + km
                + '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private String country;
        private String color;
        private int year;
        private int hp;
        private int km;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCountry(String country) {
            this.country = country;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildYear(int year) {
            this.year = year;
            return this;
        }

        Builder buildHp(int hp) {
            this.hp = hp;
            return this;
        }

        Builder buildKm(int km) {
            this.km = km;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.country = country;
            car.color = color;
            car.year = year;
            car.hp = hp;
            car.km = km;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("lada")
                .buildModel("2108")
                .buildCountry("Rus")
                .buildColor("White")
                .buildYear(1979)
                .buildHp(70)
                .buildKm(1000000)
                .build();
        System.out.println(car);
    }
}
