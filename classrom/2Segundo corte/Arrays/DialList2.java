/**********************************************************
dialList2.java
pedro uriel de jesus cortez
this program cretae  dial phone number list nd prints the created list.it usue a partially filled array
***********************************************************/
import javax.swing.*;
public class DialList2{
  public static void main(String[] args) {
    String[] phoneList=new long[100]; //declaracione inicializacion
    int filledNumbers=0;//number of phone
    String phoneNum;//an entered phone number
    phoneNum=JOptionPane.showInputDialog("enter a phone number(or press q to QUIT)");
    while (!phoneNum.equalsIgnoreCase("q") && filledNumbers<phoneList.length){
      if(phoneNUm.length()<1 || phoneNUm.length()>10){
        JOptionPane.showMessageDialog(null,"Must enter a valid numebr (10 characters) ");
        
      }
    }
  }
}
