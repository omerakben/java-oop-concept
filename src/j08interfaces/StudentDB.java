package j08interfaces;

import java.util.Scanner;

/**
 * Created in June 2022
 * by Omer Akben.
 * When it implements from DataBase(interface) directly needs to Override to method body!
 * A concrete class is a class that has an implementation for all of its methods.
 * They cannot have any unimplemented methods.
 * It can also extend an abstract class or implement an interface as long as it implements all their methods.
 */

public class StudentDB implements DataBase{
    @Override
    public void login() {
        String userName = "Omer_Akben";
        int password = 123987;
        System.out.println("Hello " + userName);
    }

    @Override
    public void signIn() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your password : ");
        int password = scanner.nextInt();
        System.out.println("Hello " + name + ", Student account created!");

    }
}
