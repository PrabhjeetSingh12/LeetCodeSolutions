package array.prefixsum;




import java.util.HashSet;
import java.util.Set;

public class CountPalindromeSubSequence {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet<>();
        for (Character c : s.toCharArray()) {
            letters.add(c);
        }

        int ans = 0;
        for (Character letter : letters) {
            int i = -1;
            int j = 0;

            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == letter) {
                    if (i == -1) {
                        i = k;
                    }
                    j = k;
                }
            }

            Set<Character> between = new HashSet<>();
            for (int k = i + 1; k < j; k++) {
                between.add(s.charAt(k));
            }

            ans += between.size();
        }

        return ans;
    }

    public static void main(String[] args) {
        CountPalindromeSubSequence solution = new CountPalindromeSubSequence();

        // Test case 1
        String test1 = "bbcbaba";
        int result1 = solution.countPalindromicSubsequence(test1);
        System.out.println("Input: " + test1);
        System.out.println("Count of unique palindromic subsequences: " + result1);

        // Test case 2
        String test2 = "abc";
        int result2 = solution.countPalindromicSubsequence(test2);
        System.out.println("\nInput: " + test2);
        System.out.println("Count of unique palindromic subsequences: " + result2);

        // Test case 3
        String test3 = "aaaa";
        int result3 = solution.countPalindromicSubsequence(test3);
        System.out.println("\nInput: " + test3);
        System.out.println("Count of unique palindromic subsequences: " + result3);
    }
}
