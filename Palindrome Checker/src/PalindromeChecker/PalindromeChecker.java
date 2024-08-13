package PalindromeChecker;

public class PalindromeChecker {

    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        StringBuilder filteredInput = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                filteredInput.append(Character.toLowerCase(character));
            }
        }
        String cleanedInput = filteredInput.toString();
        String reversedInput = filteredInput.reverse().toString();

        return cleanedInput.equals(reversedInput);
    }
}
