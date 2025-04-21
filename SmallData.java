import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SmallData {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("src/train.csv"));
		FileWriter f = new FileWriter("src/small_train.csv");
		BufferedWriter bw = new BufferedWriter(f);
		
		bw.newLine();
		int counter = 0;
		
		while (counter < 3000) {
			counter++;
			String value = s.nextLine();
			bw.write(value);
			bw.newLine();
		}
		bw.close();
		f.close();
	}


}
