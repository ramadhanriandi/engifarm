package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCoop {

	@Test
	public void test() {
		///test constructor
		Coop b = new Coop();
		
		//test render
		char c = b.render();
		assertEquals(c, 'o');
		
		//test grassGrow()
		b.grassGrow();
		assertEquals(b.getIsGrassOn(),true);
		
		//test grassEaten()
		b.grassEaten();
		assertEquals(b.getIsGrassOn(),false);
		
		//test getIsPlayerOn()
		assertEquals(b.getIsPlayerOn(),false);
	}

}
