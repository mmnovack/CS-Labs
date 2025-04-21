import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DigitMatcherRunner {

	/*
	 * The test digit files do not contain a label 
	 */
	public static ArrayList<Digit> populateArrayOfTestDigits (String testDigitsFilePath) throws IOException {
		return null;
	}

	public static void testMostSimilar() {
 
	}

	public static void testKNearestNeighbors(int k) {


	}

	public static void testWeightedKNearestNeighbors(int k) {

	}

	public static void main(String[] args) throws IOException {
		// Test Activity 2
		DigitMatcher digitCollection = new DigitMatcher("src/train.csv");
		System.out.println(digitCollection.getDigits().get(0));
	}
}
