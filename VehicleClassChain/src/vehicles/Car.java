package vehicles;

public class Car extends Vehicle implements VehicleInterface{

	private int NumberOfDoors;
	private Person carOwner = this.getOwner();
	
	public Car(){
		
	}
	
	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	
	public void transferOwnership(Person newOwner){
		this.setCarOwner(newOwner);
	}
	
	@Override
	public String toString(){
		return "Car Name: " + this.getName() +
				"Color: " + this.getColor() + "Weight: " + 
				this.getWeight() + "Owner: " + this.getOwner() + 
				"Number of Doors: " + this.getNumberOfDoors();
	}

	public Person getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(Person carOwner) {
		this.carOwner = carOwner;
	}
	
}
