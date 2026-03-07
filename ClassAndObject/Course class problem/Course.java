class Course {

    String courseName;
    String[] enrolledStudents;
    static int maxCapacity;

    public Course(String courseName){
        this.courseName = courseName;
        enrolledStudents = new String[maxCapacity];
    }

    public void enrollStudent(String studentName){
        for(int i = 0; i < enrolledStudents.length; i++){
            if(enrolledStudents[i] == null){
                enrolledStudents[i] = studentName;
                System.out.println(studentName + " has been enrolled in " + courseName);
                return;
            }
        }
        System.out.println("Cannot enroll " + studentName + " in " + courseName + ". Course is full.");
    }

    public void unenrollStudent(String studentName){
        for(int i = 0; i < enrolledStudents.length; i++){
            if(enrolledStudents[i] != null && enrolledStudents[i].equals(studentName)){
                enrolledStudents[i] = null;
                System.out.println(studentName + " has been unenrolled from " + courseName);
                return;
            }
        }
        System.out.println(studentName + " is not enrolled in " + courseName);
    }

    public static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }
}