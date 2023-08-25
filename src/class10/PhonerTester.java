package class10;

public class PhonerTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.name="14 pro max";
        iphone.ram_capacity=128;
        iphone.screen_size=6.7;
        iphone.battery_power=6000;
        Phone pixel=new Phone();
        pixel.name="google";
        pixel.ram_capacity=64;
        pixel.screen_size=5.7;
        pixel.battery_power=5500;

iphone.call();
iphone.internet();
        System.out.println("...............");
       pixel.call();
        pixel.internet();
    }
}
