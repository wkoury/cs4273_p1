package com.group11.lettersgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.io.FileNotFoundException;

@SpringBootTest
class LettersGameApplicationTests {

	final int EN_ALPHABET_LENGTH = 26;
	final int ES_ALPHABET_LENGTH = 30;

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

	@Test
	void testEnglishAlphabetLength() {
		ArrayList<Letter> englishAlphabet;
		CSVParser englishParser = new CSVParser("english.csv");
		englishAlphabet = englishParser.getAlphabet();

		assertEquals(englishAlphabet.size(), EN_ALPHABET_LENGTH);
	}

	@Test
	void testEnglishParsingLowercase() {
		ArrayList<Letter> englishAlphabet;
		Letter currLetter;
		CSVParser englishParser = new CSVParser("english.csv");
		englishAlphabet = englishParser.getAlphabet();

		//loop through english alphabet arraylist and check that each
		//letter in the arraylist is correct (based on alphabetical
		//order)
		for(int i = 0; i < EN_ALPHABET_LENGTH; ++i) {
			currLetter = englishAlphabet.get(i);
			int asciiVal = i + 'a';
			char myChar = (char) asciiVal;
			assertEquals(currLetter.getLowercase(), String.valueOf(myChar));
		}
	}

	@Test
        void testEnglishParsingUppercase() {
                ArrayList<Letter> englishAlphabet;
                Letter currLetter;
                CSVParser englishParser = new CSVParser("english.csv");
                englishAlphabet = englishParser.getAlphabet();

                //loop through english alphabet arraylist and check that each
                //letter in the arraylist is correct (based on alphabetical
                //order)
                for(int i = 0; i < EN_ALPHABET_LENGTH; ++i) {
                        currLetter = englishAlphabet.get(i);
                        int asciiVal = i + 'A';
                        char myChar = (char) asciiVal;
                        assertEquals(currLetter.getUppercase(), String.valueOf(myChar));
                }
        }

        @Test
        void testSpanishAlphabetLength() {
                ArrayList<Letter> spanishAlphabet;
                CSVParser spanishParser = new CSVParser("spanish.csv");
                spanishAlphabet = spanishParser.getAlphabet();

                assertEquals(spanishAlphabet.size(), ES_ALPHABET_LENGTH);
        }

        @Test
        void testSpanishParsingLowercase() {
		final String[] ES_TEST_ALPHABET = {"a", 
			"b", "c", "ch", "d", "e", "f", "g", "h", "i", "j", "k",
			"l", "ll", "m", "n", "ñ", "o", "p", "q", "r", "rr", "s", 
			"t", "u", "v", "w", "x", "y", "z"};
                ArrayList<Letter> spanishAlphabet;
                Letter currLetter;
		String testLetterStr;
                CSVParser spanishParser = new CSVParser("spanish.csv");
                spanishAlphabet = spanishParser.getAlphabet();

                //loop through spanish alphabet arraylist and check that each
                //letter in the arraylist is correct (based on alphabetical
                //order)
                for(int i = 0; i < ES_ALPHABET_LENGTH; ++i) {
                        currLetter = spanishAlphabet.get(i);
                        testLetterStr = ES_TEST_ALPHABET[i];

			assertEquals(currLetter.getLowercase(), testLetterStr);
                }
        }

	@Test
        void testSpanishParsingUppercase() {
                final String[] ES_TEST_ALPHABET = {"A",
                        "B", "C", "CH", "D", "E", "F", "G", "H", "I", "J", "K",
                        "L", "LL", "M", "N", "Ñ", "O", "P", "Q", "R", "RR", "S",
                        "T", "U", "V", "W", "X", "Y", "Z"};
                ArrayList<Letter> spanishAlphabet;
                Letter currLetter;
                String testLetterStr;
                CSVParser spanishParser = new CSVParser("spanish.csv");
                spanishAlphabet = spanishParser.getAlphabet();

                //loop through spanish alphabet arraylist and check that each
                //letter in the arraylist is correct (based on alphabetical
                //order)
                for(int i = 0; i < ES_ALPHABET_LENGTH; ++i) {
                        currLetter = spanishAlphabet.get(i);
                        testLetterStr = ES_TEST_ALPHABET[i];

                        assertEquals(currLetter.getUppercase(), testLetterStr);
                }
        }

	@Test
	void testUnsupportedLanguage() {
		CSVParser germanParser = new CSVParser("german.csv");
		ArrayList<Letter> germanLetters = germanParser.getAlphabet();

		//when an unsupported language is passed into the parser
		//the letters arraylist is instantiated, but never populated
		assertTrue(germanLetters.isEmpty());		
	}

}
