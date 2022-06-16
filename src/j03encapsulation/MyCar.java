package j03encapsulation;

/**
 * Created in June 2022
 * by Omer Akben.
 * "new" keyword means create new object!
 * It is help to invoking different already defined classes.
 */
public class MyCar {

    public static void main(String[] args) {

        /*
        If it does NOT have a constructor method;
        myCar.setColor("Blue");
        myCar.setManufacture("Hyundai");
        myCar.setIsHybrid(true);
        etc. Need to declaration with setter method.
         -- All setting fields in one line constructor method --
         */
        Car myCar = new Car("Blue", "Hyundai", true, 2020, 4);

        Car emptyCar = new Car();

        //Calling to the toString method.
        System.out.println(myCar.toString());

        //Setting to the already declared value in the constructor.
        myCar.setColor("Red");
        //Only getting to the new color value.
        System.out.println(myCar.getColor());
        //Now myCar color value is changed in setter method.
        System.out.println(myCar.toString());


    }
}
