package vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestVehicle {

	public static void main(String[] args) {
		
		Person personA = new Person();
		
		personA.setPersonID();
		
		Truck truck = new Truck();
		truck.setNumberOfAxels(2);
		truck.setOwner(personA);
		
		Person personB = new Person();
		personB.setPersonID();
		
		truck.transferOwnership(personB);
		
		MotorCycle motorcycle = new MotorCycle();
		motorcycle.setHasSideCar(false);
		
		Map<UUID, Object> hashMap = new HashMap<>();
		hashMap.put(personA.getPersonID(), personA);
		hashMap.put(UUID.randomUUID(), truck);
		hashMap.put(UUID.randomUUID(), motorcycle);
		hashMap.put(personB.getPersonID(), personB);
		hashMap.put(UUID.randomUUID(), motorcycle);
		
	}

}
