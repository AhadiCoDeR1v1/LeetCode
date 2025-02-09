package Searching.Q5;

public class Q5 {
//    so today I only gave to study
public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,6,5,4,3,2};
    System.out.println(search(arr));
}
static int search(int[] arr) {
    int start = 0;
    int end = arr.length;
    while (start <= end) {

        int mid = start + (end - start) / 2;
        if (arr[mid] < arr[mid + 1]) {
            start = mid + 1;
        }
        else if (arr[mid] > arr[mid - 1]) {
            end = mid - 1;
        }
    }
    return start;
}


}
