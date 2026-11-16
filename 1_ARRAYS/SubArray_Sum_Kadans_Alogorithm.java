public class SubArray_Sum_Kadans_Alogorithm {
  
    public static void PrintSubarray(int arr[]) {

        int currSum  = 0 , MaxSum = Integer.MIN_VALUE , MinSum = Integer.MAX_VALUE; 

        for(int i = 0 ; i < arr.length ; i++){
           currSum += arr[i];
           if(currSum < 0){
            currSum = 0;
           }
        MaxSum = Math.max(MaxSum, currSum);
        MinSum = Math.min(MinSum , currSum);
      }

        System.out.println("The maximum subarray sum is : " + MaxSum);
        System.out.println("The minimum subarray sum is : " + MinSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2 , -3 , 4 , -1 ,-2 , 1 , 5 , -3};
        PrintSubarray(arr);
    }
}
