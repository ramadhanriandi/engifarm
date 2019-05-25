package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMixer {

	@Test
	public void test() {
		///test constructor
		Mixer b = new Mixer();
		
		//test render
		char c = b.render();
		assertEquals(c, 'M');
		
		//test getIsFacilityOn()
		assertEquals(b.getIsFacilityOn(),true);
		
		///test getIsMixer()
		assertEquals(b.getIsMixer(),true);
										
		//test setIsMixer()
		b.setIsMixer(false);
		assertEquals(b.getIsMixer(),false);
	}

}
