package class9;

public class E52DArrays {
    public static void main(String[] args) {
        int [][] numbers={{10,20,30,40},
                {100,200,303,150},
                {100,200,303,145}
        };
        int sum=0;
        for (int row=0; row< numbers.length;row++){
            for (int col=0; col< numbers[row].length; col++){//numbers[row]=>gives us the complete 1 d array
               sum=sum+numbers[row][col];
                }}
            System.out.println(sum);



    }
}
