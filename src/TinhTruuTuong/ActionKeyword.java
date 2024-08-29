package TinhTruuTuong;

public class ActionKeyword extends Actions {
    @Override
    public void openURL(String url) {
        System.out.println("\uD83D\uDD06 Open URL: " + url);
    }

    @Override
    public void clickElement() {
        System.out.println("\uD83D\uDD06 Click on element");
    }

    @Override
    public void clickElement(String element) {
        System.out.println("\uD83D\uDD06 Click on element: " + element);
    }

    @Override
    public void setText(String text) {
        System.out.println("\uD83D\uDD06 Enter text in input: " + text);
    }

    @Override
    public void setText(String text, String keys) {
        System.out.println("\uD83D\uDD06 Enter text in input: " + text);
        System.out.println("\uD83D\uDD06 Enter key: " + keys);
    }
}
