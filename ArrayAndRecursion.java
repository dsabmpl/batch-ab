public class ArrayAndRecursion {

    static boolean isSortedArray(int[] arr, int index) {
        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 130, 40, 50 };
        boolean r = isSortedArray(arr, 0);
        System.out.println(r ? "Sorted " : "Not Sorted");
    }
}
