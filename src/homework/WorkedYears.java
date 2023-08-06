package homework;

import java.util.Scanner;

public class WorkedYears {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many year did you work?");
        double workYear=scanner.nextDouble();
        System.out.println("what about your annual salary?");
        double salary= scanner.nextDouble();


        if (workYear>=5){
            System.out.println("you are eligible for bonus");
            if(salary>50000){double bonus1=salary+5000;
                System.out.println("you win extra 5000 bonus new salary will be :"+bonus1);}
            else{double bonus2=salary+3000;
                System.out.println("you win extra 3000 bonus ne salary will be :"+bonus2);
            } }
            else{
        System.out.println("you are not eligible");
    }

    }
}
