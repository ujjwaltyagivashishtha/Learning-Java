  class Book {


  String title;
  String author;
  String isBn;
  boolean isBorrowed;

  static int numberOfBooks = 0;

  Book(String title, String author, String isBn) {
    this.title = title;
    this.author = author;
    this.isBn = isBn;
    this.isBorrowed = false;
    numberOfBooks++;
  }

  void borrowBook(){
    if (!isBorrowed) {
      isBorrowed = true;
      System.out.println(title+" has been borrowed...");
      numberOfBooks--;
    } else{
      System.out.println(title+" is already borrowed...");
    }

  }

  void returnBook(){
    if(isBorrowed){
      isBorrowed = false;
      System.out.println(title + " has been returned.");
    } else{
      System.out.println(title + " was not borrowed.");
    }
  }

  static int getTotalBooks(){
    return numberOfBooks;
  }

}
