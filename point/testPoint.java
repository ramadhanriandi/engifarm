package point;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPoint {

	@Test
	public void testingGetAbsis() {
		//test default constructor
		Point p1 = new  Point();
		int x = p1.getAbsis();
		int y = p1.getOrdinat();
		assertEquals(x,0);
		assertEquals(y,0);
		
		//test user defined constructor and method getAbsis(), getOrdinat()
		Point p2 = new  Point(4,5);
		x = p2.getAbsis();
		y = p2.getOrdinat();
		assertEquals(x,4);
		assertEquals(y,5);
		
		//test setAbsis(), setOrdinat()
		p2.setAbsis(3);
		p2.setOrdinat(10);
		x = p2.getAbsis();
		y = p2.getOrdinat();
		assertEquals(x,3);
		assertEquals(y,10);
		
		
	}

}
