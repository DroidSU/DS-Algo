## Kadane's Algorithm
 Kadane's algorithm is used to find the largest sum of the maximium contiguos subarray.

 The idea of Kadane’s algorithm is to maintain a variable `max_ending_here` that stores the maximum sum contiguous subarray ending at current index and a variable `max_so_far` stores the maximum sum of contiguous subarray found so far, Everytime there is a positive-sum value in `max_ending_here` compare it with `max_so_far` and update `max_so_far` if it is greater than `max_so_far`.

 ## Steps Below:
    1. Create two variables to store current and maximum sub-array sum.
    2. Initialize both the variable with nums[0], i.e., 1st element.
    3. Iterate from index 1 to n-1.
    4. Keep increasing the current sub-array sum.
    5. If, at any point, curSum is negative, reset it to 0.
    6. If, at any point, curSum is greater than maxSum then update maxSum.

