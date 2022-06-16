package j02for_protected_example;
/**
 * Created in June 2022
 * by Omer Akben.
 * This example PROTECTED access modifier if is NOT at same PACKAGE!
 * It is not able to access only access for PUBLIC!
 */

// imported from different package!!!!!!
import j02access_modifier.J01MyCar;

public class ProtectedFields {

    public static void main(String[] args) {
        J01MyCar myCar = new J01MyCar();

        System.out.println(myCar.color);
        System.out.println(myCar.manufacture);
        System.out.println(myCar.isHybrid);
        System.out.println(myCar.year);

            //protected
        //System.out.println(myCar.insuranceHolder);
        //System.out.println(myCar.insurancePolicyNumber);

             //private
        //System.out.println(myCar.vin);
        //System.out.println(myCar.driverLicence);
    }
}
