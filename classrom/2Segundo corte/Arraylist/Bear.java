/********************************************************
* Project: Bear.java
* Author: Yamal Marquez Cuevas
*
*/
import javax.swing.*;
import java.util.ArrayList;
public class Bear{

  private String MAKER; //bear´s manufacter
  private String TYPE;// type of bear

  public Bear(String maker, String type) {
    this.MAKER = maker;
    this.TYPE = type;
  }

  public void Display() {
    JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
  }
/*
  public Strig Menu() {
    String optionList = "---MENU--- \n1: ADD Bear \n2: SEARCH Bear \n3: REMOVE Bear \n4: SHOW Bears \n5: EXIT";
  }
*/
  public static void main(String[] args) {
    ArrayList<Bear> teddyBearStore = new ArrayList<Bear>();

    do{
      int opc = Integer.parseInt(JOptionPane.showInputDialog("---MENU--- \n1: ADD Bear \n2: SEARCH Bear \n3: REMOVE Bear \n4: SHOW Bears \n5: EXIT"));
      switch(opc){
        case 1:
        String maker=JOptionPane.showInputDialog("Maker?");
        String type=JOptionPane.showInputDialog("Type?");
        Bear winniePoo=new Bear(maker, type);
        teddyBearStore.add(winniePoo);
        break;
        case 2:
        int index=Integer.parseInt(JOptionPane.showInputDialog("Index?"));
        teddyBearStore.get(index).display();
        break;
        case 3:
        index=Integer.parseInt(JOptionPane.showInputDialog("index to remove"));
        break;
        case 4:
        for (Bear bear : teddyBearStore){
          bear.display();
        }
        break;

      }
     opc = Integer.parseInt(JOptionPane.showInputDialog("---MENU--- \n1: ADD Bear \n2: SEARCH Bear \n3: REMOVE Bear \n4: SHOW Bears \n5: EXIT"));

  } while(opc != 5);
 }
}
