
import java.util.Arrays;


public class Q1365{
  public static void main(String[] args) {
    int[] nums = {8,1,2,2,3};
    int[] result = smallerNumbersThanCurrent(nums);
    System.out.println(Arrays.toString(result));

  }
  public static int[] smallerNumbersThanCurrent(int[] nums){
    int[] count = new int[101];

    for(int num : nums){
      count[num]++;
    }
    for(int i = 1; i < 101; i++){
      count[i] += count[i-1];
    }

    int[] result = new int[nums.length];

    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 0){
        result[i] = 0;
      } else{
        result[i] = count[nums[i]-1];
      }
    }
    return result;  

  }
}