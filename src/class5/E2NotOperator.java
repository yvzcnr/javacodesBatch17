package class5;

public class E2NotOperator {
    public static void main(String[] args) {
        //write aprogramme that checks if the counry is not equal to ıran
        //ıts says you are allowed
        String country="UK";
        if (!country.equals("Iran")){
            System.out.println("welcome you are allowed");
        }else {
            System.out.println("you are not allowed");
        }
    }
}
