package j01overloading;

import java.util.Calendar;
/**
 * Created in June 2022
 * by Omer Akben.
 * This example for; method or class can be overloaded to different shape usage.
 */

public class J01OverLoading {

    public static void personInfo (String name, int birthYear, double heightInches,double weight ){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        double bmi = (weight*703)/(heightInches*heightInches);
        int age =  year - birthYear;

        System.out.println("Hello " + name + ", you are " + age + " years old." + " Your BMI is " + String.format("%.2f",bmi));

    }
    // same identifier method name "personInfo" for overloading!
    public static void personInfo (String name){
        //This is method overloading
        System.out.println("Hello, " + name + ". We need more information to counting your age and BMI!");
    }

    public static void main(String[] args) {
        //overloaded method
        personInfo("Omer");

        //exact method
        personInfo("Omer", 1990, 61, 205);

    }
}
