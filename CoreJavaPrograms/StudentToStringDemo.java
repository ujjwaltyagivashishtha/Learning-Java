// Define a Student class with fields like name and age, and use toString to print student details.
public class StudentToStringDemo {
  String name = "Ujjwal";
  int age = 21;

  @Override
  public String toString(){
    return "Name : " +name+ ", Age : "+ age;
  }

  public static void main(String[] args){
    StudentToStringDemo student = new StudentToStringDemo();

    System.out.println(student.toString());
    
  }

}

