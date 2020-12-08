class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //objects have attributes (properies) and methods (Behaviors)
    //objects created from classes
    //classes serve as blueprints for our objects

    //p1 object created from Person class
    Person p1 = new Person("Katelynn","Katelynn.lauricello@patelhs.org","782-298-149");
    //p2 object created from Person class
    Person p2 = new Person("Sam","sammy@patelhs.org","393-984-1809");


    //calling the print methd through both objects
    p1.print();
    p2.print();







  }
}