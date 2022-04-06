// Java code for the Coin Change problem w/ driver code to test
public class CoinChange {
    public Integer ways(int N, int[] coins) { 
        int[] waysArr = new int[(int)N + 1];
        waysArr[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = 0; j < waysArr.length; j++) {
                if(coins[i] <= j) {
                    waysArr[j] += waysArr[(int)(j - coins[i])];
                }
            }
        }
        return waysArr[(int)N];
     }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        CoinChange cc = new CoinChange();
        System.out.println(cc.ways(4, coins));
    }
}
