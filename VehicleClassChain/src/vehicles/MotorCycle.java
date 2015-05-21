package vehicles;

public class MotorCycle extends Vehicle implements VehicleInterface{

	private boolean hasSideCar;
	private Person motorCycleOwner = this.getOwner();

	public MotorCycle(){
		
	} 
	
	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	public void transferOwnership(Person newOwner){
		this.setMotorCycleOwner(newOwner);
	}
	
	@Override
	public String toString(){
		return "Motorcycle Name: " + this.getName() +
				"Color: " + this.getColor() + "Weight: " + 
				this.getWeight() + "Owner: " + this.getOwner() + 
				"Has side car: " + this.isHasSideCar();
	}

	public Person getMotorCycleOwner() {
		return motorCycleOwner;
	}

	public void setMotorCycleOwner(Person motorCycleOwner) {
		this.motorCycleOwner = motorCycleOwner;
	}
}
