package animal;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;

public class testChicken {

	@Test
	public void test() {
		Point p = new Point(3,4);
		Chicken c = new Chicken(p);
		c.talking();
		
		//testgetPosition()
		Point p1 = new Point();
		p1 = c.getPosition();
		
		Point p2 = new Point(3,4);
		assertEquals(p.getAbsis(), p1.getAbsis());
		assertEquals(p.getOrdinat(), p1.getOrdinat());
		
		//testgetName()
		String name = c.getName();
		assertEquals(name, "chicken");
		
		//test getEnergy(), energy di awal setelah hewan diciptakan
		int energy = c.getEnergy();
		assertEquals(energy, 20);
		
		//test decreaseEnergy(), energy dikurangi 3 buah
		c.decreaseEnergy();
		c.decreaseEnergy();
		c.decreaseEnergy(); 
		energy = c.getEnergy();
		assertEquals(energy, 17);
		
		
		//test setEnergy(), energy di set menjadi maxEnergy
		c.setEnergy();
		energy = c.getEnergy();
		assertEquals(energy, 20);
		
		
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
