public class LC53MaximumSubarray {

    public static void printAllSubarray(int[] arr){
        int n = arr.length;
        int count = 0; // No of subbar count is ( n * (n + 1))/2
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n ; j++){
                for(int k = i ; k < j ; k++){
                    System.out.print(arr[k] + " ");
                }
                count++;
                System.out.println("");
            }
        }
        System.out.println("Count is " + count);
    }

    public static void printSubarrayMaxSum(int[] arr){
        int n = arr.length;
        int maxi = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n ; j++){
                int sum = 0;
                for(int k = i ; k < j ; k++){
                    sum = sum + arr[k];
                }
                maxi = Math.max(maxi,sum);
            }
        }
        System.out.println("Max is " + maxi);
    }

    public static void printSubarrayMaxSumBetter(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
               sum = sum + arr[j];
               maxi = Math.max(maxi,sum);
            }
        }
        System.out.println("Max is " + maxi);
    }

    public static void printSubbarrayKadeaneAlgo(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0){
            sum = 0;
            }
        }
        System.out.println("Max is " + maxi);
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        // printAllSubarray(array); Time Complexity - N ^ 3
        // printSubarrayMaxSum(array); Time Complexity - N ^ 3
        // printSubarrayMaxSumBetter(array); Time Complexity - N ^ 2
        printSubbarrayKadeaneAlgo(array); // Time Complexity - N
    }
}
