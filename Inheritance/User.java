package Inheritance;


//  PARENT CLASS
class Guest{
  public void read()
  {
   System.out.println("Read code updated");
  
  }
  
}

// CHILD CLASS
class Developer extends Guest{

 public void write()
 {
  System.out.println("Write code");
 }
}

// CHILD CLASS
class Admin extends Developer{
 
  public void manage()
  {
    super.read();
    System.out.println("Manage code");
  } 

  public void read()
  {
    System.out.println("Admin read code");
  }

}

public class User {

  public static void main(String[] args) {
    Guest g = new Guest();
    g.read();

    Developer d= new Developer();
    d.read();
    d.write();

    Admin a = new Admin();
    a.read();
    a.write();
    a.manage();

  }
}



// output:

// Read code updated   // Guest's read() called


// Read code updated   // Developer's read() (inherited from Guest)
// Write code          // Developer's write()

// Admin read code     // Admin's overridden read() method
// Write code          // Developer's write() method

// Read code updated   // super.read() calls Guest's read()
// Write code          // Developer's write()
// Manage code         // Admin's manage() method
