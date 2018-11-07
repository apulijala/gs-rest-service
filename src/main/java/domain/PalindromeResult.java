package domain;

public class PalindromeResult {

	private String word;
	private boolean palindrome;
	private boolean anagramOfPalindrome;

	public PalindromeResult() {

	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean getPalindrome() {
		return palindrome;
	}

	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}

	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}

	public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

}
