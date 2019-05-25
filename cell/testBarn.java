package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBarn {

	//kelas ini mengetes barn sekaligus cell (parent dari barn)
	@Test
	public void test() {
		
		//test constructor
		Barn b = new Barn();
		
		//test render
		char c = b.render();
		assertEquals(c, 'x');
		
		//test grassGrow()
		b.grassGrow();
		assertEquals(b.getIsGrassOn(),true);
		
		//test grassEaten()
		b.grassEaten();
		assertEquals(b.getIsGrassOn(),false);
		
		//test getIsPlayerOn()
		assertEquals(b.getIsPlayerOn(),false);
		
		//test setPlayer()
		b.setIsPlayerOn(true);
		assertEquals(b.getIsPlayerOn(),true);
		
		//test getIsAnimalOn()
		assertEquals(b.getIsAnimalOn(),false);
				
		//test setIsAnimalOn()()
		b.setIsAnimalOn(true);
		assertEquals(b.getIsAnimalOn(),true);
		
		//test getIsFacilityOn()
		assertEquals(b.getIsFacilityOn(),false);
						
		//test setIsFacilityOn()
		b.setIsFacilityOn(true);
		assertEquals(b.getIsFacilityOn(),true);
		
		//test getIsBarn(), karena ini kelas barn maka getIsBarn() mulanya true
		assertEquals(b.getIsBarn(),true);
								
		//test setIsBarn()
		b.setIsBarn(false);
		assertEquals(b.getIsBarn(),false);
		
		//test getIsCoop()
		assertEquals(b.getIsCoop(),false);
								
		//test setIsCoop()
		b.setIsCoop(true);
		assertEquals(b.getIsCoop(),true);
		
		//test getIsGrassland()
		assertEquals(b.getIsGrassland(),false);
										
		//test setIsGrassland()
		b.setIsGrassland(true);
		assertEquals(b.getIsGrassland(),true);
		
		//test getIsMixer()
		assertEquals(b.getIsMixer(),false);
										
		//test setIsMixer()
		b.setIsMixer(true);
		assertEquals(b.getIsMixer(),true);
		
		//test getIsTruck()
		assertEquals(b.getIsTruck(),false);
								
		//test setIsTruck()
		b.setIsTruck(true);
		assertEquals(b.getIsTruck(),true);
		
		//test getIsWell()
		assertEquals(b.getIsWell(),false);
								
		//test setIsWell()
		b.setIsWell(true);
		assertEquals(b.getIsWell(),true);
		
	}

}
