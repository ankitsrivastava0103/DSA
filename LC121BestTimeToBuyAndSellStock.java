public class LC121BestTimeToBuyAndSellStock {
    
    public static void maxProfit(int[] pricies){
        int lowestSoFar = Integer.MAX_VALUE;
        int maxProfit = 0; int maxProfitSoldNow = 0;
        for(int i = 0; i < pricies.length; i++){
            lowestSoFar = Math.min(lowestSoFar , pricies[i]);
            maxProfitSoldNow = pricies[i] - lowestSoFar;
            maxProfit = Math.max(maxProfit, maxProfitSoldNow);
        }
        System.out.println("Max Profit " + maxProfit);
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
}

// The idea is to find out the lowset at evry step along with the profit if sold it now .
// And a variable to store thr max profit possible at every step
// Time Complexity : O(n) Space Complexity : O(1)