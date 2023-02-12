## Binary Search Algorithm

Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n).

 * STEPS FOR BINARY SEARCH:
    * Sort the array in ascending order.
    * Set the low index to the first element of the array and the high index to the last element.
    * Set the middle index to the average of the low and high indices.
    * If the element at the middle index is the target element, return the middle index.
    * If the target element is less than the element at the middle index, set the high index to the middle index – 1
    * If the target element is greater than the element at the middle index, set the low index to the middle index+1.
    * Repeat steps 3-6 until the element is found or it is clear that the element is not present in the array.

    ## Algorithm

    binarySearch(arr, x, low, high)
        repeat till low = high
               mid = (low + high)/2
                   if (x == arr[mid])
                   return mid
   
                   else if (x > arr[mid]) // x is on the right side
                       low = mid + 1
   
                   else                  // x is on the left side
                       high = mid - 1