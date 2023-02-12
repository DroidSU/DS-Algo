public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(low != high){
            mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else{
                if(target < nums[mid]){
                    high = mid - 1;
                }
                else if(target > nums[mid]){
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println("Found in index: "+search(nums, target));
    }
}
