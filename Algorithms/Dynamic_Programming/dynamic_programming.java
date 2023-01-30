package Algorithms.Dynamic_Programming;

import java.io.Console;

public class dynamic_programming {

    // using simple recursion
    private static int recursiveFib(int num){
        if(num <= 2)
            return 1;
        else
            return (recursiveFib(num - 1) + recursiveFib(num - 2)); 
    }

    public static void main(String args[]){
        System.out.println("" + recursiveFib(5));
        System.out.println("" + recursiveFib(10));
        System.out.println("" + recursiveFib(15));
    }
}
