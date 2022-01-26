package com.group11.lettersgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LettersGameApplicationTests {

	// this was just me refreshing my knowledge of writing unit tests in java
	@Test
	void twoPlusTwoEqualsFour() {
		assertEquals(2 + 2, 4);
	}

	@Test
	void testLetterGetLowercase() {
		Letter a = new Letter("a", "A");

		assertEquals(a.getLowercase(), "a");
		assertEquals(a.getUppercase(), "A");
	}

}
