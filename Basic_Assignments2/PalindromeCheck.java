// Program to check given number is palindrome or Not.
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeCheck {
	private Palindrome palindrome;
	@Before
	public void setUp(){
		palindrome = new Palindrome();
	}
	@Test
	public void usingPalindromeValue() {
		int afterPalindrome = palindrome.palindromeNumber(121);
		assertEquals(1, afterPalindrome);
	}
	@Test
	public void usingNagativeInteger() {
		int afterPalindrome = palindrome.palindromeNumber(-121);
		assertEquals(0, afterPalindrome);
	}
	@Test
	public void usingNonPalindromeNumber() {
		int afterPalindrome = palindrome.palindromeNumber(10);
		assertEquals(0, afterPalindrome);
	}
}
