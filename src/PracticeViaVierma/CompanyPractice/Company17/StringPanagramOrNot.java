package PracticeViaVierma.CompanyPractice.Company17;

 class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each letter from 'a' to 'z'.
        boolean[] alphabet = new boolean[26];

        // Convert the input string to lowercase for case insensitivity.
        str = str.toLowerCase();

        // Iterate through the characters in the string and mark their presence in the array.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all alphabet characters have been marked as true.
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false; // If any letter is missing, it's not a pangram.
            }
        }

        return true; // All letters from 'a' to 'z' are present.
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "The quick brown fox jumps over the dog";

        if (isPangram(str1)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }

        if (isPangram(str2)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}

