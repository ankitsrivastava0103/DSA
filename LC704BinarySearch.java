public class LC704BinarySearch {
    public static void search(int[] nums , int target){
        int low = 0; int high = nums.length - 1;
        boolean found = false;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                System.out.println("The index of number is " + mid);
                found = true;
                break;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(found == false){
            System.out.println("The number is not present.");
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12}; int target = 9;
        search(nums,target);
    }
}

// Time Complexity : O(log n) Space Complexity : O(1)
