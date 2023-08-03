package udemy;

public class DoWhile {
    public static void main(String[] args) {
        //sayının basamakları toplamı
        int i=1234;
        int total=0;
        do {
            total+=i%10;
            i/=10;
            System.out.println("i:"+i);
        }while (i>0);
        System.out.println("total:"+total);
    }
}
