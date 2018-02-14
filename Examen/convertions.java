/************************************************************
pedro uriel de jesus cortez
convertion.java
this program convert bolivianos to dollars and vice versa
************************************************************/
import javax.swing.*;
public class convertions{
  public static void main(String[] args) {
    int converting;
    double dollar,boliviano;
    converting = JOptionPane.showInputDialog("que desea realizar \n"+"1.-dolar a boliviano\n"+"2.-boliviano a dolar").charAt(0);
    if(converting == '1'){
      dollar = Integer.parseInt(JOptionPane.showInputDialog("cuantos dolares desea converti"));
      double res = 6.86*dollar;
      JOptionPane.showMessageDialog(null,"el resultado es "+res);
    }//end if
    if (converting == '2'){
      boliviano = Integer.parseInt(JOptionPane.showInputDialog("cuantos boliviano desea convertir"));
      double res = boliviano*0.14441;
      JOptionPane.showMessageDialog(null,"el valor es "+res);
    }//en if
  }//end static
}//end class
