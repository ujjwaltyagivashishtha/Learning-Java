
import java.util.ArrayList;
import java.util.List;

public class Q1431b {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int maxCandies = candies[0];
        for(int i = 0; i < candies.length; i++){
          if(candies[i] > maxCandies){
            maxCandies = candies[i];
          }
        }

        for(int i = 0; i < candies.length; i++){
          if((candies[i] + extraCandies) >= maxCandies){
            result.add(true);
          } else { 
            result.add(false);
          }
        }
        

        return result;
    }
}
