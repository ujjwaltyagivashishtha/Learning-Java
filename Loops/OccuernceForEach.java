public class OccuernceForEach{
  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50,60,70,80,90,50,30,10,10,45,10,10,3,1};
    int num = 10;

    Occurence(arr, num);
  }

  public static void Occurence(int []arr, int num){
    int count = 0;
    for(int i : arr){
      if(i == num){
        count++;
      }
    }
    System.out.println("Occurence : "+count);
    }
}