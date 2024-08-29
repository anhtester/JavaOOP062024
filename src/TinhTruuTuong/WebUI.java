package TinhTruuTuong;

public class WebUI extends Actions implements ActionsInterface, ApiInterface{
    @Override
    public void openURL(String url) {
        System.out.println("Open URL: " + url);
    }

    @Override
    public void clickElement() {
        System.out.println("Click on element");
    }

    @Override
    public String getTextElement() {
        return "";
    }

    @Override
    public void clickElement(String element) {

    }

    @Override
    public void setText(String text) {
        System.out.println("Enter text in input: " + text);
    }

    @Override
    public void setText(String text, String keys) {
        System.out.println("Enter text in input: " + text);
        System.out.println("Enter key: " + keys);
    }

    @Override
    public String getUrl() {
        return "";
    }

    @Override
    public Object getBody() {
        return null;
    }

    @Override
    public int getStatusCode() {
        return 0;
    }
}
