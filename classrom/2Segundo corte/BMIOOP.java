/*************************************************************************
BMIOOP.java
pedro uriel de jesus cortez
this class calculates the body mass index

****************************************************************************/
public class BMIOOP{
  //properties - attributes
  private String  name;
  private int age;
  private double weight,height;
  private double KILOGRAM_PER_POUND=0.45359237;
  private double METERS_PER_INCH=0.0254;
  //methods - actions
  public void setName(String name ){
    this.name=name;
    }
    public String getName(){
      return this.name;
    }
    public void setAge(int age){
      this.age=age;
    }
    public int getAge(){
      return this.age;
    }
    public void setWeight(double weight){
      this.weight=weight;
    }
    public double getWeight(){
      return this.weight;
    }
    public void setHeight(double height){
      this.height=height;
    }
    public double getHeight(){
      return this.height;
    }
    //***********************************
    public double getBMI(){

      double BMI=this.weight*KILOGRAM_PER_POUND/((this.height*METERS_PER_INCH)*(this.height*METERS_PER_INCH));
      return Math.round((BMI*100)/100);

    }
    public String getStatus(){
      double BMI = getBMI();
      if (BMI<16){
        return "seriously underweight";
      }else if (BMI<18){
        return "underweight ";
      }else if(BMI<24){
        return "normal weight";
      }else if(BMI<29){
        return "over weight";
      }else if(BMI<35){
        return "seriously overweight";
      }else {
        return "gravely overweight";
      }

    }
}//end class
