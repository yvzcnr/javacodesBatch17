package class07;

public class T6NestedLoops {
    public static void main(String[] args) {


        for (int j = 1; j <= 4; j++) {

            for (int i=1; i<=6;i++){
                if (j==2&&i==3||j==3&&i==3||j==2&&i==4||j==3&&i==4){
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }


            }
            System.out.println();
        }

    }
}
