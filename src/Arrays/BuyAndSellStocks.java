package Arrays;

public class BuyAndSellStocks {
    public static void calculate() {
        int[] array={7,1,5,3,6,4};
        int bp=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<bp){
                bp=array[i];
            }
            profit=Math.max(profit,array[i]-bp);
        }
        System.out.println("Maximum profit : "+profit);
    }
}
