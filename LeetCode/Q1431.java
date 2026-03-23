import java.util.ArrayList;
import java.util.List;

public class Q1431 {

  public static void main(String[] args) {
    int[] candies = {4,2,1,1,2};
    int extraCandies = 1;
    System.out.println(kwc(candies, extraCandies));
  }
  public static  List<Boolean> kwc(int[] candies, int extraCandies) {
    List<Boolean> list = new ArrayList<>();

    int max = candies[0];
    for (int c : candies) {
      if (c > max) {
        max = c;
      }
    }

    for (int c : candies) {
      if ((c + extraCandies) >= max) {
        list.add(true);
      } else {
        list.add(false);
      }
    }

    return list;
  }
}
