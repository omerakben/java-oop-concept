package j07polymorphism.Basic;
/**
 * Created in June 2022
 * by Omer Akben.
 * Polymorphism a pattern is OOP in which classes have different functionality while sharing a common interface.
 * Subclass(Dog,Cat,Bird etc.) has a one Parent(Animal) class.And parent can a method(Speak) but subclasses need to modified this method for themselves.
 * Dog can bark, Cat can meow, Bird can tweet all over this action are coming a common(speak) action.
 */

class Animal{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println(getName() + " can talk!");
    }
}//end Animal(Parent) class

// Subclasses ------------------ //
// Subclass (extends)!!
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " can BARK !");
    }
}
// Subclass (extends)!!
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " can MEOW !");
    }
}
// Subclass (extends)!!
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " can TWEET !");
    }
}

public class Main {
    public static void speakWithPolymorphism (Animal animal){
        animal.speak();
    }

    public static void main(String[] args) {


        //Animal inherited to Bird,Dog and Cat
        Animal animal1 = new Animal("Any animal");

        //With same class name instantiate a object.
        Bird smallBird = new Bird("Lovebirds");

        //Instantiate with parent class!
        Animal littleDog = new Dog("Finley");

        //Object class is for all classes parent class.But Object class do NOT have speak() method for this case need to CASTING!
        Object fatCat = new Cat("Duckie");

        animal1.speak();
        smallBird.speak();

        //Class casting!
        ((Dog) littleDog).speak();
        ((Cat) fatCat).speak();


        System.out.println("=== Polymorphism example ===");
        // Polymorphism can be used to collect similar behaviors. One method(!before main method!) for all subclasses!
        speakWithPolymorphism(new Bird("Red Head"));
        speakWithPolymorphism(new Dog("Brave"));
        speakWithPolymorphism(new Cat("Quinny"));


    }//end main
}
