public class BSIn2DArray {
  public static void main(String[] args) {
    int[][] nums = {
      {10,20,30,40},
      {15,25,35,45},
      {22,29,37,48}
    };

    int target = 29;
    System.out.println(binarySearch(nums, target));
  }

  public static int[] binarySearch(int[][] nums, int target){
    int row = 0; 
    int col = nums.length - 1;

    while(row < nums.length && col >= 0){
      if(nums[row][col] == target){
        return new int[]{row, col};
      } else if(nums[row][col] > target){
        col--;
      } else {
        row++;
      }

    }
    return new int[]{-1, -1};
  }
}
