package array;


public class ReplaceEvenWithNextOdd {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8,9, 10, 13, 15};

        replaceEvenWithNextOdd(arr);

        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void replaceEvenWithNextOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // Check if the number is even
                arr[i] = findNextOdd(arr, i); // Replace with the next odd number
            }
        }
    }

    public static int findNextOdd(int[] arr, int currentIndex) {
        for (int j = currentIndex + 1; j < arr.length; j++) {
            if (arr[j] % 2 != 0) { // Check if the number is odd
                return arr[j];
            }
        }
        return arr[currentIndex]; // No odd number found; keep the original even number
    }
}

