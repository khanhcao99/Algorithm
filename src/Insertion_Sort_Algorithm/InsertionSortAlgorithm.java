package Insertion_Sort_Algorithm;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,2,4,7,1,3,5,6,9,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){
        int pop, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pop = i;
            while (pop > 0 && x < arr[pop - 1]){
                arr[pop] = arr[pop - 1];
                pop--;
            }
            arr[pop] = x;
        }
    }
}
