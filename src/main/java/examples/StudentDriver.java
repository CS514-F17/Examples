package examples;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		
		Name n1 = new Name("Bob", "Jones");
		Student s1 = new Student(n1);
		students.add(s1);		
		Student s2 = new Student("Sally", "Smith", 9876);
		students.add(s2);
		Student s3 = new Student("Joe", "Zepeda", 3232);
		students.add(s3);
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		//change name of student 1 to be Robert
		//option 1
		students.get(0).changeFirstName("Robert");
		
		//option 2
		Name n = students.get(0).getName();
		n.setFirstName("Robert");
		
		
		
	}

}
