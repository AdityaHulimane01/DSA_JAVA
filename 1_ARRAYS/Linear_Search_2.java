public class Linear_Search_2 {
    public static int menuFinder(String menu[]){
        String Dish = "Dosa";
        for(int i = 0 ; i < menu.length ; i++){
          if(menu[i].equals(Dish)){
            return i;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"Idli" , "Dosa" , "Vada-sambar" , "Vada-Pav" , "Samosa" };
        int index = menuFinder(menu);
         if (index == -1) {
            System.out.print("Dish not found");
        } else
            System.out.print("The Dish was found at index " + index);
    }
}
