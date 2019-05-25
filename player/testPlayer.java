package player;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import animal.Buffalo;
import animal.Chicken;
import animal.Cow;
import cell.Barn;
import cell.Coop;
import cell.Grassland;
import cell.MatrixOfCell;
import cell.Mixer;
import cell.Truck;
import cell.Well;
import point.*;
import product.DagingAyam;
import product.DagingSapi;
import product.*;

public class testPlayer {

	@Test
	public void test() {
		//test constructor
		Player p = new Player(5,5);
		
		//test getPosition()
		assertEquals(p.getPosition().getAbsis(),5);
		assertEquals(p.getPosition().getOrdinat(),5);
		
		//test getWaterContainer()
		int w = p.getWaterContainer();
		assertEquals(w,10);
		
		
		MatrixOfCell m = new MatrixOfCell(11,11);
		  m.setCell(0,0,new Coop());
		  m.setCell(1,0,new Coop());
		  m.setCell(2,0,new Coop());
		  m.setCell(0,1,new Coop());
		  m.setCell(1,1,new Coop());
		  m.getCell(1,1).setIsGrassOn(true);
		  m.setCell(2,1,new Coop());
		  m.getCell(2,1).setIsGrassOn(true);
		  m.setCell(0,2,new Coop());
		  m.setCell(1,2,new Coop());
		  m.getCell(1,2).setIsGrassOn(true);
		  m.setCell(2,2,new Coop());

		  m.setCell(0,4,new Barn());
		  m.setCell(0,5,new Barn());
		  m.setCell(0,6,new Barn());
		  m.setCell(0,7,new Barn());
		  m.setCell(1,4,new Barn());
		  m.setCell(1,5,new Barn());
		  m.setCell(1,6,new Barn());
		  m.setCell(1,7,new Barn());
		  m.setCell(2,4,new Barn());
		  m.setCell(2,5,new Barn());
		  m.setCell(2,6,new Barn());
		  m.getCell(2,6).setIsGrassOn(true);
		  m.setCell(2,7,new Barn());
		  m.getCell(2,7).setIsGrassOn(true);
		  m.setCell(3,4,new Barn());
		  m.setCell(3,5,new Barn());
		  m.setCell(3,6,new Barn());
		  m.setCell(3,7,new Barn());
		  m.getCell(3,7).setIsGrassOn(true);
		  m.setCell(4,4,new Barn());
		  m.setCell(4,5,new Truck());
		  m.setCell(4,6,new Barn());
		  m.setCell(4,7,new Barn());
		  m.setCell(5,4,new Barn());
		  m.setCell(5,5,new Barn());
		  m.getCell(5,5).setIsPlayerOn(true);
		  m.setCell(5,6,new Barn());
		  m.setCell(5,7,new Barn());

		  m.setCell(3,0,new Grassland());
		  m.setCell(4,0,new Grassland());
		  m.setCell(5,0,new Grassland());
		  m.setCell(6,0,new Grassland());
		  m.setCell(7,0,new Grassland());
		  m.setCell(8,0,new Grassland());
		  m.setCell(9,0,new Grassland());
		  m.setCell(10,0,new Grassland());
		  m.setCell(3,1,new Grassland());
		  m.setCell(4,1,new Grassland());
		  m.setCell(5,1,new Grassland());
		  m.setCell(6,1,new Grassland());
		  m.setCell(7,1,new Grassland());
		  m.setCell(8,1,new Grassland());
		  m.setCell(9,1,new Grassland());
		  m.setCell(10,1,new Grassland());
		  m.setCell(3,2,new Grassland());
		  m.setCell(4,2,new Grassland());
		  m.setCell(5,2,new Grassland());
		  m.setCell(6,2,new Grassland());
		  m.setCell(7,2,new Grassland());
		  m.setCell(8,2,new Grassland());
		  m.getCell(8,2).setIsGrassOn(true);
		  m.setCell(9,2,new Grassland());
		  m.getCell(9,2).setIsGrassOn(true);
		  m.setCell(10,2,new Grassland());
		  m.setCell(0,3,new Grassland());
		  m.setCell(1,3,new Grassland());
		  m.setCell(2,3,new Grassland());
		  m.setCell(3,3,new Grassland());
		  m.setCell(4,3,new Grassland());
		  m.setCell(5,3,new Grassland());
		  m.setCell(6,3,new Grassland());
		  m.setCell(7,3,new Grassland());
		  m.setCell(8,3,new Grassland());
		  m.setCell(9,3,new Grassland());
		  m.getCell(9,3).setIsGrassOn(true);
		  m.setCell(10,3,new Grassland());
		  m.getCell(10,3).setIsGrassOn(true);
		  m.setCell(6,4,new Grassland());
		  m.setCell(7,4,new Grassland());
		  m.setCell(8,4,new Grassland());
		  m.setCell(9,4,new Grassland());
		  m.setCell(10,4,new Grassland());
		  m.getCell(10,4).setIsGrassOn(true);
		  m.setCell(6,5,new Grassland());
		  m.setCell(7,5,new Grassland());
		  m.setCell(8,5,new Grassland());
		  m.setCell(9,5,new Grassland());
		  m.setCell(10,5,new Grassland());
		  m.setCell(6,6,new Grassland());
		  m.setCell(7,6,new Grassland());
		  m.setCell(8,6,new Grassland());
		  m.setCell(9,6,new Grassland());
		  m.setCell(10,6,new Grassland());
		  m.setCell(6,7,new Grassland());
		  m.setCell(7,7,new Grassland());
		  m.setCell(8,7,new Grassland());
		  m.setCell(9,7,new Grassland());
		  m.setCell(10,7,new Grassland());
		  m.setCell(0,8,new Grassland());
		  m.setCell(1,8,new Grassland());
		  m.setCell(2,8,new Grassland());
		  m.setCell(3,8,new Grassland());
		  m.setCell(4,8,new Grassland());
		  m.setCell(5,8,new Grassland());
		  m.setCell(6,8,new Grassland());
		  m.setCell(7,8,new Grassland());
		  m.setCell(8,8,new Grassland());
		  m.setCell(9,8,new Grassland());
		  m.setCell(10,8,new Grassland());
		  m.setCell(0,9,new Grassland());
		  m.setCell(1,9,new Grassland());
		  m.setCell(2,9,new Grassland());
		  m.setCell(3,9,new Grassland());
		  m.setCell(4,9,new Grassland());
		  m.setCell(5,9,new Grassland());
		  m.setCell(6,9,new Grassland());
		  m.setCell(7,9,new Grassland());
		  m.setCell(8,9,new Grassland());
		  m.setCell(9,9,new Grassland());
		  m.setCell(10,9,new Grassland());
		  m.setCell(0,10,new Truck());
	      m.setCell(1,10,new Grassland());
		  m.setCell(2,10,new Mixer());
		  m.setCell(3,10,new Grassland());
		  m.setCell(4,10,new Well());
		  m.setCell(5,10,new Grassland());
		  m.setCell(6,10,new Grassland());
		  m.setCell(7,10,new Grassland());
		  m.setCell(8,10,new Grassland());
		  m.setCell(9,10,new Grassland());
		  m.setCell(10,10,new Grassland());
		  
		  Point posisii = new Point(1,1);
		  Chicken ayam = new Chicken(posisii);

		  
		  //test insert animal
		  p.insertanimal(ayam);
		  m.getCell(1,1).setIsAnimalOn(true);
		  assertEquals(m.getCell(1,1).getIsAnimalOn(),true);
		  
		  Point posisi = new Point(3,4);
		  Cow c = new Cow(posisi);
		  p.insertanimal(c);
		  m.getCell(3,4).setIsAnimalOn(true);
		  assertEquals(m.getCell(3,4).getIsAnimalOn(),true);
		  
		  Point posisi2 = new Point(5,6);
		  Buffalo b = new Buffalo(posisi2);
		  p.insertanimal(b);
		  m.getCell(5,6).setIsAnimalOn(true);
		  assertEquals(m.getCell(5,6).getIsAnimalOn(),true);
		  
		  //test fillbag
		  DagingAyam pahaayam = new DagingAyam(5000);
		  p.fillBag(pahaayam);
		  DagingSapi pahasapi = new DagingSapi(5000);
		  p.fillBag(pahasapi);
		  FarmProduct f = new FarmProduct(5000, "dagingAyam");
		  assertEquals(p.bag.get(0).getNamaProduk(),f.getNamaProduk());
		  assertEquals(p.bag.get(0).getHarga(),f.getHarga());
		  
		  FarmProduct f1 = new FarmProduct(5000, "dagingSapi");
		  assertEquals(p.bag.get(1).getNamaProduk(),f1.getNamaProduk());
		  assertEquals(p.bag.get(1).getHarga(),f.getHarga());
		  
		  // test draw();
		  p.Draw(m);
		  
		  // test talk
		  p.talk(m);
		  
		  //test kill, set cow di posisi yang sama dengan player
		  posisi = new Point(5,5);
		  Cow c1 = new Cow(posisi);
		  p.insertanimal(c1);
		  m.getCell(5,5).setIsAnimalOn(true);
		  assertEquals(m.getCell(5,5).getIsAnimalOn(),true);
		  p.kill(m);
		  
		  
		  //test interract dengan truk yang ada di posisi 4,5.menjual semua barang di bag
		  p.interract(m);
		  
		  //test move(), player bergerak ke kiri sebanyak 1 petak
		  p.move(m, 2);
		  p.Draw(m);
		  
		  
		  //test facilitynearby(MatrixOfCell c), truck berada di dekat player
		  String s = p.facilitynearby(m);
		  assertEquals(s,"truck");
		  
		  //test cekAnimal(int x, int y);
		  char g = p.cekAnimal(5,6);
		  assertEquals(g,'B');
		  
		  //test moveallanimal(m)
		  p.moveallanimal(m);
		  System.out.println();
		  System.out.println();
		  p.Draw(m);
		  
		  
		  
		  
		
	}

}
