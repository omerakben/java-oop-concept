package j02access_modifier;


/**
 * Created in June 2022
 * by Omer Akben.
 * This example for understanding public vs private access modifier difference.
 * Follow the J01 - J02 - J03 sequence it will help to understanding.
 */
public class J01MyCar {

    // easily it can be access all classes.
    public String color = "Blue";
    public String manufacture = "Hyundai";
    public boolean isHybrid = true;
    public int year = 2020;

    // it can be access same package.
    protected String insuranceHolder = "Progressive";
    protected String insurancePolicyNumber = "987PPS123";

    // ONLY access same class!!!
    private String vin = "123ASD456YUIY789JLKJ";
    private String driverLicence = "ABC123DE";

}
