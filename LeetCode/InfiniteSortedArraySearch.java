public class InfiniteSortedArraySearch {

  public static void main(String[] args) {
    int[] nums = {2, 3, 5, 7, 9, 10, 13, 15, 18, 21, 25, 30, 35};
    int target = 18;

    int ans = searchElement(nums, target);
    System.out.println("Index : "+ans);
  }
  
  public static int searchElement(int[] nums, int target) {
    int start = 0;
    int end = 1;

    // Find out the range of target
    while(end < nums.length - 1 && target > nums[end]){
        int newStart = end + 1;
        end = end + (end - start + 1) * 2;
        start = newStart;
    }
    return binarySearch(nums, target, start, end);
  }

  public static int binarySearch(int[] nums, int target, int start, int end){
    while(start <= end){
      int mid = start + (end - start)/2;

      if(target == nums[mid]){
        return mid;
      } else if(target > nums[mid]){
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
