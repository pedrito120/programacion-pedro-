/************************************************
* Salaried.java
* Author Pedro uriel de jesus cortez
*
*/
public class Salaried extends Employee{

  private double salary;

  public Salaried(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public double getPay() {
    return this.salary;
  }
}
