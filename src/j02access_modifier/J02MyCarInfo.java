package j02access_modifier;

/**
 * Created in June 2022
 * by Omer Akben.
 * Same package or different package(check : j02for_protected_example)
 */

public class J02MyCarInfo {
    public static void main(String[] args) {

        //Calling Fields (or Properties) different class at the same package
        J01MyCar myCar = new J01MyCar();

        System.out.println(myCar.color);
        System.out.println(myCar.manufacture);
        System.out.println(myCar.isHybrid);
        System.out.println(myCar.year);

        System.out.println(myCar.insuranceHolder);
        System.out.println(myCar.insurancePolicyNumber);

        //System.out.println(myCar.vin);
        //System.out.println(myCar.driverLicence);


    }
}
