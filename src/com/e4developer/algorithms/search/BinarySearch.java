package com.e4developer.algorithms.search;


public class BinarySearch {

    /**
     * We assume that values are already sorted
     * @param values
     * @return the index, or -1 if element not found
     */
    public static int binarySearch(int[] values, int x){
        int start= 0;
        int end= values.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(values[mid] == x)
                return mid;
            else if(values[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

}