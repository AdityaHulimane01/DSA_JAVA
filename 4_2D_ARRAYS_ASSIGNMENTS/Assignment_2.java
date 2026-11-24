public class Assignment_2 {
     public static int counter(int arr[][]){
       int sum = 0;
       for(int i = 1 ; i <= 1 ; i++){
        for(int j = 0 ; j < arr[1].length ; j++){
           sum += arr[i][j];
        }
       }
       System.out.print("The sum of the 2nd row is : ");
       return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1 , 4 , 9} , {11 , 4 , 3} , {2 , 2 , 3}};
        System.out.println(counter(arr));
    }
}
