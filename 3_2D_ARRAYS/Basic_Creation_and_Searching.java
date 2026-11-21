import java.util.*;

public class Basic_Creation_and_Searching {
    public static void Insert(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static boolean Finder(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.print("The key was found At Indx : " + "( " + i + " , " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("Key not Found !");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int key = 5;
        Insert(arr);
        Finder(arr, key);

    }
}