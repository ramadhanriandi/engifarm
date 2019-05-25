package animal;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;

public class testDuck {

	@Test
	public void test() {
		Point p = new Point(3,4);
		Duck c = new Duck(p);
		c.talking();
		
		//testgetPosition()
		Point p1 = new Point();
		p1 = c.getPosition();
		
		Point p2 = new Point(3,4);
		assertEquals(p.getAbsis(), p1.getAbsis());
		assertEquals(p.getOrdinat(), p1.getOrdinat());
		
		//testgetName()
		String name = c.getName();
		assertEquals(name, "duck");
		
		//test getEnergy(), energy di awal setelah hewan diciptakan
		int energy = c.getEnergy();
		assertEquals(energy, 25);
		
		//test decreaseEnergy(), energy dikurangi 3 buah
		c.decreaseEnergy();
		c.decreaseEnergy();
		c.decreaseEnergy(); 
		energy = c.getEnergy();
		assertEquals(energy, 22);
		
		
		//test setEnergy(), energy di set menjadi maxEnergy
		c.setEnergy();
		energy = c.getEnergy();
		assertEquals(energy, 25);
		
		
		//test isReadyProduct()
		boolean ready = c.isReadyProduct();
		assertEquals(ready,false);
		
		//test setReadyProduct();
		c.setProductReady(true);
		ready = c.isReadyProduct();
		assertEquals(ready,true);
		
		//test getCountAnimal()
		int count = c.getCountAnimal();
		assertEquals(count, 1);
	}

}
