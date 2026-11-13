public class Buy_and_Sell_Stock {
    public static int BuySellStock(int Prices[]){
      int buyPrice = Integer.MAX_VALUE;
      int maxProfit = 0;

      for(int i = 0 ; i < Prices.length ; i++){
          if(buyPrice < Prices[i]){
             int profit = Prices[i] - buyPrice;
             maxProfit = Math.max(maxProfit, profit);
          } else {
            buyPrice = Prices[i];
          }
      }
     return maxProfit;
    }
    public static void main(String[] args) {
        int Prices[] = {7 , 1 , 5 , 3 , 6 , 4};
       System.out.println(BuySellStock(Prices)); 
    }
}
