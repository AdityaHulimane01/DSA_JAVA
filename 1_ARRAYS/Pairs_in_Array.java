public class Pairs_in_Array {
    public static void Pairs(int arr[]){
        int TP = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int curr = arr[i];
            for(int j = i+1 ; j < arr.length ; j++){
                System.out.print("(" + curr + " , " + arr[j] + ") ");
                TP ++;
            }
            System.out.println();
        }
        System.out.println("The total pairs are : " + TP );
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 , 8 , 10};
        Pairs(arr);
    }
}
