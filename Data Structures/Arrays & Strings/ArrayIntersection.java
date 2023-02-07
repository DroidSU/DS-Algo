import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> arrayList = new ArrayList<>();

        while(true){
            if(p1 >= nums1.length || p2 >= nums2.length){
                break;
            }
            else{
                if(nums1[p1] == nums2[p2]){
                    arrayList.add(nums1[p1]);
                    p1++;
                    p2++;
                }
                else if(nums1[p1] > nums2[p2]){
                    p2++;
                }
                else if(nums2[p2] > nums1[p1]){
                    p1++;
                }
            }
        }

        int[] arr = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            arr[i] = arrayList.get(i);
        }

        return arr;
    }

    public static void main(String args[]){
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int[] arr = intersect(nums1, nums2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
