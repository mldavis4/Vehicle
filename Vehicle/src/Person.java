import java.util.UUID;


public class Person {
	private String firstName;
	private String lastName;
	private UUID personID;
	
	public Person(){
		}
	
	public String getFirstName(){
		  	return this.firstName;
	  }
	
	public void setFirstName(String newFirstName){
		  this.firstName=newFirstName;
	  }
	
	public String getLastName(){
		  	return this.lastName;
	  }
	
	public void setLastName(String newLastName){
		  this.lastName=newLastName;
	  }
	
	public void setPersonID(String newPersonID){
		  this.personID=UUID.randomUUID();
	  }
	
}
