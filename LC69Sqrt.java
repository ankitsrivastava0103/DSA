public class LC69Sqrt {

    public static void findSqrt(int x){
        int high = x ; int low = 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid > x / mid){
                high = mid - 1;
            }else if(mid * mid == x){
                System.out.println("The Sqrt is " + mid);
                break;
            }else{
                low = mid + 1;
            }
        }
        System.out.println("The Sqrt is " + high);
    }

    public static void main(String[] args) {
        int n = 8;
        findSqrt(n);
    }
    
}

// The idea behind this is to use Binary Search to get the nearest lowest integer.
// Time Complexity : O(log n) SSpace Complexity : O(1)