# Approach
<!-- Describe your approach to solving the problem. -->
Solution Steps

- Initialize j = 0.
- Run a for loop from i = 0 to n-1.
- At each iteration, if (A[i] != 0), swap A[j] and A[i] and increment j by 1.

The non-zero numbers will be pushed to the end of the array.

## Complexity

- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

## Code

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j+=1;
            }
        }
    }
}
```
