package class9;

import java.util.Arrays;

public class E22DArrays {
    public static void main(String[] args) {
        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                           {"John","bob","adam","tamım"},
                           {"joke","laugh","john","mohammed"},
                           {"gui","backend","front","API"}

        };
        String [] row=names[2];
      /*  String [] firstRow=names[1];
        System.out.println(Arrays.toString(firstRow));*/
        for (String name:row) {
            System.out.println(name);

        }

    }
}
