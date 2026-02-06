public class ArraySortedOrNot {
  public static void main(String[] args) {
    int arr1[] = {10,20,30,40,50,60,70,80,90,50,30,10,10,45,10,10,3,1};
    int arr2[] = {1,2,3,4,5,6,7,8,9};

    

    boolean result1 = Check(arr1);

    
    boolean result2 = Check(arr2);

    if(result1){
      System.out.println("Array 1 is sorted...");
    } else {
      System.out.println("Array 1 is not sorted...");
    }

    if(result2){
      System.out.println("Array 2 is sorted...");
    } else {
      System.out.println("Array 2 is not sorted...");
    }





  }
  public static boolean Check(int arr[]){
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i]>arr[i+1]){
        return false;
      }
    }

    return true;
  }
}
