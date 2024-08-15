package HamXayDung;

public class DemoHamXayDung {

    public String name;
    public String phone;
    public static String address = "Ha Noi";

    //Hàm xây dựng - có tên hàm giống tên class
    private DemoHamXayDung(){
        name = "Nhung";
        phone = "123456";
    }

    public static void main(String[] args) {

        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng luôn
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();

        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);

        DemoHamXayDung demoHamXayDung2 = new DemoHamXayDung();

        System.out.println(demoHamXayDung2.name);
        System.out.println(demoHamXayDung2.phone);

    }

}
