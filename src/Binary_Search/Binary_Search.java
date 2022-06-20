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
//        binarySearch(arr, value);
//        binarySearch2(arr, value, 0, arr.length -1);

    }

//    Không sử dụng đệ quy
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

//    Sử dụng đệ quy

    public static void binarySearch2(int[] arr, int value, int low, int high){
            int mid = (high + low)/2;
            if (arr[mid] == value){
                System.out.println("Vị trí của phần tử là: " + mid);
            } else if (arr[mid] < value) {
                binarySearch2(arr, value, mid + 1, high);
            }else {
                binarySearch2(arr, value, low, mid - 1);
            }
        }
}
