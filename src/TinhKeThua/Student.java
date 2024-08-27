package TinhKeThua;

public class Student extends Person {

    private String phone;
    private String address;

    public Student(String name, int age, float height, String phone) {
        super(name, age, height); //Truyền data ngược về class cha Person

        this.phone = phone;
        this.address = "Hà Nội";
    }

    public void showInfoStudent() {
        //Dùng từ khoá super để gọi những thành phần từ class Cha khi bị trùng với class con
        super.getInfo(); //Từ class cha Person
        getName();

        getInfo(); //Từ class con Student

//        System.out.println("Phone: " + phone); //Từ class con
//        System.out.println("Address: " + address); //Từ class con
    }

    //Ghi đè phương thức từ class Cha
    public void getInfo(){
        System.out.println("Phone: " + phone); //Từ class con
        System.out.println("Address: " + address); //Từ class con
    }

    public static void main(String[] args) {
        Student student = new Student("Phương", 30, 165.5F, "0939206009");
        student.showInfoStudent();
    }

}