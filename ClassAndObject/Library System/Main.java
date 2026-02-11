public class Main {
  public static void main(String[] args) {
    Book book1 = new Book("Java", "James", "101");
    Book book2 = new Book("Python", "Guido", "102");
    Book book3 = new Book("C Programming", "Dennis Ritchie", "103");
    Book book4 = new Book("Data Structures", "Mark Allen", "104");
    Book book5 = new Book("Operating System", "Galvin", "105");

    System.out.println(Book.getTotalBooks());

    
  }
}
