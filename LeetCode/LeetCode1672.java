
public class LeetCode1672 {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {1, 2, 3}};
        int[][] accounts1 = {{1, 5}, {7, 3}, {3, 5}};

        int result = maximumWealth(accounts1);
        System.out.println(result);

    }

    public static int maximumWealth(int[][] accounts) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            sum = 0;
        }
        return maxSum;
    }
}
