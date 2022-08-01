package com.isaac_martin.code;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPlease ender name for thermometer");
        String s = scanner.nextLine();
        System.out.printf("%nHi user, thanks for using [%s] today", s);
        System.out.printf("%nEnter Fahrenheit temperature: ");
        int fahrenheit = scanner.nextInt();
        System.out.printf("%nEnter celcius temperature: ");
        int celcius = scanner.nextInt();

        Thermometer temp = new Thermometer(fahrenheit, celcius, s);
        int i = temp.convertToCelsius(fahrenheit);
        int i1 = temp.convertToFahrenheit(celcius);
        int[] tempReadings = new int[3];
        System.out.printf("%nFahrenheit: %d%n celcius: %d%n", i1, i);
        System.out.printf("%nPlease enter three temperature readings: ");
        tempReadings[0] = scanner.nextInt();
        tempReadings[1] = scanner.nextInt();
        tempReadings[2] = scanner.nextInt();

        int i2 = temp.calculateAvgTemp(tempReadings);
        System.out.printf("%nAverage Temperature: %d%n", i2);

        System.out.printf("%nGoodbye!");

    }
}
