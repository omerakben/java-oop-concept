package j04inheritance;

/**
 * Created in June 2022
 * by Omer Akben.
 * Manager directly inherited from super class Employee
 */
public class J02Manager extends J01Employee {

    public J02Manager(int id, String name, int birthYear, double hourlySalary) {
        super(id, name, birthYear, hourlySalary);
    }

    public void managerSpecialMethod(String companyName){
        System.out.println("Hello my name is " + getName() + ". I am the manager of the " + companyName +".");
    }

}
