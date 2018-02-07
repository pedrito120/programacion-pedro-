/***********************************************************
pedro uriel de jesus cortez
PrintPurchaseOrderGui.java
print program calculates and prints a purchase order report
*************************************************************/

import javax.swing.JOptionPane;
public class PrintPurchaseOrderGui{
  public static void main(String[]args ){
    String itemName; //name of purchase item
    double price; //price of purchase item
    int quantity; //number of items purchase
    itemName = JOptionPane.showInputDialog("Enter name of purchase");
    price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of one item"));
    quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
    JOptionPane.showMessageDialog(null, "PURCHASE ORDER: \n\n"+"item;"+itemName+"\nprice;"+price+"\nquantity;"+quantity+"\nTotal= $"+price*quantity);
  }//end main
}//end class
