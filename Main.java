import java.util.*;
import player.*;
import product.*;
import cell.*;
import linkedlist.*;
import point.*;
import render.*;
import animal.*;

public class Main {
	public static void main(String[] args) {
	  Player p = new Player(5,5);

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
	  m.setCell(4,5,new Barn());
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
	  p.insertanimal(ayam);
	  m.getCell(1,1).setIsAnimalOn(true);

	  Point posisi = new Point(2,7);
	  Cow c = new Cow(posisi);
	  p.insertanimal(c);
	  m.getCell(2,7).setIsAnimalOn(true);

	  Point posisi2 = new Point(3,6);
	  Buffalo b = new Buffalo(posisi2);
	  p.insertanimal(b);
	  m.getCell(3,6).setIsAnimalOn(true);

	  DagingAyam pahaayam = new DagingAyam(5000);
		p.fillBag(pahaayam);
		DagingSapi pahasapi = new DagingSapi(5000);
	  p.fillBag(pahasapi);

	  // m.Draw();
	  p.Draw(m);

	  while(p.animalList.getLength() !=0) {
	    System.out.println("Daftar command :");
	    System.out.println("1. Move");
	    System.out.println("2. GrowGrass");
	    System.out.println("3. Talk");
	    System.out.println("4. Kill");
	    System.out.println("5. Interact");
	    System.out.println("6. Animal List");
	    System.out.println("7. Bag List");

	    int a;
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			a = reader.nextInt();
	    if(a==1)  {
	      System.out.println("gerak kemana?");
	      System.out.println("1. Up");
	      System.out.println("2. Left");
	      System.out.println("3. Right");
	      System.out.println("4. Down");
	      a = reader.nextInt();
	      if(a>0 && a<5)  {
	        p.move(m,a);
	      }
	    }
	    else if(a==2)  {
	      p.grow(m);
	    }
	    else if(a==3)  {
	      p.talk(m);
	    }
	    else if(a==4)  {
	      p.kill(m);
	    }
	    else if(a==5)  {
	      p.interract(m);
	    }

	    else if(a==6)  {
	      for(int i=0; i< p.animalList.getLength();i++) {
	        System.out.println(p.animalList.get(i).getName() + " : " + p.animalList.get(i).getEnergy());
	      }
	    }

	    else if(a==7)  {
	      for(int i=0; i< p.bag.getLength();i++) {
	        System.out.println(p.bag.get(i).getNamaProduk() + " : " + p.bag.get(i).getHarga());
	      }
	    }

	    p.moveallanimal(m);
	    p.animalstarve(m);

	    p.Draw(m);
	  }
	  System.out.print("Game Over");

	}
}
