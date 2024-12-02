package string;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
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

    public static void main(String args[]){
        LongestPalindromicSubstring object = new LongestPalindromicSubstring();
        String s = "babad";
        String ans = object.longestPalindrome(s);
        System.out.println(ans);
    }

}
