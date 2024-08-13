package PalindromeChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    void testPalindromicStrings() {
        assertTrue(palindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertTrue(palindromeChecker.isPalindrome("Racecar"));
        assertTrue(palindromeChecker.isPalindrome("Madam In Eden I'm Adam"));
    }

    @Test
    void testNonPalindromicStrings() {
        assertFalse(palindromeChecker.isPalindrome("Hello World"));
        assertFalse(palindromeChecker.isPalindrome("Java Programming"));
        assertFalse(palindromeChecker.isPalindrome("OpenAI GPT-4"));
    }

    @Test
    void testStringsContainingSpecialCharacters() {
        assertTrue(palindromeChecker.isPalindrome("Able , was I saw eLba"));
        assertTrue(palindromeChecker.isPalindrome("No 'x' in Nixon"));
        assertFalse(palindromeChecker.isPalindrome("This isn't a palindrome!"));
    }

    @Test
    void testEmptyAndNullStrings() {
        assertFalse(palindromeChecker.isPalindrome(""));
        assertFalse(palindromeChecker.isPalindrome(null));
    }
}
