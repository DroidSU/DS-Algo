package Algorithms.Kadanes_Algorithm;

public class MaxSubArray {
    public static void main(String args[]){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sub array value : " + maxSubArray(nums));
    }
    
    private static int maxSubArray(int[] nums) {
        int totalSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            
            currentSum += nums[i];
            
            if(currentSum > totalSum){
                totalSum = currentSum;
            }
        }

        return totalSum;
    }
}
