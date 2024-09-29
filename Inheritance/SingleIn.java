package Inheritance;

    class A{

        void showA()
        {
            System.out.println("A class mehtod");
        }
    }
    public class SingleIn extends A {
    
        void showB(){
            System.out.println("B class method");
        }
        public static void main(String[] args) {
            A obj = new A();
            obj.showA();  //A class method is output
    
            //obj.showB();//show erros
    
           SingleIn obj1 = new SingleIn();
           obj1.showB();   //B class method is output
           
            }
    }

