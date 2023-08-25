package class10;

public class DogTester {
    public static void main(String[] args) {
        Dog lunsObj=new Dog();
        lunsObj.name="Luna";
        lunsObj.breed="Shiba";
        lunsObj.gender='F';
        lunsObj.age=10;
        lunsObj.weight=25;


        lunsObj.bark();
        lunsObj.eat();
        lunsObj.sleep();
}}
