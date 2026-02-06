public class MinAndMax {
  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50,60,70,80,90,50,30,10,10,45,10,10,3,1};

    int min = Min(arr);
    System.out.println("Minimum : "+min);

    int max = Max(arr);
    System.out.println("Maximum : "+max);

    
  }
  public static int Min(int []arr){
    int min = 0;
    min = arr[0];
    for(int i = 0; i < arr.length;i++){
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }

  public static int Max(int []arr){
    int max = 0;
    max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
