package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegldarkę Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce Firefox");

    }
}
