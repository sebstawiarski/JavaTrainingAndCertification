import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // a ostaje przekonwertowana na double

        int d = a/(int)b; // tutaj się nie da bo stracilibyśmy końcówkę

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
