package com.fibo.series;

public class FibonacciSeriesNthElement {
    public static void main(String[] args) {
        int num = 11;
        int fibVal =  fibonacciValue(num);
        System.out.println(fibVal);
    }

    private static int fibonacciValue(int n) {
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacciValue(n-1) + fibonacciValue(n-2);
    }
}
