public class LC441ArrangingCoins {

    public static void arrangeCoins(int n){
        int ans = 0; int inc = 1;
        while(n > 0){
            ans++;
            inc++;
            n = n - inc;
        }
        System.out.println("The ans is " + ans);
    }
    
    public static void main(String[] args) {
        int n = 100;
        arrangeCoins(n);
    }
}

// Time COmplexity : O(sqrt n) Space Complexity : O(1)