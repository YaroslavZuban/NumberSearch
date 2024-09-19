package main;

import server.Number;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test_array_8 = {1, 2,4, 6, 5};

        System.out.println(Arrays.binarySearch(test_array_8, 4));
    }
}