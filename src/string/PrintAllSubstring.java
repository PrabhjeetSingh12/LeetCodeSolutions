package string;

public class PrintAllSubstring {
    public void printAllSubstrings(String s) {
        int n = s.length();

        // Outer loop: Fix the starting index
        for (int start = 0; start < n; start++) {
            // Inner loop: Iterate over possible end indices
            for (int end = start + 1; end <= n; end++) {
                // Print the substring from 'start' to 'end'
                System.out.println(s.substring(start, end));
            }
        }
    }

    public static void main(String[] args) {
        PrintAllSubstring solution = new PrintAllSubstring();
        String s = "abc";
        solution.printAllSubstrings(s);
    }
}

