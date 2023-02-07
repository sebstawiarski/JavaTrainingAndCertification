public class AppChecker {
    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp("Calculator");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator" );
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
