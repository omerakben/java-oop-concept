package j06object;
/**
 * Created in June 2022
 * by Omer Akben.
 * OBJECT class has own methods likewise, toString() , hashCode(), equals() etc.
 * In all classes inherited from OBJECT class. So for some reason casting some reason polymorphism it will help.
 */

import j04inheritance.J01Employee; // for getting inheritance to Tester & Developer class (extends keyword)
import j04inheritance.J03Developer; // for getting belonging from Developer
import j04inheritance.J04Tester; // for getting belonging from Tester class.

public class J01ObjectClass extends J01Employee {
    public J01ObjectClass(int id, String name, int birthYear, double hourlySalary) {
        super(id, name, birthYear, hourlySalary);
    }


    public static void main(String[] args) {

        //Technically in this part doing polymorphism(I will give more detail other packages)
        //Object class all classes super class

        //J04Tester ts1 = new J04Tester
        Object ts1 = new J04Tester(102,"Omer", 1990, 70, "Java", "testNG");

        //J03Developer dv1 = new J03Developer
        Object dv1 = new J03Developer(2345,"Omonjon", 1994, 90,"Java");


        System.out.println(ts1); // Tester class has toString Method from Object Class
        System.out.println(dv1); // Developer class has NOT --> in this scenario you will see @hasCode


    }
}
