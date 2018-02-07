/*******************************
PEDRO URIEL DE JESUS CORTEZ
ground.java

this program prints the area of a ground
*/
public class ground{
  public static void main(String[]args ){
    double a=25, b=10, c=15;
    double areaOftriangle=((a-c)*b)/2;
    double areaOfrectangle=b*c;
    double totalArea=areaOftriangle+areaOfrectangle;
    System.out.println("the total area is ="+totalArea);
  }//end void main
}//end public class
