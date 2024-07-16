package ARRAYS;

public class BestDaySellAStock {
    public static int Maxprofit(int[] prices){
       
        int low = prices[0];
        int high = 0;
        int index = 0;
         for(int i=0;i<prices.length;i++){
            if(prices[i] < low){
                low = prices[i];
                index = i;
            }else{
                low  =0;
            }
        }
        for(int i=index;i<prices.length;i++){
            if(prices[i] > low){
                high = prices[i];
            }
        }

        return (high - low);
        
    }

    public static void main(String[] args) {
        int[] Prices = {7,6,5,4,3,1};
        int result = Maxprofit(Prices);
            System.out.println(result);
    }
}