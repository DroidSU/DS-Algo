package Algorithms.Greedy_Algorithm;

public class GreedyAlgorithm {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int b = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < b ){
                b = prices[i];
            }
            else{
                if((prices[i] - b) > profit){
                    profit = prices[i] - b;
                }
            }
        }

        return profit;
    }

    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.print("Max profit: "+maxProfit(prices));
    }
}
