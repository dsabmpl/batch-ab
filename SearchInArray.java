public class SearchInArray {
    static boolean isFound(int[] arr, int index, int searchValue) {
        // Base Case
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == searchValue) {
            return true;
        }
        // Small Problem
        return isFound(arr, index + 1, searchValue);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int search = 400;
        System.out.println(isFound(arr, 0, search) ? "Found" : "Not Found");
    }
}
