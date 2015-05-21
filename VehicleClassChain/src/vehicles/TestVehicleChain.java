package vehicles;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestVehicleChain {

	@Before
	public void setUp() throws Exception {
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

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue("The HashMap contains 5 values: ", hashMap.size().equals(5));
		assertTrue("Person B UUID returns personB: ", hashMap.get(personB.getPersonID()).equals(personB));
	}

}
