public class LinearSearchArray {

    public static void main(String args[]){
        // input
        int arr[] = {1,2,3,4,5,6};

        // testcase
        int n = 8;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                System.out.println("Found in index: " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
