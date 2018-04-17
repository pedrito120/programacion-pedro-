import java.util.Date;
import javax.swing.*;
import java.util.Calendar;
public class Persona{
  //atributos
private String nombre;
private int annioNacimiento;
private char genero;
private double estatura;
private double peso;
private char estadoCivil;
//metodo

public Persona(String nombre,int annioNacimiento,char genero,double estatura,double peso,char estadoCivil){
  this.nombre=nombre;
  this.annioNacimiento=annioNacimiento;
  this.genero=genero;
  this.estatura=estatura;
  this.peso=peso;
  this.estadoCivil=estadoCivil;
}
public void caminar(){
  JOptionPane.showMessageDialog(null,"caminando");
}
public void hablar(){
  JOptionPane.showMessageDialog(null,this.nombre+" says: hello");
}
public int getEdad(){
  Calendar cal= Calendar.getInstance();
  int year= cal.get(Calendar.YEAR);
  return year-this.annioNacimiento;
}
public static void main(String[] args) {
  Persona persona1=new Persona("PEDRO",1999,'H', 1.71,80,'S');
  Persona persona2=new Persona("MARI",1986,'H',1.60,65,'C');

persona1.caminar();
persona1.hablar();
int aux =  persona1.getEdad();
JOptionPane.showMessageDialog(null, aux);

persona2.caminar();
persona2.hablar();
int aux2 = persona2.getEdad();
JOptionPane.showMessageDialog(null, aux2);

}
}
