package examples;

public class WhitepsaceExample {

	private boolean isValid(String input) {
		if(input.equals("abc") || input.equals("def") ||
				input.equals("ghi")) {
			return true;
		}
		return false;
	}
	
	public int convert(String input1, String input2) {
		
		//covnert inputs to a number
		//input must be abc or def
		
		if(!isValid(input1) || !isValid(input2)) {
			return -1;
		}
		else {
			//return conversion
		}
//missing return value		
		
	}
	
	public static void main(String[] args) {
		
		String test = "hello\tthere class";
		int count = 0;
		
		for(int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			if(Character.isWhitespace(c)) {
				count++;
			}
		}
		System.out.println("Number of whitespace characters in the string - " + test + " - is " + count); 
	
		
	}

}
