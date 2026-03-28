public class Q744 {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };
    char target = 'a';

    char result = nextGreatestLetter(letters, target);
    System.out.println(result);
  }

  public static char nextGreatestLetter(char[] letters, char target) {
    int start = 0, end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (letters[mid] <= target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    // wrap-around case
    return letters[start % letters.length];
  }
}
