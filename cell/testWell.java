package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testWell {

	@Test
	public void test() {
		///test constructor
		Well b = new Well();
		
		//test render
		char c = b.render();
		assertEquals(c, 'W');
		
		//test getIsFacilityOn()
		b.getIsFacilityOn();
		assertEquals(b.getIsFacilityOn(),true);
		
		//test setIsTruck(true)
		b.setIsTruck(true);
		assertEquals(b.getIsWell(),true);
	}

}
