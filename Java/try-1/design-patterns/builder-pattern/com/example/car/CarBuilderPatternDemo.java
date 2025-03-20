package com.example.car;

public class CarBuilderPatternDemo {
    public static void main(String[] args) {
        Car carA = new Car.CarBuilder("V6 Engine", "Automatic").build();


        Car carB = new Car.CarBuilder("V6 Engine", "Manual")
        .setAirConditioning(true)
        .setGPS(true)
        .setColor("Blue")
        .build();

        System.out.println(carA);
        System.out.println(carB);
    }
}
