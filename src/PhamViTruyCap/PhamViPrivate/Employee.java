package PhamViTruyCap.PhamViPrivate;

public class Employee {

    private String name = "Trúc Phương";
    private int age = 30;

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    private void getName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.getInfo();
    }
}
