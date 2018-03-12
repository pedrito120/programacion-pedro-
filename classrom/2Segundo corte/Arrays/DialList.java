/********************************************************
DialList.java
pedro uriel de jesus cortez
this program creates a cell phone dial phone number liste and prints the created list
*****************************************************/
import javax.swing.*;
public class DialList{
  public static void main(String[] args) {
    long[] phoneList; //list of phone number
    int sizeList; //number of phone number
    long phoneNum; //an entered phone number

    sizeList = Integer.parseInt(JOptionPane.showInputDialog("how mny phone numbers would you like to enter??"));
    phoneList=new long[sizeList];
    for (int i=0; i<sizeList ;i++ ) {
      phoneNum=Long.parseLong(JOptionPane.showInputDialog("enter a phone number "));
      phoneList[i]=phoneNum;

    }
    for (int i=0 ; i < sizeList ;i++ ) {
      JOptionPane.showMessageDialog(null,"Index: "+i+" element number:"+(i+1)+" phone number: "+phoneList[i]);
    }
  }
}
