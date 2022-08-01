package com.isaac_martin.code;

/**
 * Hello world!
 *
 */
public class Thermometer
{



    public Thermometer(int fahrenheit, int celcius, String s) {
        this.degreesF = fahrenheit;
        this.degreesC = celcius;
        this.name = s;
    }

    public static int getDegreesF() {
        return degreesF;
    }

    public static void setDegreesF(int degreesF) {
        Thermometer.degreesF = degreesF;
    }

    public static int getDegreesC() {
        return degreesC;
    }

    public static void setDegreesC(int degreesC) {
        Thermometer.degreesC = degreesC;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Thermometer.name = name;
    }

    public int[] getTempReadings() {
        return tempReadings;
    }

    public void setTempReadings(int[] tempReadings) {
        this.tempReadings = tempReadings;
    }

    private static int degreesF;
  private static int degreesC;
  private static String name = "";
  private int[]  tempReadings = new int[3];

  public Thermometer() {

  }
  public Thermometer(int degreesF, int degreesC, int[] tempReadings, String name) {
      this.degreesF = degreesF;
      this.degreesC = degreesC;
      this.name = name;
      this.tempReadings = tempReadings;
  }
    public static int convertToFahrenheit(int celcius) {
      int formula = (int) ((celcius * 1.8) + 32);
      return formula;

    }
    public static int convertToCelsius(int fahrenheit) {
        int formula = (int) ((fahrenheit - 32)/1.8);
        return formula;
    }
    public static int calculateAvgTemp(int[] temps) {
        int averageTemp = (temps[0] + temps[1] + temps[2]) / temps.length;
        return averageTemp;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
