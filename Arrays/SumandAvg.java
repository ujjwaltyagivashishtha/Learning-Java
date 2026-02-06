public class SumandAvg {
  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};

    int sum = Sum(arr);
    System.out.println("Sum : "+sum);

    int avg = Avg(arr);
    System.out.println("Average : "+avg);

  }

  public static int Sum(int arr[]){
    int sum = 0;
    for(int i=0; i<arr.length; i++){
      sum = sum + arr[i];
    }

    return sum;

  }
  
  public static int Avg(int[] arr){
    int avg = 0;
    int sum = Sum(arr);
    avg = sum / arr.length;
    return avg;
  }
}
