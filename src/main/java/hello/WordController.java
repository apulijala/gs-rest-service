package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import domain.PalindromeResult;
import hello.services.PalindromeService;

@RestController
public class WordController {
	// TODO Implement the /words/{word} endpoint

	@Autowired
	PalindromeService palindromeService;

	@GetMapping("/words/{word}")
	PalindromeResult get(@PathVariable String word) {

		// palindromeService = new PalindromeService();
		
		if (word == null) {
			return null;
		}
		return palindromeService.makePalindromeCommputation(word);
	}

}
