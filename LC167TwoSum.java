public class LC167TwoSum {
    public static void twoSumTowPointer(int[] arr , int target){
        int start = 0; int end = arr.length - 1 ;
        while(start <= end){
            if(arr[start] + arr[end] == target){
                System.out.println("The Index are : " + start + " " + end);
                break;
            }else if(arr[start] + arr[end] > target){
                end--;
            }else{
                start++;
            }
        }
        System.out.println("No such pair found");
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15}; int target = 9;
        twoSumTowPointer(arr, target);
    }
    
}
