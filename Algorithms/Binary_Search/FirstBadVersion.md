# Approach
<!-- Describe your approach to solving the problem. -->
On reading the problem carefully we need to understand two things. Firstly, the array is in increasing order, but the list of versions should be checked in the decreasing order because the latest version depend on the previous one. For example, if version 5 is bad, it means either 5 is the original bad version or the bad version lies in versions < 5.
Secondly, the original bad version  will be present in either half of the array.

We can have two coutners, `first` and `last`, where `first = 1` since the it has been mentioned that the array starts from 1 and `last = n`. On checking if the middle index of the array is bad verion, if it is bad there is a high chance that the version previous to it is also bad. So we change the value of `last` to `mid - 1`. Else, it means that the bad version is greater than current `mid`. So `first = mid + 1`.

## Complexity

- Time complexity: O (log n)

<!-- ## Code

```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first <= last){
            int mid = first + (last - first) / 2;

            if(isBadVersion(mid)){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }

        return first;
    }
}
``` -->
