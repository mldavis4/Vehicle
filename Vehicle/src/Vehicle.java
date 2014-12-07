import java.util.UUID;


public abstract class Vehicle {
	private String Name;
	private String color;
	private double weight;
	private Person owner;
	
	public void transferOwnership(Person newOwner){
	  this.owner=newOwner;
	}
	
	


	
}
