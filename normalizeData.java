import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class normalizeData {


	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("src/test.csv"));
		FileWriter f = new FileWriter("src/test2.csv");
		BufferedWriter bw = new BufferedWriter(f);
		s.nextLine();
		//bw.newLine();

		while (s.hasNext()) {
			String[] values = s.nextLine().split(",");
			
			for(int i = 1; i < values.length; i++)
				if(!values[i].equals("0"))
					values[i] = "1";
			
			String line = "";
			
			for(int i = 0; i < values.length - 1; i++)
				line += values[i] + ",";
			
			line += values[values.length-1];
				
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		f.close();


	}

}
