public class SubArray_Sum_BruteForce {
    public static void PrintSubarray(int arr[]) {
        int maxSubarray = Integer.MIN_VALUE;
         int minSubarray = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int CurrSum = 0;
                for (int k = i; k <= j; k++) {
                    CurrSum += arr[k];
                }
                System.out.println(CurrSum);
                if (CurrSum > maxSubarray) {
                    maxSubarray = CurrSum;
                }
                if (CurrSum < minSubarray) {
                    minSubarray = CurrSum;
                }
            }
        }
        System.out.println("The maximum subarray sum is : " + maxSubarray);
        System.out.println("The minimum subarray sum is : " + minSubarray);
    }

    public static void main(String[] args) {
        int arr[] = {1 , -2 , 6 , -1 ,3};
        PrintSubarray(arr);
    }
}
