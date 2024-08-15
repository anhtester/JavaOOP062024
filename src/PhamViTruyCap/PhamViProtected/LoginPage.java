package PhamViTruyCap.PhamViProtected;

public class LoginPage {
    protected String inputEmail = "//input[@id='email']";
    protected String inputPassword = "//input[@id='password']";

    public String buttonLogin = "//button[normalize-space()='Login']";

    public void loginCRM(){
        System.out.println(inputEmail);
        System.out.println(inputPassword);
        System.out.println(buttonLogin);
    }
}
