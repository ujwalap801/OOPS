
// Hierarchical Inheritance
// Definition: Multiple classes inherit from a single superclass

class A{

    void showA()
    {
        System.out.println("A class mehtod");
    }
}
 class B extends A {

    void showB(){
        System.out.println("B class method");
    }
    
}


class C extends A{
    void showC(){
        System.out.println("C class method");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.showA();
        obj.showB();// Error
        obj.showC();//Error
         System.out.println("--------------------");

        B obj1 = new B();
        obj1.showA();
        obj1.showB();
         obj1.showC();//Error
       System.out.println("--------------------");


        C obj2 = new C();
        obj2.showA();
        obj2.showB();//Error
        obj2.showC();
    }
}


// output:
// A class mehtod
// --------------------
// A class mehtod
// B class method
// --------------------
// A class mehtod
// C class method
