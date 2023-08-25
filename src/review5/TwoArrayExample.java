package review5;

import java.util.Arrays;

public class TwoArrayExample {
    public static void main(String[] args) {
        String [][] countries={
                {"canada","usa"},//0
                {"ecuador","brazil","chile","argentina"},//1
                {"romania","france","ıtaly"}//2
        };
        System.out.println(countries.length);//3 number of 1D array



        for (String [] countryArray :countries){
            for (String country:countryArray){
                System.out.print(country+" ");
               }
            System.out.println();

        }



    }
}
