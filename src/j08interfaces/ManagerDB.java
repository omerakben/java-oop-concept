package j08interfaces;
/**
 * Created in June 2022
 * by Omer Akben.
 * When it implements from DataBase(interface) directly needs to Override to method body!
 * A concrete class is a class that has an implementation for all of its methods.
 * They cannot have any unimplemented methods.
 * It can also extend an abstract class or implement an interface as long as it implements all their methods.
 */
public class ManagerDB implements DataBase{

    @Override
    public void login() {
        System.out.println("Welcome!");
    }

    @Override
    public void signIn() {
        System.out.println("Contact with IT Department.");
    }
}
