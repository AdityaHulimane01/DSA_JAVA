public class Assignment_1 {
    public static boolean checker(int arr[]) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check = true;  // update the flag
                    break;         // no need to keep checking
                }
            }
            if (check) break; // stop outer loop too
        }
        System.out.println(check); // print result
        return check;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};   // no duplicates
        checker(arr);

        int arr2[] = {1, 2, 3, 2};  // duplicate exists
        checker(arr2);
    }
}
