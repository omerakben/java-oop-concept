package j05for_inheritance_example;

//import j04inheritance.J03Developer;
//import j04inheritance.J04Tester;

// if have asterisks(*) it means all classes bring it. So before importing ^^ it is redundant.
import j04inheritance.*; // importing all classes

/**
 * Created in June 2022
 * by Omer Akben.
 * Same as J04Inheritance/J05Main package but at the different package ^^ look up (imported area)
 * Invoking for different package.
 */
public class Main {
    public static void main(String[] args) {

        J03Developer dv1 = new J03Developer(2345,"Omonjon", 1994, 90,"Java");

        J04Tester ts1 = new J04Tester(9876, "Omer", 1990, 70, "Java", "testNG");
        J04Tester ts2 = new J04Tester(9875, "Tatiana", 1995,72.5,"Python","JUnit");
        J04Tester ts3 = new J04Tester(9874, "Farajulla", 1992,77.5,"PHP","testNG");
        J04Tester ts4 = new J04Tester(9873, "Sulamita", 1996, 75, "Java", "testNG");
        J04Tester ts5 = new J04Tester(9872, "Anna", 1994,73.5,"Java","Data-Driven");
        J04Tester ts6 = new J04Tester(9871, "Emil", 1993,72.5,"Java","Page Object Model");
        J04Tester ts7 = new J04Tester(9870,"Laila",1995,77,"Java", "testNG,JUnit");

        dv1.showPersonInfo();

        ts1.showPersonInfo();
        ts2.showPersonInfo();
        ts3.showPersonInfo();
        ts4.showPersonInfo();
        ts5.showPersonInfo();
        ts6.showPersonInfo();
        ts7.showPersonInfo();
    }
}
