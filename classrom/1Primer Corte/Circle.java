/*****************************************************************************
Circle.java
Pedro uriel de jesus cortez
thus class calculates the area of a circle
**************************************************************************/
import javax.swing.*;
public class Circle{
  //propierties
  private double Radius;

  //methods
  public void setRadius (double radius){
    this.Radius=radius;
  }
  public void getRadius(){
    return this.Radius;
  }
  public double getArea(){
    return Math.pow(this.Radius, 2)* Math.PI;
  }
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(3.14);
    JOptionPane.showMessageDialog(null, circle.getArea());
  }//end main
}//enD CLASS
