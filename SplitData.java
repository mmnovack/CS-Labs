import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * This class can be used to split your data into training and testing data sets.
 * Your original data file should be placed in your project's src folder and named 'data.csv'.
 * Running the main function will produce two new files, 'train_data.csv' and 'test_data.csv'.
 */

public class SplitData {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("src/train.csv"));
		FileWriter f = new FileWriter("src/train_data.csv");
		BufferedWriter bw = new BufferedWriter(f);
		
		bw.newLine();
		
		// determine how many data points your dataset contains. The data will be split into two 
		// seperate files. 80% will go to the training set. 20% will go to the testing set.
		int data_count = 0;
		
		while(s.hasNext()) {
			data_count++;
			s.nextLine();
		}
		
		s.close();
		s = new Scanner(new File("src/train.csv"));
		
		int counter = 0;
		
		while (counter < (int)(data_count * .8)) {
			counter++;
			String value = s.nextLine();
			bw.write(value);
			bw.newLine();
		}
		bw.close();
		f.close();
		
		
		f = new FileWriter("src/test_data.csv");
		bw = new BufferedWriter(f);
		
		while(s.hasNext()) {
			String value = s.nextLine();
			bw.write(value);
			bw.newLine();
		}
		
		bw.close();
		f.close();
		s.close();

	}

}
