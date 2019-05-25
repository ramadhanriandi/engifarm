package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTruct {

	@Test
	public void test() {
		//test constructor
		Truck b = new Truck();
		
		//test render
		char c = b.render();
		assertEquals(c, 'T');
		
		//test getIsFacilityOn()
		b.getIsFacilityOn();
		assertEquals(b.getIsFacilityOn(),true);
		
		//test setIsTruck(true)
		b.setIsTruck(true);
		assertEquals(b.getIsTruck(),true);
		
	}

}
