package hello.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import domain.PalindromeResult;
import hello.services.PalindromeService;

/*
 * Implementation class for checking if word can become a palindrome or is 
 * already a palindrome.
 */
@Service
public class PalindromeServiceImpl implements PalindromeService {

	public PalindromeResult makePalindromeCommputation(String word) {

	

		PalindromeResult palindromeResult = new PalindromeResult();
		palindromeResult.setWord(word);
		palindromeResult.setAnagramOfPalindrome(canWordBecomeAPalindrome(word));
		palindromeResult.setPalindrome(isWordAPalindrome(word));

		return palindromeResult;
	}

	private boolean isWordAPalindrome(final String word) {

		// Assuming that palindrome is case insensitive.
		String wordToTest = word.toLowerCase();
		
		// check if character is same at both ends of the word.
		// If it doesn't match return false
		for (int i = 0; i < wordToTest.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
			}
		}
		// All matched. Hence returning true
		return true;

	}
	
	/*
	 *  Algorithm: Word can become a palindrome if odd occurences of 
	 *  characters is not more than one.	
	 */

	private boolean canWordBecomeAPalindrome(String word) {

		// Store occurrence of each character. chars returns an integer representation
		// of a character, hence a map of Integer and Integer
		
		// Choosing a hash map gives O(n) time complexity.
		
		Map<Integer, Integer> charMap = new HashMap<>();

		word.chars().forEach(c -> {
			if (charMap.get(c) == null) {
				charMap.put(c, 1);
			} else {
				charMap.put(c, charMap.get(c) + 1);
			}
		});

		// If odd Count occurrences of characters is more than one, word cannot become a
		// palindrome.

		int oddCount = 0;
		for (Integer i : charMap.keySet()) {
			if (charMap.get(i) % 2 == 1) {
				oddCount++;
				if (oddCount > 1) {
					return false;
				}
			}
		}
		return true;
	}
}
