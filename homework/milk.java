/*******************************************************************
PEDRO URIEL DE JESUS CORTEZ
milk.java
this program is for productor of Milk
*********************************/
import java.util.Scanner;

public class milk{
  public static void main(String[]args){
    int Litros;
    double LitroDeGalon =3.785;
    int PrecioDeGalon;
    double Ganancia;
    System.out.println("Cantidad de litros que produce o entregara");
    Scanner L= new Scanner (System.in);
    Litros = L.nextInt();
    double galones= Litros/LitrosDeUnGalon;
    System.out.println("Produce "+galones+" Galones");
    System.out.println("Ingrese el precio del galon");
    Scanner PG= new Scanner (System.in);
    PrecioDeUnGalon=PG.nextInt();
    Ganancia= galones*PrecioDeUnGalon;
    System.out.println("Ganancia por la entrega de la leche es de: "+Ganancia);
  }
}
