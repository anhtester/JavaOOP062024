package TinhKeThua;

public class Person {

    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name){
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

    public void getName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person person = new Person("");

    }
}