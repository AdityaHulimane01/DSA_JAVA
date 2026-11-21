public class Search_in_2D_Array {
    public static boolean StairSearch(int arr[][] , int key){
        int row = arr.length - 1, col = 0 ;
        while(row >= 0 && col < arr[0].length){
           if(arr[row][col] == key){
                System.out.print("Key was found at the index : "+"( " + row + "," + col + " )");
                return true;
           }
           else if(key < arr[row][col]){
                row--;
           }
               col++;
               
        }
        System.out.println("The key not Found !");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        int key = 33;    
        StairSearch(arr, key);          
    }
}
