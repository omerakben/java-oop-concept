package j04inheritance;

import java.util.Calendar;

/**
 * Tester inherited from !!Developer!! Employee --> Developer --> Tester
 * Tester have an extra field "String testFrameWork"
 * Not in the invoked super.
 * But now super has changed as like Developer fields.
 */
public class J04Tester extends J03Developer{

    //Special only for Tester
    private final String testFramework;

    public J04Tester(int id, String name, int birthYear, double hourlySalary, String primaryLanguage ,String testFramework) {
        super(id, name, birthYear, hourlySalary, primaryLanguage);
        this.testFramework = testFramework;
    }

    @Override
    public void showPersonInfo(){
        super.showPersonInfo();
        System.out.println("Test framework: " + testFramework );
    }

    //toString method belongs from OBJECT class
    @Override
    public String toString() {
        return "This toString methods inherited from Object(Super) Class";
    }
}
