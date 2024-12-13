package array;

public class MinimumDistanceBetweenTwoWordsInStringArray {

    public int distance(String[] str, String w1, String w2) {
        int index1 = -1; // Last index of w1
        int index2 = -1; // Last index of w2
        int minDistance = -1; // Initialize to max value

        // Traverse the array
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(w1)) {
                index1 = i; // Update last index of w1
            } else if (str[i].equals(w2)) {
                index2 = i; // Update last index of w2
            }

            // If both indices are valid, calculate the distance
            if (index1 != -1 && index2 != -1) {
                minDistance = (index2 - index1);
            }
        }

        // Return the minimum distance or -1 if one of the words is not found
        return minDistance ;
    }

    public static void main(String[] args) {
        String[] S = { "the", "quick", "brown", "fox", "quick" };
        String word1 = "the", word2 = "brown";

        MinimumDistanceBetweenTwoWordsInStringArray object = new MinimumDistanceBetweenTwoWordsInStringArray();
        System.out.println(object.distance(S, word1, word2)); // Output: 1
    }
}
