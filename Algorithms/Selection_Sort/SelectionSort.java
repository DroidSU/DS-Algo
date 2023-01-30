package Algorithms.Selection_Sort;

public class SelectionSort {
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};

        for(int i = 0; i < arr.length-1; i++){
            int min_index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j; 
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
