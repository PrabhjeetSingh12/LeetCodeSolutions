package string;

import java.util.regex.*;

public class VowelConsonantCountRegex {
    public static void main(String[] args) {
        String input = "Hello World"; // Example input
        int vowels = countMatches(input, "[aeiouAEIOU]");
        int consonants = countMatches(input, "[a-zA-Z&&[^aeiouAEIOU]]");

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static int countMatches(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
