package examples;

public class Student {
	
	//data members
	private String name;
	private int id;
	
	public Student(String name, int id) {		
		this.name = name;
		this.id = id;		
	}
	
	public Student(String name) {
//		this.name = name;
//		this.id = 0;
		this(name, 0);
	}

	public String toString() {
		return name + " - " + id;
	}
	
}
