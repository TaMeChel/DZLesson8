package p1;

public class main {
    public static void main(String[] args){
        SamsungPhone p1 = new SamsungPhone("89001234570","Samsung Galaxi",420);
        p1.info();
        p1.receiveCall("Ivan");
        XiaomiPhone p2 = new XiaomiPhone("89001234571", "Xiaomi Redmi", 390);
        p2.info();
        p2.receiveCall("Anna");
        ApplePhone p3 = new ApplePhone("89001234572", "Apple 10", 375);
        p3.info();
        p3.receiveCall("Pavel");
    }
}
