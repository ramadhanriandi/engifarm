package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testGrassLand {

	@Test
	public void test() {
		//test constructor
		Grassland b = new Grassland();
		
		//test render
		char c = b.render();
		assertEquals(c, '-');
		
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
