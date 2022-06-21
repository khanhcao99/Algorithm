package Bubble_Sort_Algorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,4,6,21,4,56,88,21,344,7,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
