package PracticeViaVierma.CompanyPractice.Company17;

 class StringCompression {
    public static String compressString(String input) {
        if (input == null || input.length() <= 2) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int charCount = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (nextChar == currentChar) {
                charCount++;
            } else {
                compressed.append(currentChar).append(charCount);
                currentChar = nextChar;
                charCount = 1;
            }
        }

        // Append the last character and its count
        compressed.append(currentChar).append(charCount);

        // Check if the compressed string is shorter than the original
        if (compressed.length() < input.length()) {
            return compressed.toString();
        } else {
            return input;
        }
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbb"));  // Output: "a3b3"
        System.out.println(compressString("aaabccc")); // Output: "a3b1c3"
        System.out.println(compressString("a"));       // Output: "a"
    }
}
