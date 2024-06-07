public class LC367PerfectSquare {

    public static void isPerfectSquare(int num){
        int low = 1 ; int high = num / 2 + 1;
        boolean flag = false;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid * mid == num){
                flag = true;
                System.out.println("The num is a Perfect Square");
                break;
            }else if(mid > num / mid){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(flag == false){
            System.out.println("The num is not a Perfect Square");
        }
    }
    
    public static void main(String[] args) {
        int num  = 16;
        isPerfectSquare(num);
    }
}

// Time Complexity : O(lon n) Space Complexity : O(1)
