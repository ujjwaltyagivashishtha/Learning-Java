public class Main {
    public static void main(String[] args) {
        Course.setMaxCapacity(3);
        Course course = new Course("Mathematics");

        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        course.enrollStudent("Charlie");
        course.enrollStudent("David"); // This should indicate that the course is full

        course.unenrollStudent("Bob");
        course.enrollStudent("David"); // Now David can enroll
    }
}
