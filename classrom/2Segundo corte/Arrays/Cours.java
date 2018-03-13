import javax.swing.*;
public class Course{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudent;
  public Course(){
  this.coursename=courseName;

  }
  public String getCourseName(){
    return this.courseName;
  }
  public void addStudent(String student){
    students[numberOfStudent]=student;
    numberOfStudent++;
  }
  public String[] getStudent(){
    return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudent;
  }
  public void dropStudent(String student){

  }
  public static void main(String[] args) {
    Course coursito=new Course ("programming");
    coursito.addStudent("fulanito");
    cousrito.addStudent("yamalito");
    coursito.addStudent("clon de sombra ");
    JOptionPane.showMessageDialog(null,"number of students"+coursito.get());
  }
}
