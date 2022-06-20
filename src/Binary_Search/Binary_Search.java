package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {22,33,41,6,100,35,24,1,120,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập vào số muốn tìm kiếm: ");
        int value = scanner.nextInt();
        binarySearch(arr, value);

    }

    public static void binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
           int mid = (high + low)/2;
            if (arr[mid] == value){
                System.out.println("Vị trí của phần tử là: " + mid);
                return;
            } else if (arr[mid] < value) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
    }
}
