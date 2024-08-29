package TinhDaHinh;

public class WebUI {

    public static void openURL(String url) {
        System.out.println("Open URL: " + url);
    }

    public static void clickElement(String element) {
        System.out.println("Click on element: " + element);
    }

    public static void setText(String text) {
        System.out.println("Enter text in input: " + text);
    }

    public static void setText(String text, int timeout) {
        System.out.println("Timeout wait for input visible: " + timeout);
        System.out.println("Enter text in input: " + text);
    }

    public static void setText(String text, String keyboard) {
        System.out.println("Enter text in input: " + text);
        System.out.println("Enter key: " + keyboard);
    }
}
