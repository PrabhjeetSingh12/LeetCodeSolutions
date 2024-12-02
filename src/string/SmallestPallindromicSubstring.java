package string;

public class SmallestPallindromicSubstring {
    public String smallestPalindrome(String s) {
        for (int length = 2; length <= s.length(); length++) { // Start from length 2
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return ""; // Return empty string if no palindrome is found
    }

    private boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "baabbad" ;
        SmallestPallindromicSubstring object = new SmallestPallindromicSubstring();
        String ans = object.smallestPalindrome(s);
        System.out.println(ans);
    }
}
