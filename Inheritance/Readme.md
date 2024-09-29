# What is Inheritance?
Inheritance is a mechanism in which one class acquires all the properties and behavior of another class with the specific relationship


Super =>parent clas
Sub=>child class

# To improves the code reusabilty we use inheritance

# No, Java does not support multiple inheritance at the class level. In Java, a class cannot inherit from more than one class directly. 
Ex: class Admin extends Developer,Guest //can't be done


## One of the main reasons Java doesn't allow multiple inheritance with classes is the Diamond Problem, which causes ambiguity in method resolution. Let me explain this with an example.

# The Diamond Problem Example:
Imagine two classes ClassA and ClassB, both having a method display(). Now, if a class ClassC tries to inherit from both ClassA and ClassB, it would cause confusion about which version of display() should be called when invoked from ClassC.

Hypothetical Case (if Java supported multiple inheritance):

class ClassA {
    void display() {
        System.out.println("Display from ClassA");
    }
}

class ClassB {
    void display() {
        System.out.println("Display from ClassB");
    }
}

// Hypothetical multiple inheritance
class ClassC extends ClassA, ClassB {
    // Which display() should ClassC inherit?
}

public class Main {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.display();  // Ambiguity: Which display() to call? ClassA's or ClassB's?
    }
}

 # In the example above, if ClassC inherits both ClassA and ClassB, it's unclear which version of display() would be executed. This ambiguity makes it difficult for both the compiler and the developer to resolve the correct method.


 # The super keyword in Java is used to refer to the immediate parent class of the current object. It allows a subclass to access methods and variables from its parent class, including calling overridden methods and invoking parent class constructors. This is useful for enhancing or extending the functionality of inherited methods.


 # Mutlilevel Inheritance- class level
 # Multiple Inheritance and Multilevel Inheritance  - interface level