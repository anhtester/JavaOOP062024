package TinhDongGoi;

public class LoginPage {

    private String url = "https://crm.anhtester.com";
    private String email;
    private String password;

    private int role;
    private String phone;
    private String address;

    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginPage() {
    }

    public LoginPage(String url, String email, String password, int role, String phone, String address) {
        this.url = url;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        System.out.println("Open Url CRM");
        System.out.println("Save log to report");
        return url;
    }

    public String getUrlLoginAdmin(){
        return url + "/admin/authentication";
    }

    public String getUrlLoginCustomer(){
        return url + "/authentication/login";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setUrl(String url) {
//        this.url = url;
//    }

    public void loginCRM(){
        System.out.println("Open URL: " + getUrl());
        System.out.println("Enter email: " + getEmail());
        System.out.println("Enter password: " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        //loginPage.setUrl("https://crm.anhtester.com/admin/authentication");
        loginPage.setEmail("admin@example.com");
        loginPage.setPassword("123456");
        System.out.println(loginPage.url);
        loginPage.loginCRM();

        LoginPage loginPage2 = new LoginPage();

        //loginPage2.setUrl("https://crm.anhtester.com/admin/authentication");
        loginPage2.setEmail("customer@example.com");
        loginPage2.setPassword("123456");

        loginPage2.loginCRM();
    }
}
