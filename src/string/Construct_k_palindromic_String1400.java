package string;
//
//Given a string s and an integer k, return true if you can use all the characters in s to construct k palindrome strings or false otherwise.
//
//
//
//        Example 1:
//
//Input: s = "annabelle", k = 2
//Output: true
//Explanation: You can construct two palindromes using all characters in s.
//Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
//Example 2:
//
//Input: s = "leetcode", k = 3
//Output: false
//Explanation: It is impossible to construct 3 palindromes using all the characters of s.
//        Example 3:
//
//Input: s = "true", k = 4
//Output: true
//Explanation: The only possible solution is to put each character in a separate string.

public class Construct_k_palindromic_String1400 {

    public boolean NumberOfPalindrome(String s,int n){

        if(s.length()<n) return false;

        if(s.length()==n) return true;

        int[] freq=new int[26];

       for(char ch:s.toCharArray()){
           freq[ch-'a']++;
       }

       int oddcount=0;

       for(int i:freq){
           if(i%2!=0){
               oddcount++;
           }
       }
        return oddcount<=n;
    }

    public static void main(String[] args){
        String check="annabelle";

        Construct_k_palindromic_String1400 obj = new Construct_k_palindromic_String1400();
        boolean ans = obj.NumberOfPalindrome(check,check.length());
        boolean ans1 = obj.NumberOfPalindrome(check,2);

        System.out.println(ans1);
    }
}
