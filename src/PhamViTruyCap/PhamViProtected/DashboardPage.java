package PhamViTruyCap.PhamViProtected;

import PhamViTruyCap.Common.BasePage;

public class DashboardPage extends BasePage{

    public void getDriver(){
        System.out.println(driver);
    }

    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();

        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);

        BasePage basePage = new BasePage();
        //System.out.println(basePage.driver); //Không được bởi vì khác package
    }
}
