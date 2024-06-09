public class LC1539KthMissingNo {

    public static void findKthNoLoop(int[] arr , int k){
        for(int num : arr){
            if(num <= k){
                k++;
            }else{
                break;
            }
        }
        System.out.println("The ans is " + k);

    }

    public static void findKthNo(int[] arr , int k){
        int low = 0; int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] - (mid + 1) >= k){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println("The ans is " + (low + k));
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11} ; int k = 5;
        findKthNoLoop(arr,k);
        findKthNo(arr, k);
    }
    
}

// The first Approach is O(n)
// The idea is if we get any number less than k the possible missing number will be more the the current slue of k.
// If we dont get a number less than k that means k is our missing element.
// For eample if our array starts from 8 and we have to find the 3 rd missing number , our ans will be 3 itsel.
// If our array has 2 , 8 and we have to find the 3rd missing number and we already have a number less than it so we will inc our ans and it will be 4.

// The second Approch is O(log n)
// Simply we find the index of where the number could have been possible as it is sorted and add the number to it to finish it up.