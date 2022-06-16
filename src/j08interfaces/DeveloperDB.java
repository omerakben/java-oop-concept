package j08interfaces;
/**
 * Created in June 2022
 * by Omer Akben.
 * When it implements from DataBase(interface) directly needs to Override to method body!
 * A concrete class is a class that has an implementation for all of its methods.
 * They cannot have any unimplemented methods.
 * It can also extend an abstract class or implement an interface as long as it implements all their methods.
 */
import java.util.Scanner;

public class DeveloperDB implements DataBase{
    @Override
    public void login() {
        String userName = "Omonjon-Yokubov";
        String password = "ABC123!@";
        System.out.println("Hello " + userName);
    }

    @Override
    public void signIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first code ever : ");
        String firstCode = scanner.nextLine();
        if(firstCode.equalsIgnoreCase("Hello, world!")){
            System.out.println("Welcome!");
        }else{
            System.exit(1);
        }
    }
}
