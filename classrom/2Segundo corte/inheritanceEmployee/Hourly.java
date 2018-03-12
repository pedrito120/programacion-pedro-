/***********************************************
* Hourly.java
* Author Pedro uriel de jesus cortez
*
*/
public class Hourly extends Employee {

  private double hourlyRate = 150;
  private double hours;

  public Hourly(String name, double hours) {
    super(name);
    this.hours = hours;
    }

  public double getPay() {
    double pay = hourlyRate * hours;
    return pay;
  }

  public void addHours (double hours) {
    this.hours += hours;
  }
}
