package vehicles;

public class Truck extends Vehicle implements VehicleInterface{

	private int NumberOfAxels;
	private Person truckOwner = this.getOwner();

	public Truck(){
		
	}
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	public void transferOwnership(Person newOwner){
		this.setTruckOwner(newOwner);
	}
	
	@Override
	public String toString(){
		return "Truck Name: " + this.getName() +
				"Color: " + this.getColor() + "Weight: " + 
				this.getWeight() + "Owner: " + this.getOwner() + 
				"Number of Axels: " + this.getNumberOfAxels();
	}

	public Person getTruckOwner() {
		return truckOwner;
	}

	public void setTruckOwner(Person truckOwner) {
		this.truckOwner = truckOwner;
	}
	
	
}
