public class Q81 {
  public static void main(String[] args) {
    int[] nums = {2,5,6,0,0,1,2};
    int target = 12;
    System.out.println(search(nums, target));
  }

  public static boolean search(int[] nums, int target){
    int start = 0, end = nums.length - 1;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(nums[mid] == target){
        return true;
      }

      // Handle duplicates
      if(nums[start] == nums[mid] && nums[mid] == nums[end]){
        start++;
        end--;
      }

      // Left sorted
      else if(nums[start] <= nums[mid]){
        if(nums[start] <= target && target < nums[mid]){
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }

      // Right sorted
      else {
        if(nums[mid] < target && target <= nums[end]){
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }

    return false;
  }
}