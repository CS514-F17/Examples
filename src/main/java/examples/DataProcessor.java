package examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataProcessor {

	public static void main(String[] args) {
		
		//find the min, max, and mean of all values stored
		//in the text file input/scores.txt
				
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		try(Scanner input = new Scanner(new File("input/scores.txt"))) {
			
			while(input.hasNext()) {
				int nextInt = input.nextInt();
				numbers.add(nextInt);			
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}		
//		for(int value: numbers) {
//			System.out.println(value);
//		}
		
		int min = numbers.get(0); 
				
		for(int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			if(value < min) {
				min = value;
			}
		
		}
		System.out.println("Smallest: " + min);

		
		
	}
}
