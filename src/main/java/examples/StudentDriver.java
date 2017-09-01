package examples;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		
		Student s1 = new Student("Bob");
		students.add(s1);
		Student s2 = new Student("Sally", 9876);
		students.add(s2);
		Student s3 = new Student("Joe", 3232);
		students.add(s3);
		
		for(Student s: students) {
			System.out.println(s);
		}
	}

}
