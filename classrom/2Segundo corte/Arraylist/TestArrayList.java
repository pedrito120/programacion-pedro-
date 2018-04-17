import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;
public class TestArrayList{
  public static void main(String[] args) {
    ArrayList<String> cityList=new ArrayList<String>();
    cityList.add("London");
    cityList.add("New York");
    cityList.add("Paris");
    cityList.add("Tokyo");
    cityList.add("Miami");

    JOptionPane.showMessageDialog(null, "List size:" + cityList.size());

    JOptionPane.showMessageDialog(null, "Is Miami in this list? "+ cityList.contains("Miami"));

    JOptionPane.showMessageDialog(null, "The location of Paris is "+ cityList.indexOf("Paris"));

    JOptionPane.showMessageDialog(null, "Is this list empty? "+ cityList.isEmpty());

    cityList.remove("London");
  }
}
