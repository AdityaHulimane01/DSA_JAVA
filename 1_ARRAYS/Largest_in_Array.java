public class Largest_in_Array {
    public static int Finder(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The samllest value is " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 8 };
        System.out.println("The largest value is " + Finder(arr));
    }
}
