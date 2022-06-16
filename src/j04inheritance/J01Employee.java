package j04inheritance;

import java.util.Calendar;

/**
 * Created in June 2022
 * by Omer Akben.
 * J01Employee fields will be super class it means all generic data can hold.
 * Not make sense to putting specific data in the super class.
 * When inherit subclass as a J02Manager, developer, tester should have ID,Name,Age,Hourly Salary etc.
 */
public class J01Employee {
    //final keyword here for id, name and birthYear are NOT changeable, only once declaration.
    private final int id;
    private final String name;
    private final int birthYear;
    private double hourlySalary;

    public J01Employee(int id, String name, int birthYear, double hourlySalary) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.hourlySalary = hourlySalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public void showPersonInfo(){
        int year = Calendar.getInstance().get(Calendar.YEAR); // to exact year.
        System.out.println("========================================");
        System.out.println("id :" + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + (year-birthYear));
        System.out.println("Hourly Salary: $" + hourlySalary);
    }
}
