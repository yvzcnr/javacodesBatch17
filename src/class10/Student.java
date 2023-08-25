package class10;

public class Student {
    String name;
    int age;
    String id;
    void study(){
        System.out.println("Studying 16 hours a day..............");
    }

    public static void main(String[] args) {
        Student ehabObj=new Student();
        ehabObj.name="EHAB";
        ehabObj.age=22;
        ehabObj.id="abc123";
        ehabObj.study();

        Student habibObj=new Student();
        habibObj.name="habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();


    }
}
