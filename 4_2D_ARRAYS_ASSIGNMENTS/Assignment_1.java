public class Assignment_1 {
    public static int counter(int arr[][] , int key){
       int counter = 0;
       for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[0].length ; j++){
            if(arr[i][j] == key){
                counter ++;
            }
        }
       }
       System.out.print("The total number of the 7s present in the 2D array is : ");
       return counter;
    }
    public static void main(String[] args) {
        int arr[][] = {{4 , 7 , 8} , {8 , 8 , 7}};
        int key = 7;
        System.out.println(counter(arr , key));
    }
}
