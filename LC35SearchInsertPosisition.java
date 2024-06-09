public class LC35SearchInsertPosisition {

    public static void searchInsert(int[] nums , int target){
        int low = 0; int high = nums.length - 1;
        while(low <=  high){
            int mid = low + (high - low) /2;
            if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println("The insert position is " + low);
    }
    
    public static void main(String[] args) {
        int[] nums = {1,3,5,6}; int target = 5;
        searchInsert(nums , target);
    }
}

// Time Complexity : O(log n) Space COmplexity : O(1)