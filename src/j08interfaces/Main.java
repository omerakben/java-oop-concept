package j08interfaces;
/**
 * Created in June 2022
 * by Omer Akben.
 * Concrete classes as like ManagerDB, StudentDB, DeveloperDB :
 * It is a complete class and can be instantiated(create an Object with (new keyword)).
 */
public class Main {
    public static void main(String[] args) {


        // Complete classes implemented from DataBase interface

        // !!!!Run to the methods separated!!!!
        DataBase dbManager = new ManagerDB(); //Polymorphism
        dbManager.login();
        dbManager.signIn();

        StudentDB dbStudent = new StudentDB();
        dbStudent.login();
        dbStudent.signIn();

        Object dbDeveloper = new DeveloperDB(); //Polymorphism
        ((DeveloperDB) dbDeveloper).login();  //Class casting
        ((DeveloperDB) dbDeveloper).signIn(); //Class casting


    }
}
