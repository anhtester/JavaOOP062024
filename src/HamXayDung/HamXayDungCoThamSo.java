package HamXayDung;

public class HamXayDungCoThamSo {

    public String name;
    public String phone;
    public String address;

    public HamXayDungCoThamSo(String name1, String phone1){
        name = name1;
        phone = phone1;
    }

    public HamXayDungCoThamSo(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo = new HamXayDungCoThamSo("Mai", "123456");

        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Hoa", "456789");

        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo3 = new HamXayDungCoThamSo("Huệ", "456789", "Ha Noi");

        System.out.println(hamXayDungCoThamSo3.name);
        System.out.println(hamXayDungCoThamSo3.phone);
        System.out.println(hamXayDungCoThamSo3.address);
    }

}
