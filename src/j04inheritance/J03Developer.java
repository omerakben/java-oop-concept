package j04inheritance;

import java.util.Calendar;

/**
 * Developer has an extra variable, difference than Employee>Manager
 * "String primaryLanguage"
 * NOT in the invoked super reference.
 */
public class J03Developer extends J01Employee{

    //Special for Developer and inheritance(TESTER)
    private final String primaryLanguage;

    public J03Developer(int id, String name, int birthYear, double hourlySalary , String primaryLanguage) {
        super(id, name, birthYear, hourlySalary);
        this.primaryLanguage = primaryLanguage;
    }


    @Override
    public void showPersonInfo(){
        //int year = Calendar.getInstance().get(Calendar.YEAR); // to exact year.
        //System.out.println("id :" + getId());
        //System.out.println("Name: " + getName());
        //System.out.println("Age: " + (year-getBirthYear()));
        //System.out.println("Hourly Salary: $" + getHourlySalary());

        // super.showPersonInfo is calling to the already have method for @Override
        super.showPersonInfo();
        System.out.println("Primary Language " + primaryLanguage );
    }
}
