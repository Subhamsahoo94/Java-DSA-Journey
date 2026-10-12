
/*
 * Question:
 * Left Rotate / Right Rotate an Array by 1 Position
 *
 * Problem Statement:
 * Given an integer array, shift all elements one position
 * to the right. The last element should move to the first
 * position.
 *
 * Example 1:
 * Input:  arr = {1, 2, 3, 5, 9, 10}
 * Output: {10, 1, 2, 3, 5, 9}
 *
 * Example 2:
 * Input:  arr = {4, 7, 8, 2}
 * Output: {2, 4, 7, 8}
 *
 * Approach:
 * 1. Store the last element in a temporary variable.
 * 2. Traverse the array from right to left.
 * 3. Shift every element one position to the right.
 * 4. Place the last element at index 0.
 *
 * Time Complexity: O(n)
 * - We traverse the array once to shift elements.
 *
 * Space Complexity: O(1)
 * - We use only one extra variable (temp).
 *
 * Note:
 * This operation is a right rotation by one position.
 */

public class main {

    static void shiftBy1(int arr[]) {

        int n = arr.length;

        // Store the last element before shifting
        int temp = arr[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Move the last element to the first position
        arr[0] = temp;

        // Print the rotated array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {

        // Example input array
        int arr[] = {1, 2, 3, 5, 9, 10};

        // Function call
        shiftBy1(arr);
    }
}
