package PracticeViaVierma.CompanyPractice.Company17;

 class AnagramChecker {
    public static boolean areAnagrams(String a, String b) {
        // If the lengths of the two strings are different, they cannot be anagrams.
        if (a.length() != b.length()) {
            return false;
        }

        // Create an array to count the occurrences of each character in both strings.
        int[] count = new int[26]; // Assuming only lowercase letters (a to z).

        // Iterate through string 'a' and increment counts.
        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }

        // Iterate through string 'b' and decrement counts.
        for (char c : b.toCharArray()) {
            count[c - 'a']--;
        }

        // If the strings are anagrams, the count array will be filled with zeros.
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // There's a character mismatch.
            }
        }

        return true; // The strings are anagrams.
    }

    public static void main(String[] args) {
        String a1 = "geeksforgeeks";
        String b1 = "forgeeksgeeks";
        System.out.println(areAnagrams(a1, b1)); // Output: true (YES)

        String a2 = "hello";
        String b2 = "world";
        System.out.println(areAnagrams(a2, b2)); // Output: false (NO)
    }
}

