package employeeDetails;

public class Employee {
   private String firstName;
   private String lastName;
   public Employee(String firsName, String lastName)
   {
	   this.firstName="Virat";
	   this.lastName="Kohli";
   }
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
