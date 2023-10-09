public class LinearSearch {

    // Function to perform linear search
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i; // Return the index if target is found
        }
        
        // Target element is not in the array
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 10;
        int result = linearSearch(arr, target);

        if (result == -1)
            System.out.println("Element not found in the array");
        else
            System.out.println("Element found at index " + result);
    }
}
