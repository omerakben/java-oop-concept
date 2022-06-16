package j04inheritance;

/**
 * Inherited to super class(Employee) need to create "new" Object.
 * As you can see, doesn't have any System.out.println - but calling to showPersonInfo method already included for printing.
 * Manager, getting info method directly Employee(super class).
 * Developer , have extra one filed(primaryLanguage) in this scenario Developer has @Override annotations.
 * Tester inherited from Developer but has a specific field(testFrameWork). So extra one @Override annotations for tester.
 *
 */
public class J05Main {

    public static void main(String[] args) {

    J02Manager mng1 = new J02Manager(1234, "Obid", 1975, 100);

    J03Developer dv1 = new J03Developer(2345,"Omonjon", 1994, 90,"Java");
    J03Developer dv2 = new J03Developer(3456,"Dmytro", 1990, 85, "JavaScript");

    J04Tester ts1 = new J04Tester(9876, "Omer", 1990, 70, "Java", "testNG");
    J04Tester ts2 = new J04Tester(9875, "Tatiana", 1995,72.5,"Java","JUnit");
    J04Tester ts3 = new J04Tester(9874, "Farajulla", 1992,77.5,"PHP","testNG");


    mng1.managerSpecialMethod("TechCenture");
    mng1.showPersonInfo();

    dv1.showPersonInfo();
    dv2.showPersonInfo();

    ts1.showPersonInfo();
    ts2.showPersonInfo();
    ts3.showPersonInfo();

    }
}
