package Week11.Lecture;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] list = {3, 8, 12, 34, 54, 85, 61, 110};
        Arrays.sort(list);  // Ensure the list is sorted for binary search

        int index = binarySearch(list, 54);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found. Insert at index: " + (-1 - index));
        }
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -1 - low;
    }
}

