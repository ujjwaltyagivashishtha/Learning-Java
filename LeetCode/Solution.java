class GuessGame {
    int pick = 6; // hidden number

    public int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return 1;
        else return -1;
    }
}

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int res = guess(mid);

            if (res == 0) return mid;
            else if (res == 1) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.guessNumber(10)); // Output: 6
    }
}