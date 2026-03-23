
import java.util.Arrays;



public class Q1470 {
  public static void main(String[] args) {
    int[] nums = {1,1,2,2};
    int n = nums.length/2;
    System.out.println(Arrays.toString(shuffle(nums, n)));
  }

  public static int[] shuffle(int[] nums, int n){
    int[] result = new int[2 * n];
    int start = 0;

    for(int i = 0; i < n; i++){
        result[start++] = nums[i];
        result[start++] = nums[i + n];
    }

    // int i = 0,j = n,k = 0;

    // for(int l = 0; l < n; l++){
    //   result[i++] = nums[k];
    //   result[i++] = nums[k + n];
    //   k++;
    // }
    return result;
  }
}
