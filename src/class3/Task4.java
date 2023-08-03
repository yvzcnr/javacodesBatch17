package class3;

public class Task4 {
    public static void main(String[] args) {
//Create a Java program that stores the expected temperature and the actual temperature for a day. If the expected temperature is higher than the actual temperature, print "It's cooler than expected, wear a jacket!", otherwise print "It's as warm as expected, enjoy your day!"
        double expectedTemperature=24;
        double actualTemperature=32;
        if (expectedTemperature>actualTemperature){
            System.out.println("It's cooler than expected, wear a jacket! ");
        }else {
            System.out.println("It's as warm as expected, enjoy your day!");
        }
    }
}
