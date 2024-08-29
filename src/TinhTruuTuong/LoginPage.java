package TinhTruuTuong;

public class LoginPage {
    public static void main(String[] args) {
        WebUI webUI = new WebUI();

        webUI.openURL("https://crm.anhtester.com/admin/authentication");
        webUI.setText("admin@example.com");
        webUI.setText("123456");
        webUI.clickElement();
        webUI.getTextElement("Login Header");

        ActionKeyword actionKeyword = new ActionKeyword();
        actionKeyword.openURL("https://crm.anhtester.com/admin/authentication");
        actionKeyword.setText("admin@example.com");
        actionKeyword.setText("123456");
        actionKeyword.clickElement();
    }
}
