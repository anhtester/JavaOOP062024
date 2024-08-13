package com.anhtester.Login;

import com.anhtester.Customer.CustomerTest;

public class LoginTest {

    String name = "Selenium";

    public void testLoginSuccess() {
        System.out.println("Test Login Success");
    }

    public void testLoginFailWithEmailInvalid() {
        System.out.println("Test Login Fail");
    }

    public static void main(String[] args) {
        LoginTest loginTest1 = new LoginTest();

        loginTest1.testLoginSuccess();
        System.out.println(loginTest1.name);

        new LoginTest().testLoginSuccess(); //Gọi kiểu Anonymous (ẩn danh)
        new LoginTest().testLoginFailWithEmailInvalid();

        LoginTest loginTest2 = new LoginTest();
        loginTest2.testLoginSuccess();

        //Gọi thành phần từ class khác
        CustomerTest customerTest = new CustomerTest();
        customerTest.testAddNewCustomer();
    }
}
