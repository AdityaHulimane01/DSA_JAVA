public class Assignment_3 {
    public static void Transpose(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        // New matrix with swapped dimensions
        int transposed[][] = new int[cols][rows];

        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            { 4, 7, 8 },
            { 8, 8, 7 }
        };

        System.out.println("Original Matrix:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        Transpose(arr);
    }
}
