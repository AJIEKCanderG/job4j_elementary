package ru.job4j.stream;

public class BuilderStreamCar {
    private String make;
    private String model;
    private String color;
    private double engineType;
    private int year;
    private int odometer;
    private String vin;
    private String transmission;
    private String fuelType;

    static class Builder {
        private String make;
        private String model;
        private String color;
        private double engineType;
        private int year;
        private int odometer;
        private String vin;
        private String transmission;
        private String fuelType;

        Builder builderMake(String make) {
            this.make = make;
            return this;
        }

        Builder builderModel(String model) {
            this.model = model;
            return this;
        }

        Builder builderColor(String color) {
            this.color = color;
            return this;
        }

        Builder builderEngineType(double engineType) {
            this.engineType = engineType;
            return this;
        }

        Builder builderYear(int year) {
            this.year = year;
            return this;
        }

        Builder builderOdometer(int odometer) {
            this.odometer = odometer;
            return this;
        }

        Builder builderVin(String vin) {
            this.vin = vin;
            return this;
        }

        Builder builderTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        Builder builderFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        BuilderStreamCar build() {
            BuilderStreamCar builderStreamCar = new BuilderStreamCar();
            builderStreamCar.make = make;
            builderStreamCar.model = model;
            builderStreamCar.color = color;
            builderStreamCar.engineType = engineType;
            builderStreamCar.year = year;
            builderStreamCar.odometer = odometer;
            builderStreamCar.vin = vin;
            builderStreamCar.transmission = transmission;
            builderStreamCar.fuelType = fuelType;
           return builderStreamCar;
        }
    }

    public static void main(String[] args) {
        BuilderStreamCar builderStreamCar = new Builder()
                .builderMake("Audi")
                .builderModel("A4")
                .builderColor("Gun metallic")
                .builderEngineType(2.0)
                .builderYear(2015)
                .builderOdometer(10)
                .builderVin("WAUZZZ8DZXA246728")
                .builderTransmission("Manual")
                .builderFuelType("Diesel")
                .build();
        System.out.println(builderStreamCar);
    }

    @Override
    public String toString() {
        return "BuilderStreamCar{"
                + "make='" + make + '\''
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", engineType=" + engineType
                + ", year=" + year
                + ", odometer=" + odometer
                + ", vin='" + vin + '\''
                + ", transmission='" + transmission + '\''
                + ", fuelType='" + fuelType + '\''
                + '}';
    }
}
