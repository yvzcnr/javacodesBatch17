package class5;

public class E1NotOperator {
    public static void main(String[] args) {
        //logical operators help us combine multiple condition on the same line in if statement
        // there are 3 type of logical operator; NOT(!) OR (||) AND (&&)
    //NOT(!):TRUE=>FALSE    FALSE=>TRUE TRUE İSE FALSE YAPAR
        //why should we use NOT operator
        //ıt can help us simplify the logic in some of the case
        //2.code readability will in increase
        //or(||);logical OR operator will hwlp us combine multiple condition in such a way that as soon as one condition gets true
        //the whole condition will be evaluated to true.
        //TRUE||FALSE||TRUE=>TRUE
        //AND(&&);will help us combine the conditions in such a way that it will only give us true if all the
        //conditions are true
        //true&&false&&true=>false
        //true&&true&&false=>false
        boolean box=true; //buradaki true nun yanına da koyabiliriz!
        box=!box;
        System.out.println(!box);

    }
}
