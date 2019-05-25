package animal;

import static org.junit.Assert.*;

import org.junit.Test;
import point.*;

public class testBuffalo {

	@Test
	public void testBuff() {
		Point p = new Point(3,3);
		Buffalo b = new Buffalo(p);
		b.talking();
		
		//testgetPosition()
		Point p1 = new Point();
		p1 = b.getPosition();
		
		Point p2 = new Point(3,3);
		assertEquals(p.getAbsis(), p1.getAbsis());
		assertEquals(p.getOrdinat(), p1.getOrdinat());
		
		//testgetName()
		String name = b.getName();
		assertEquals(name, "buffalo");
		
		//test getEnergy(), energy di awal setelah hewan diciptakan
		int energy = b.getEnergy();
		assertEquals(energy, 30);
		
		//test decreaseEnergy(), energy dikurangi 3 buah
		b.decreaseEnergy();
		b.decreaseEnergy();
		b.decreaseEnergy(); 
		energy = b.getEnergy();
		assertEquals(energy, 27);
		
		
		//test setEnergy(), energy di set menjadi maxEnergy
		b.setEnergy();
		energy = b.getEnergy();
		assertEquals(energy, 30);
		
		
		//test isReadyProduct()
		boolean ready = b.isReadyProduct();
		assertEquals(ready,false);
		
		//test setReadyProduct();
		b.setProductReady(true);
		ready = b.isReadyProduct();
		assertEquals(ready,true);
		
		//test getCountAnimal()
		int count = b.getCountAnimal();
		assertEquals(count, 1);
		
	}

}
