package j08interfaces;

/**
 * Created in June 2022
 * by Omer Akben.
 * An interface cannot be used to create a (new keyword) object.
 * Interface methods have no bodies only method signature, the body is provided by the "implement" class.
 * All methods of an interface must be overridden when it is implemented.
 * As an interface cannot be used to create objects, it cannot contain a constructor.
 * Interfaces have to be public(access modifier)!
 */

      //interface
public interface DataBase {

    //Only have method signature!
    void login();
    void signIn();

}
