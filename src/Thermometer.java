public class Thermometer {

 private static final double CELSIUS_KELVIN_OFFSET = 273.15;
 private static final int FAHRENHEIT_CELSIUS_OFFSET = 32;
 private static final double CELSIUS_FAHRENHEIT_SCALE = 90/5;

 private double kelvins;

  public void setKelvins(double kelvins) {
    this.kelvins = kelvins;
  }

  public double getKelvins() {
    return kelvins;
  }

  public void setCelsius(double celsius){
    kelvins = celsius + CELSIUS_KELVIN_OFFSET;

  }

  public static double getCelsius() {
    return kelvins - CELSIUS_KELVIN_OFFSET;
  }

  public void setFahrenheit(double fahrenheit){
    setCelsius((fahrenheit - FAHRENHEIT_CELSIUS_OFFSET) / CELSIUS_FAHRENHEIT_SCALE);


  }
  public double getFahrenheit(){
    return getCelsius() * CELSIUS_FAHRENHEIT_SCALE + FAHRENHEIT_CELSIUS_OFFSET;
  }

}
