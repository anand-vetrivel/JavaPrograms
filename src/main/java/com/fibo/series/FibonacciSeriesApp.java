package com.fibo.series;

import com.google.common.collect.Lists;

import java.util.List;

public class FibonacciSeriesApp {
    public static void main(String[] args) {
        int num = 11;
        List<Integer> fibSeries = Lists.newArrayList(0, 1);

        // checks before recursion
        if (num == 1) {
            System.out.println(fibSeries.get(0));
            return;
        }
        if (num == 2) {
            System.out.println(fibSeries.subList(0, 1));
            return;
        }
        fibonacciSeries(fibSeries, num);
        System.out.println(fibSeries);
    }

    private static void fibonacciSeries(List<Integer> fibSeriesList, int num) {
        // Exit condition in Recursion
        if (fibSeriesList.size() == num) {
            return;
        }
        int nextFibNum = fibSeriesList.get(fibSeriesList.size() - 2) + fibSeriesList.get(fibSeriesList.size() - 1);
        fibSeriesList.add(nextFibNum);
        fibonacciSeries(fibSeriesList, num);
    }
}
