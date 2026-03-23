public class LeetCode1295 {

  public static void main(String[] args) {
    int[] nums = { 555, 901, 482, 177 };

    int result = findNumbers(nums);
    System.out.println(result);
  }

  public static int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {

      if (countsDigits(num) % 2 == 0) {
        count++;

      }
    }
    return count;
  }

  public static int countsDigits(int num) {
    if (num == 0) return 1;
    return (int)Math.log10(num) + 1;
  }
}
