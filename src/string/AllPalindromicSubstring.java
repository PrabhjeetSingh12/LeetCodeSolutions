package string;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromicSubstring {

        public List<String> findAllPalindromicSubstrings(String s) {
            List<String> palindromes = new ArrayList<>();
            int n = s.length();

            // Outer loop: Fix the starting index
            for (int start = 0; start < n; start++) {
                // Inner loop: Determine the ending index
                for (int end = start + 1; end <= n; end++) {
                    String substring = s.substring(start, end);
                    if (isPalindrome(substring)) {
                        palindromes.add(substring);
                    }
                }
            }

            return palindromes;
        }

        private boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            AllPalindromicSubstring solution = new AllPalindromicSubstring();
            String s = "abccba";
            List<String> palindromes = solution.findAllPalindromicSubstrings(s);

            System.out.println("Palindromic Substrings:");
            for (String p : palindromes) {
                System.out.println(p);
            }
        }
    }


