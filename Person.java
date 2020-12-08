public class Person
{
//attributes-AKA variables
 private String name;
 private String email;
 private String phoneNumber;
  //private = only accessable in the class

  //this method will print out the values
  public void print()
  {
    System.out.println("Name = " + name);
    System.out.println("Email = " + email);
    System.out.println("Phone number =" + phoneNumber);
  }
 //Constructor--assigns values to my private variables
 public Person(String anotherName, String anotherEmail, String anotherNumber)
 {
   name = anotherName;
   email = anotherEmail;
   phoneNumber = anotherNumber;
 }

}