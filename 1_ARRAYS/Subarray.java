public class Subarray {
    public static void PrintSubarray(int arr[]) {
        int TS = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                TS++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are : " + TS);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PrintSubarray(arr);
    }
}
