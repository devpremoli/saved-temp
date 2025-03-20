package com.example.car;

public class Car {
    // Required parameters
    private final String engine;
    private final String transmission;

    // Optional parameters
    private final boolean airConditioning;
    private final boolean gps;
    private final String color;

    // Private constructor accessible only to the Builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.airConditioning = builder.airConditioning;
        this.gps = builder.gps;
        this.color = builder.color;
    }

    // Getters (no setters, making Car immutable)
    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean hasAirConditioning() {
        return airConditioning;
    }

    public boolean hasGPS() {
        return gps;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission 
                + ", airConditioning=" + airConditioning 
                + ", gps=" + gps + ", color=" + color + "]";
    }

    // Nested static Builder class
    public static class CarBuilder {
        // Required parameters
        private final String engine;
        private final String transmission;

        // Optional parameters - initialized to default values
        private boolean airConditioning = false;
        private boolean gps = false;
        private String color = "white";

        // Builder constructor for required parameters
        public CarBuilder(String engine, String transmission) {
            this.engine = engine;
            this.transmission = transmission;
        }

        // Methods for setting optional parameters
        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public CarBuilder setGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Build method to create the final Car object
        public Car build() {
            return new Car(this);
        }
    }
}