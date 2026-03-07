// Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

public class StringConcatenateUppercase {
  public static void main(String[] args) {
    String str1 = "Ujjwal";
    String str2 = "Tyagi";

    String concatStr = str1 + " " + str2;
    String uppercaseStr = concatStr.toUpperCase();

    System.out.println("Concatenated String: " + concatStr);
    System.out.println("Uppercase String: " + uppercaseStr);
  }
}
