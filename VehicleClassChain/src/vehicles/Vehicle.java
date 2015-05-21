package vehicles;

public abstract class Vehicle implements VehicleInterface{

	private String Name;
	private String Color;
	private int Weight;
	private Person Owner;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}
	
	public abstract void transferOwnership(Person newOwner);
	
	@Override
	public String toString(){
		return "Vehicle Name: " + this.getName() +
				"Color: " + this.getColor() + "Weight: " + 
				this.getWeight() + "Owner: " + this.getOwner();
	}
	
}
