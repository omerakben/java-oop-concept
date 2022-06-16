package j07polymorphism.instance_of;

/**
 * Created in June 2022
 * by Omer Akben
 * The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
 * Returns True or False
 */

// Parent Class
class Computer{
    private final String Type;
    private final Long PerSecondSpeed;

    public Computer(String type, Long perSecondSpeed) {
        Type = type;
        PerSecondSpeed = perSecondSpeed;
    }
    public void performance(){
        System.out.println("========");
        System.out.println("Computer performance depend on the processor!");
    }

    public String getType() {
        return Type;
    }

    public Long getPerSecondSpeed() {
        return PerSecondSpeed;
    }

}//end Computer Class

// Subclass (extends)!!
class PersonalComputer extends Computer{

    public PersonalComputer(String type, Long perSecondSpeed) {
        super(type, perSecondSpeed);
    }

    @Override
    public void performance() {
        System.out.println("========");
        System.out.println(getType() + " is usually using for daily base actions.");
        System.out.println(getPerSecondSpeed() + " enough for standard users!");

    }
}

// Subclass (extends)!!
class MainFrame extends Computer{
    public MainFrame(String type, Long perSecondSpeed) {
        super(type, perSecondSpeed);
    }
    @Override
    public void performance() {
        System.out.println("========");
        System.out.println(getType() + " is usually using for domain and server computer.");
        System.out.println(getPerSecondSpeed() + " enough for big organizations!");

    }
}

// Subclass (extends)!!
class SuperComputer extends Computer{

    public SuperComputer(String type, Long perSecondSpeed) {
        super(type, perSecondSpeed);
    }
    @Override
    public void performance() {
        System.out.println("========");
        System.out.println(getType() + " is usually using for Extra-ordinary big data's calculations.");
        System.out.println(getPerSecondSpeed() + " enough for multi task big organization actions!");

    }
}

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Computer", 0L);
        Computer myComputer = new PersonalComputer("Personal Computer(PC)", 1_000L);
        Computer techComputer = new MainFrame("MainFrame", 100_000L);
        SuperComputer goggle = new SuperComputer("Super Computer", 100_000_000L);

        // Object doesn't have performance() method but polymorphism help to getting method!
        Computer yourComputer = new PersonalComputer("Personal Computer", 2_000L);


        computer.performance();
        myComputer.performance();
        techComputer.performance();
        goggle.performance();
        yourComputer.performance();



        System.out.println("=========== Instance of example ===========");
        /*
        The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
        Returns True or False
        */
        Computer myComputerIsA = (myComputer instanceof Computer) ? myComputer : null; //Ternary operator kind of if-else
        Computer yourComputerIsA = (yourComputer instanceof Object)? yourComputer : null; //Ternary operator kind of if-else

        //Computer googleComputerIsA = (goggle instanceof PersonalComputer)? goggle : null;
        // It can not compile because google and PersonalComputer don't have a direct relations.

        System.out.println(myComputerIsA.getType());
        System.out.println(yourComputerIsA.getType());
        if(myComputer instanceof Computer){
            System.out.println(myComputer.getType() + " is subclass from Computer Class");
        }

    }//end main method

}
