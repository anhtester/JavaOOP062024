package TinhTruuTuong;

abstract public class Actions {
    abstract public void openURL(String url);

    abstract public void clickElement();

    abstract public void clickElement(String element);

    abstract public void setText(String text);

    abstract public void setText(String text, String keys);

    public String getTextElement(String element) {
        System.out.println("Get text of element: " + element);
        return "TEXT";
    }
}