package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMatrixOfCell {

	@Test
	public void test() {
		//test constructor
		MatrixOfCell m = new MatrixOfCell(2,3);
		
		//test getHeight
		int h = m.getHeight();
		assertEquals(h,2);
		
		//test getWidth
		h = m.getWidth();
		assertEquals(h,3);
		
		//test getCell(int i, int j), tidak bisa di assertEquals karena tidak bisa dibuat objek cell, cell merupakan kelas abstract
		Cell c = m.getCell(1,1);
		
		//test setHeight()
		m.setHeight(1);
		h = m.getHeight();
		assertEquals(h,1);
		
		
		//test setWidth
		m.setWidth(3);
		h = m.getWidth();
		assertEquals(h,3);
		
		//test setCell
		m.setCell(0,0,c);
		
		
	}

}
