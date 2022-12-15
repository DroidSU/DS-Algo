package Algorithms.Bubble_Sort;

public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {5, 2, 7, 1, 8, 6};
        
        // bubble sort
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1;  j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
