public class RemoveDuplicates {
    public static String removeDuplicateChars(String input) {
        char[] chars = input.toCharArray();
        boolean[] seen = new boolean[256]; // ASCII character set
        String result = "";

        for (char c : chars) {
            if (!seen[c]) {
                result += c;
                seen[c] = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "banana";
        System.out.println(removeDuplicateChars(input)); // Output: "ban"
    }
}

