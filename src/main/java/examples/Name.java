package examples;

public class Name {

	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public boolean equals(Name other) {
		if(this.firstName.equals(other.getFirstName()) &&
				this.lastName.equals(other.getLastName())) {
			return true;
		}
		return false;
	}
	
}
