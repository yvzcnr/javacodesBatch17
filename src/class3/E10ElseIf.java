package class3;

public class E10ElseIf {
    public static void main(String[] args) {

      String fruit="apple";
      if (fruit.equals("orange")){
          System.out.println("price is 5$");
      }
        else if (fruit.equals("apple")){
            System.out.println("price is 1000$");
        }
        else {
          System.out.println("this fruit is not available right now");
      }
    }
}
