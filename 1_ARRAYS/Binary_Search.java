public class Binary_Search {
    public static int Finder(int arr[] , int key){
        int start = 0 , end = arr.length-1 , mid = arr.length/2;
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                   start = mid+1;
            }
            else{
                 end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 4 , 6 , 8 , 10 , 12 , 14};
        int key = 8;
        System.out.println("The key has found at index "+Finder(arr , key));
    }
}
