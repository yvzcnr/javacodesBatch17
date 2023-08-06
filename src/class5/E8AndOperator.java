package class5;

public class E8AndOperator {
    public static void main(String[] args) {
    boolean goodCredit=true;
    boolean stableJob=true;
    boolean minAge=false;
    if(goodCredit&&stableJob&&minAge){
        System.out.println("you can have the loan");
    }else {
        System.out.println("you need to fulfill the requirements");
    }


    }
}
