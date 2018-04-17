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
for (int i =0;i<numberOfStudent ;i++ ) {
  if (Student[i].equalsIgnorteCase(Student)) {
    Student[i]=null;
  }
}
  }
  public static void main(String[] args) {
  Course coursito =new Course("course");
int opc = 0;//variable del menu
  do {
    opc = Integer.parseInt(JOptionPane.showInputDialog("........menu.......\n1-create course\n2-add student\n3-show student\n4.-drop student"));
    switch(opc){
      case 1:
      String course = JOptionPane.showInputDialog("course name???");
      break;
      case 2:
      do {
          String name = JOptionPane.showInputDialog("student name??(or ´q´ to exit)");
          if (name.CharAt(0)!='q') {
            coursito.addStudent(name);
          }
      } while (name !=name.charAt(0));
      break;
      case 3:
      String[] students = coursito.getStudent();
      String output="";
      for (int i=0;i < coursito.getNumberOfStudents() ; i++ ) {
        output+="student "+(i+1)+" "+Student[i]+"\n";
      }
      JOptionPane.showMessageDialog(null,output);
      break;
      case 4:
      name = JOptionPane.showInputDialog("student´s name??");
      coursito.dropStudent(name);
      JOptionPane.showMessageDialog(null,"the student was delete");
      break;
      case 5:
      JOptionPane.showMessageDialog(null,"Bye see you take care have a nice day");
      default: JOptionPane.showMessageDialog(null,"option doesn´t exist");
    }
  } while (opc!=5);
  }
}
