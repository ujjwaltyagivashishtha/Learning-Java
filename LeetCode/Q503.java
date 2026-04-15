
import java.util.Arrays;
import java.util.Stack;

public class Q503 {

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i % nums.length];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); // Output: [2, -1, 2]
    }
}
