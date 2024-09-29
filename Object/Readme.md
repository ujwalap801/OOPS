# Object is an instance of class
we can have many objects in a class

An object is a real-world entity.
An object occupies memory.
Every object created is different from other object
An object consists of:


- **Identity:** Name
- **State/Attribute:** Color, breed, age
- **Behavior:** Eat, run

### How to create an object:
- Using the `new` keyword
- Using the `clone()` method
- Using the `newInstance()` method
- Through deserialization and factory methods

### Object instantiation:
- By reference variable
- By using a method
- By using a constructor

# In Java, we commonly use the new keyword in conjunction with constructors to create objects for several key reasons:

Simplicity and Clarity: The new keyword clearly indicates that a new instance of a class is being created. This straightforward approach enhances code readability, making it easy for other developers to understand what is happening at a glance.

Direct Control Over Initialization: Constructors allow us to initialize object attributes at the time of instantiation. This means we can pass parameters to constructors, ensuring that objects are created in a specific and valid state.


# By Reference Variable: Create an object and assign it to a reference variable for further use.

# By Using a Method: Encapsulate the logic for creating an object within a method and return it.

# By Using a Constructor: Directly instantiate an object using a constructor, which may be assigned to a reference variable.



# class_name obj_name = new class_name()
here class_name =>class name
    obj_name =>object 
    new =>Dynamic memory Alloction
    class_name() =>constructor