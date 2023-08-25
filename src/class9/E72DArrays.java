package class9;

import java.util.Arrays;

public class E72DArrays {
    public static void main(String[] args) {
        String [][] names={{"Kia", "Hyundai", "Sportage", "Genesis Motor"},
                {"tesla","audı","kıa","fıat"},
                {"Ford", "Cadillac", "Jeep", "Tesla"},
                {"Ferrari", "Lamborghini", "Maserati", "Fiat"}


        };
    for (String [] row:names){
       for (String v:row){
           System.out.print(v+" ");
       }
        System.out.println();
    }

        System.out.println("=========================");
        for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j <names[i].length ; j++) {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
