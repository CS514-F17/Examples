package examples;

public class NumberList {

	private int[] numbers;
	private int count;

	public NumberList() {		
		this.numbers = new int[2];
		this.count = 0;
	}
	
	/**
	 * Create a new array of twice the size 
	 * and copy over all items.
	 */
	private void resize() {
		
		//create a new array of twice the size of the original
		int[] newArray = new int[count*2];		
		
		//copy everything from original into new
		for(int i = 0; i < count; i++) {
			newArray[i] = this.numbers[i];
		}
		
		//move numbers reference to new array
		this.numbers = newArray;
		
	}
	
	public void addFirst(int newNumber) {
		
		//if list is full, resize
		if(count == numbers.length) {
			resize();
		}		
		
		//move all existing items down one slot
		for(int i = count; i > 0; i--) {			
			numbers[i]= numbers[i-1];			
		}
		
		//add new item at beginning of the list
		numbers[0] = newNumber;
		count++;
		
		
	}
	

	
}
