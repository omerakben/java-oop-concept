package j03encapsulation;

/**
 * Created in June 2022
 * by Omer Akben.
 * Access to "Car" class different class even private fields.
 * For private fields need special method a.k.a. - Constructor, Getter & Setter -.
 */

public class Car {
    private String color;
    private String manufacture;
    private boolean isHybrid;
    private int year;
    private int doors;

    /**
     * A constructor is a special method of a class or structure in OOP that initializes a newly created object of that type.
     * Whenever an object is created, the constructor is called automatically.
     * @param color
     * @param manufacture
     * @param isHybrid
     * @param year
     * @param doors has an extra (if else) for sure right entrance!
     */

    public Car(String color, String manufacture, boolean isHybrid, int year, int doors) {
        /*
        this. keyword a.k.a. identifier name shadowing.
        Java need to declare color,manufacture,isHybrid again like was String,boolean,int etc.
        However, if you declare a new variable, you will lose the constructor variables.
        this. keyword make clarified Since declared in to the constructor color manufacture is hybrid etc. and parameters,
        ARE THE SAME!
         */
        this.color = color;
        this.manufacture = manufacture;
        this.isHybrid = isHybrid;
        this.year = year;
        this.doors = doors;
    }//end constructor

    //Default constructor (Overloading)
    public Car() {
        // this(); is invoking before constructor for default values.
        this(null, null, false, 0, 0);
        System.out.println("Default constructor");
    }

    /** Getters & Setters
     * Private fields only available in same class but when you invoke this class with new Object you need;
     * a getter method to getting already declared variables.
     * a setter method for setting variables to new values.
     */
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4){
            this.doors = doors;
        }else {
            System.out.println("Valid car doors are only two(2) or four(4).");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Override annotation easily getting to the all fields declared values.
    @Override
    public String toString() {
        return "Car Details " +
                "color='" + color + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", isHybrid=" + isHybrid +
                ", year=" + year +
                ", doors=" + doors +
                '}';
    }
}
