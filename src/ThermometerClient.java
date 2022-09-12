public class ThermometerClient {

  public static void main(String[] args) {
    Thermometer t1 = new Thermometer();
    t1.setCelsius(-40);
    System.out.println(t1.getFahrenheit());


    t1.setKelvins(0);
    System.out.println(t1.getCelsius());

    t1.setFahrenheit(212);
    System.out.println(t1.getCelsius);
    

  }

}
