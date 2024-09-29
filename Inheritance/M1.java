package Inheritance;
class Animal{
  
    // Method in parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}


// CHILD CLASS
class Dog extends Animal {
    // Overriding the parent class method
    @Override
    public void sound() {
        // Using 'super' to call the parent class's method
        super.sound();
        System.out.println("Dog barks");
    }

    // Additional method in child class
    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class M1 {
    public static void main(String[] args) {
        
    // Create an object of the Dog class
    Dog d= new Dog();
     // Call the overridden sound() method
    d.sound();     // Calls both parent class's and child class's version of sound()
 
    
     // Call the fetch method specific to Dog class
     d.fetch();

}
}
