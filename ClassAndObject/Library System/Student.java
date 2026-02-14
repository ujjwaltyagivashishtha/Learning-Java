public class Student {
  String name;
  int rollno;
  int age;

    @Override
    public String toString() {
        return "Student{" +
                "name = "+ name + 
                ", rollno = "+ rollno + 
                ", age = " + age + 
                "}";
    }

    public Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public static void main(String[] args){
      Student S1 = new Student("Ujjwal", 43, 22);
      System.out.println(S1);
    }
    
  
}
