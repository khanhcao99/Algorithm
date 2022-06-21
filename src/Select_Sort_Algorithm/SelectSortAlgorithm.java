package Select_Sort_Algorithm;

import java.util.Arrays;

public class SelectSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,1,3,4,9,10};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
