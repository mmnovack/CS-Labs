import java.text.DecimalFormat;
import java.util.ArrayList;
/*
 * A Digit object will represent a single handwritten Digit from either the training or testing data sets.
 * 
 * Each digit will have two stored instance fields: label and pixels. 
 * The label will be a number between 0 and 9 and signifies what number the digit represents.
 * pixels is a 28*28 array of 0's and 1's. Each element represents a single pixel from the digit's image.
 * 
 * similarity will be calculated in the setSimilarity function.
 * this function will be passed another digit and determine what percentage of pixels are the same 
 * between the two digits. The higher the value the greater the similarity.
 */

public class Digit{

	private int label;
    private int[][] pixels;
    private double similarity;

    public Digit(int label, int[] pixels) {
    	this.label = label;
    	
        if (pixels.length != 784) {
            throw new IllegalArgumentException("Pixel array must contain exactly 784 elements.");
        }
        
        this.pixels = new int[28][28];
        constructPixels(pixels);
    }

    private void constructPixels(int[] pixels) {
        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 28; j++) {
                this.pixels[i][j] = pixels[i * 28 + j];
            }
        }
    }

    public int[][] getpixels() {
        return pixels;
    }

    public int getLabel() {
    	return label;
    }
    
    /*
     * Calculates how similar this Digit is to another Digit.
     * 
     * The similarity is calculated by determining what percentage of pixels are the same 
     * between the two digits.
     * 
     * The higher the value the greater the similarity.
     * 
     * @param other the digit this object is compared against.
     */
    public void setSimilarity (Digit other) {
        
       
    }

    public double getSimilarity() {
        return similarity;
    }
    
    /* 
     * This function is used by the PrintHelper class, which displays several Digits horizontally across the console.
     * 
     */
    public ArrayList<String> getPixelsforPrinting(){
    	ArrayList<String> printPixels = new ArrayList<>();
    	String printString = "";
    	
    	for(char c: toString().toCharArray()) {
    		if(c != '\n')
    			printString += c;
    		else {
    			printPixels.add(printString);
    			printString = "";
    		}
    	}
    	
    	return printPixels;
    }
    
    /*
	 * The toString method returns a string that contains the digit's label and similarity score, 
	 * if this score is anything other than zero followed by a representation of the digit's pixels.
	 */
	public String toString () {
		String display = "label = " + label + "                     \n";
		
		DecimalFormat numberFormat = new DecimalFormat("#.0000000000000");
		display += ((getSimilarity() > 0) ? ("similarity = " + numberFormat.format(getSimilarity()) 
			+ "   \n|") : ("                              \n|"));
		for(int i = 0; i< 28; i++)
			display += '-';
		display += "|\n|";
		for(int[] row: pixels) {
			for(int p: row) 
				if(p == 0)
					display += ' ';
				else
					display += '*';
			display += "|\n|";
		}
		for(int i = 0; i< 28; i++)
			display += '_';
		display += "|\n";
		return display;
	}
}
