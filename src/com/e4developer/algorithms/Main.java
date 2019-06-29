package com.e4developer.algorithms;

import com.e4developer.algorithms.search.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] testA = {1,4,6,54,345,9999};
        System.out.println(BinarySearch.binarySearch(testA,1));
        System.out.println(BinarySearch.binarySearch(testA,4));
        System.out.println(BinarySearch.binarySearch(testA,6));
        System.out.println(BinarySearch.binarySearch(testA,54));
        System.out.println(BinarySearch.binarySearch(testA,345));
        System.out.println(BinarySearch.binarySearch(testA,9999));
        System.out.println(BinarySearch.binarySearch(testA,-100));
        System.out.println(BinarySearch.binarySearch(testA,10000));
    }
}
