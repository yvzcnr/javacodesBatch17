package class9;

import java.util.Arrays;

public class E42DArrays {
    public static void main(String[] args) {




        int [][] numbers={{10,20,30,40},
                          {100,200,303,150},
                          {100,200,303,145}
        };
        for (int row=0; row< numbers.length;row++){
          for (int col=0; col< numbers[row].length; col++){//numbers[row]=>gives us the complete 1 d array
            if (numbers[row][col]%2==0){
            System.out.print(numbers[row][col]+" ");
          }}
          System.out.println();
        }

    }
}
