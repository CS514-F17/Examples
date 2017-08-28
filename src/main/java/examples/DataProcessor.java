package examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataProcessor {

	public static void main(String[] args) {
		
		//find the min, max, and mean of all values stored
		//in the text file input/scores.txt
		
		
		try(Scanner input = new Scanner(new File("input/scores.txt"))) {
			
			while(input.hasNext()) {
				int nextInt = input.nextInt();
				System.out.println(nextInt);
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		
	}
}
