import java.util.ArrayList;

public class PrintHelper {
	public static void print(Digit testDigit, ArrayList <Digit> kDigits) {
		
		ArrayList<String> digitStrings = testDigit.getPixelsforPrinting();

		for(Digit d: kDigits) 
			for(int row = 0; row < digitStrings.size(); row++) 
				digitStrings.set(row, digitStrings.get(row) + d.getPixelsforPrinting().get(row));
		
		for(String s: digitStrings)
			System.out.println(s + "\n");
	}
}

