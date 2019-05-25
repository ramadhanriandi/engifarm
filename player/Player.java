package player;

import java.util.*;
import product.*;
import cell.*;
import linkedlist.*;
import point.*;
import render.*;
import animal.*;

/*Class untuk instance player*/
public class Player implements Renderable
{

	// Posisi player
		private Point position = new Point();

	// variable yang menyimpan jumlah air untuk menyiram, max 10
	// 1 satuan air untuk menyiram 1 petak
		private int waterContainer;

		// list of product
		public LinkedListGeneric<Product> bag = new LinkedListGeneric<Product>();

		public LinkedListGeneric<Animal> animalList = new LinkedListGeneric<Animal>();

	// Hanya perlu default ctor dan dtor
	//Tidak perlu cctor dan assignment karena hanya ada 1 player dalam game
		public Player(int _x, int _y)
		{
		  position.setAbsis(_x);
		  position.setOrdinat(_y);

		  waterContainer = 10;
		}

	// Getter & Setter

		// Getter & Setter
		public final Point getPosition()
		{
		  return position;
		}
	public final int getWaterContainer()
	{
	  return waterContainer;
	}
		public final void fillWater()
		{
		  waterContainer = 10;
		}

		public final char render()
		{
		  return 'P';
		}


	// Berbicara dengan hewan, hewan akan mengeluarkan suara

		// Berbicara dengan hewan, hewan akan mengeluarkan suara
		public final void talk(MatrixOfCell c)
		{

		  if (isanimalnearby(c))
		  {

				findnearbyanimal(c).talking();
		  }
		  else
		  {
				System.out.print("Gaada hewan");
				System.out.print("\n");
		  }
		}

	// Berinteraksi dengan hewan atau facility di hadapan player
	// Facility: Well untuk mengisi watercontainer hingga penuh
	// Facility: Truck untuk mengosongkan tas dan menjual seluruh produk, Truck tidak dapat digunakan sementara

		// Berinteraksi dengan hewan atau facility di hadapan player
		// Facility: Well untuk mengisi watercontainer hingga penuh
		// Facility: Truck untuk mengosongkan tas dan menjual seluruh produk, Truck tidak dapat digunakan sementara
		public final void interract(MatrixOfCell c)
		{


		  String type = facilitynearby(c);
		  if (type.equals("well"))
		  {
			fillWater();
		  }
		  else if (type.equals("truck"))
		  {
			int sum = 0;
			int i = bag.getLength() - 1;

			while (!bag.isEmpty())
			{
			  sum += bag.get(i).getHarga();
			  bag.Delete(bag.get(i));
			  i--;
			}
			System.out.print("Total penjualan : ");
			System.out.print((sum));
			System.out.print("\n");
		  }
		  else if (type.equals("mixer"))
		  {
				int a;
				System.out.print("Daftar produk untuk mix :");
				System.out.print("\n");
				System.out.print("1. oporAyam");
				System.out.print("\n");
				System.out.print("2. oporTelur");
				System.out.print("\n");
				System.out.print("3. steakSapi");
				System.out.print("\n");

				Scanner reader = new Scanner(System.in);  // Reading from System.in
				a = reader.nextInt();
			if (a == 1)
			{
			  if (mix("oporAyam") != 0)
			  {
					Product[] bahanBaku = new Product[1];
					bahanBaku[0]= new DagingAyam(20000);
					OporAyam oporayam = new OporAyam(150000, bahanBaku, 1);
					fillBag(oporayam);
				System.out.print("Berhasil membuat oporAyam");
				System.out.print("\n");
			  }
			  else
			  {
				System.out.print("oporAyam gagal dibuat");
				System.out.print("\n");
			  }
			}
			else if (a == 2)
			{
			  if (mix("oporTelur") != 0)
			  {
				Product[] bahanBaku = new Product[2];
				bahanBaku[0]= new TelurBebek(2000);
				bahanBaku[1]= new TelurAyam(1000);
				OporTelur oportelur = new OporTelur(150000, bahanBaku, 1);
				fillBag(oportelur);
				System.out.print("Berhasil membuat oporTelur");
				System.out.print("\n");
			  }
			  else
			  {
				System.out.print("oporTelur gagal dibuat");
				System.out.print("\n");
			  }
			}
			else if (a == 3)
			{
			  if (mix("steakSapi") != 0)
			  {
					Product[] bahanBaku = new Product[1];
					bahanBaku[0]= new DagingSapi(50000);
					SteakSapi steak = new SteakSapi(150000, bahanBaku, 1);
					fillBag(steak);
					System.out.print("Berhasil membuat steakSapi");
					System.out.print("\n");


			  }
			  else
			  {
				System.out.print("steakSapi gagal dibuat");
				System.out.print("\n");
			  }
			}
			else
			{
			  System.out.print("Mixer aborted");
			  System.out.print("\n");
			}
		  }

		  else if (isanimalnearby(c))
		  {

			String temp = findnearbyanimal(c).getName();


			if (findnearbyanimal(c).isReadyProduct())
			{
			  if (temp.equals("chicken"))
			  {
				TelurAyam z = new TelurAyam(5000);
				fillBag(z);
				System.out.print("Dapet telur ayam");
				System.out.print("\n");
			  }
			  else if (temp.equals("duck"))
			  {
				TelurBebek y = new TelurBebek(5000);
				fillBag(y);
				System.out.print("Dapet telur bebek");
				System.out.print("\n");
			  }
			  else if (temp.equals("cow"))
			  {
				SusuSapi u = new SusuSapi(150000);
				fillBag(u);
				System.out.print("Dapet susu sapi");
				System.out.print("\n");
			  }
			}

			findnearbyanimal(c).setProductReady(false);
		  }
		  else
		  {
			System.out.print("Ga ditemukan apa-apa");
			System.out.print("\n");
		  }


		}

	// Meng-kill hewan untuk mendapat daging

		// Meng-kill hewan untuk mendapat daging
		public final void kill(MatrixOfCell c)
		{

		  if (isanimalnearby(c))
		  {

			String temp = findnearbyanimal(c).getName();

			if (temp.equals("chicken"))
			{
			  DagingAyam z = new DagingAyam(5000);
			  fillBag(z);
			}
			else if (temp.equals("duck"))
			{
			  DagingBebek y = new DagingBebek(5000);
			  fillBag(y);
			}
			else if (temp.equals("rabbit"))
			{
			  DagingKelinci x = new DagingKelinci(5000);
			  fillBag(x);
			}
			else if (temp.equals("buffalo"))
			{
			  DagingKerbau w = new DagingKerbau(50000);
			  fillBag(w);
			}
			else if (temp.equals("cat"))
			{
			  DagingKucing v = new DagingKucing(250000);
			  fillBag(v);
			}
			else if (temp.equals("cow"))
			{
			  DagingSapi u = new DagingSapi(150000);
			  fillBag(u);
			}
			System.out.print(temp);
			System.out.print(" terbunuh");
			System.out.print("\n");

			int x = findnearbyanimal(c).getPosition().getAbsis();

			int y = findnearbyanimal(c).getPosition().getOrdinat();
			c.getCell(x, y).setIsAnimalOn(false);
			animalList.Delete(findbyposition(x, y));
		  }
		  else
		  {
			System.out.print("Gaada hewan");
			System.out.print("\n");
		  }
		}

	// Fungsi menyiram land di tempat player berdiri

		// Fungsi menyiram land di tempat player berdiri
		public final void grow(MatrixOfCell c)
		{
		  if (waterContainer > 0)
		  {
			c.getCell(position.getAbsis(), position.getOrdinat()).setIsGrassOn(true);
			waterContainer--;
		  }
		  else
		  {
			System.out.print("Gaada air");
			System.out.print("\n");
		  }
		}

	// Method untuk menggabungkan dua atau lebih farmproduct menjadi sideproduct

		// Method untuk menggabungkan dua atau lebih farmproduct menjadi sideproduct
		public final int mix(String namaSideProduk)
		{

		  String bhn1 ="a";
		  String bhn2 = "a";
		  boolean found;
		  int i;
		  int j;
		  /*pengisian bahan baku*/
		  if (namaSideProduk.compareTo("steakSapi") == 0)
		  {
			bhn1 = "dagingSapi";
		  }
		  else if (namaSideProduk.compareTo("oporAyam") == 0)
		  {
			bhn1 = "dagingAyam";
		  }
		  else if (namaSideProduk.compareTo("oporTelur") == 0)
		  {
			bhn1 = "telurAyam";
			bhn2 = "telurBebek";
		  }
		  else
		  {
			return -1;
		  }

		  /*bahan 1 tdk kosong artinya ada yang dibikin*/
		  if (bhn1.length() > 1)
		  {
			i = 0;
			found = false;
			
			while (!found && i < bag.getLength())
			{
			  if (bhn1.compareTo(bag.get(i).getNamaProduk()) == 0)
			  {
				found = true;
			  }
			  else
			  {
				i++;
			  }
			}

			/*bahan 1 ketemu di bag*/
			if (found)
			{
			  /*cuma 1 bahan baku*/
			  if (bhn2.length() == 1)
			  {
				bag.Delete(bag.get(i));
				return 1;
			  /*bahan baku ada 2 yaitu opor telur*/
			  }
			  else
			  {
				j = 0;
				found = false;
				while (!found && j < bag.getLength())
				{
				  if (bhn2.compareTo(bag.get(j).getNamaProduk()) == 0)
				  {
					found = true;
				  }
				  else
				  {
					j++;
				  }
				}
				/*bahan 2 ditemukan di bag*/
				if (found)
				{
				  /*telur ayam letaknya didepan telur bebek*/
				  if (i < j)
				  {
					bag.Delete(bag.get(i));
					bag.Delete(bag.get(j - 1));
				  /*telur bebek letaknya didepan telur ayam*/
				  }
				  else
				  {
					bag.Delete(bag.get(j));
					bag.Delete(bag.get(i - 1));
				  }
				  return 1;
				/*bahan 2 tdk ditemukan*/
				}
				else
				{
				  return -1;
				}
			  }
			/*bahan 1 tdk ditemukan*/
			} else {
				return -1;
			}
			}
			return 0;
		}

	// Method untuk player berpindah satu petak dengan arah tergantung parameter direction

	// Method untuk player berpindah satu petak dengan arah tergantung parameter direction
	public final void move(MatrixOfCell c, int direction)
	{
	  c.getCell(position.getAbsis(), position.getOrdinat()).setIsPlayerOn(false);

	  if (direction == 1 && position.getAbsis() - 1 >= 0 && position.getAbsis() - 1 <= 10)
	  { //up
		if (!c.getCell(position.getAbsis() - 1, position.getOrdinat()).getIsAnimalOn() && !c.getCell(position.getAbsis() - 1, position.getOrdinat()).getIsFacilityOn())
		{
		  position.setAbsis(position.getAbsis() - 1);
		}
		else
		{
		  System.out.print("Gerakan invalid");
		  System.out.print("\n");
		}
	  }
	  else if (direction == 2 && position.getOrdinat() - 1 >= 0 && position.getOrdinat() - 1 <= 10)
	  { //left
		if (!c.getCell(position.getAbsis(), position.getOrdinat() - 1).getIsAnimalOn() && !c.getCell(position.getAbsis(), position.getOrdinat() - 1).getIsFacilityOn())
		{
		  position.setOrdinat(position.getOrdinat() - 1);
		}
		else
		{
		  System.out.print("Gerakan invalid");
		  System.out.print("\n");
		}
	  }
	  else if (direction == 3 && position.getOrdinat() + 1 >= 0 && position.getOrdinat() + 1 <= 10)
	  { //right
		if (!c.getCell(position.getAbsis(), position.getOrdinat() + 1).getIsAnimalOn() && !c.getCell(position.getAbsis(), position.getOrdinat() + 1).getIsFacilityOn())
		{
		  position.setOrdinat(position.getOrdinat() + 1);
		}
		else
		{
		  System.out.print("Gerakan invalid");
		  System.out.print("\n");
		}
	  }
	  else if (direction == 4 && position.getAbsis() + 1 >= 0 && position.getAbsis() + 1 <= 10)
	  {
		if (!c.getCell(position.getAbsis() + 1, position.getOrdinat()).getIsAnimalOn() && !c.getCell(position.getAbsis() + 1, position.getOrdinat()).getIsFacilityOn())
		{
		  position.setAbsis(position.getAbsis() + 1);
		}
		else
		{
		  System.out.print("Gerakan invalid");
		  System.out.print("\n");
		}
	  }
	  else
	  {
		System.out.print("Gerakan invalid");
		System.out.print("\n");
	  }

	  c.getCell(position.getAbsis(), position.getOrdinat()).setIsPlayerOn(true);

	}

	// Method untuk mengisi bag dengan sebuah produk

	// Method untuk mengisi bag dengan sebuah produk
	public final void fillBag(Product P)
	{
	  bag.insertTail(P);
	}

		public final void insertanimal(Animal a)
		{
		  animalList.insertTail(a);
		}

		public final boolean isanimalnearby(MatrixOfCell c)
		{
		  boolean Found = false;
		  int i;
		  int j;
		  i = -1;
		  while (!Found && i <= 1)
		  {
			j = -1;
			while (!Found && j <= 1)
			{
			  if (getPosition().getAbsis() + i >= 0 && getPosition().getAbsis() + i <= 10 && getPosition().getOrdinat() + j >= 0 && getPosition().getOrdinat() + j <= 10)
			  {
				if (c.getCell(getPosition().getAbsis() + i, getPosition().getOrdinat() + j).getIsAnimalOn())
				{
				  Found = true;
				}
				else
				{
				  j++;
				}
			  }
			  else
			  {
				j++;
			  }
			}
			if (!Found)
			{
			  i++;
			}
		  }
		  return Found;
		}

		public final Animal findnearbyanimal(MatrixOfCell c)
		{
		  boolean Found = false;
		  int i,j;
		  i = -1;
		  int x=0;
		  int y=0;
		  while (!Found && i <= 1)
		  {
				j = -1;
				while (!Found && j <= 1)
				{
				  if (getPosition().getAbsis() + i >= 0 && getPosition().getAbsis() + i <= 10 && getPosition().getOrdinat() + j >= 0 && getPosition().getOrdinat() + j <= 10)
				  {
						if (c.getCell(getPosition().getAbsis() + i, getPosition().getOrdinat() + j).getIsAnimalOn())
						{
					  	Found = true;

					  	x = getPosition().getAbsis() + i;
					  	y = getPosition().getOrdinat() + j;
						}
						else
						{
					  	j++;
						}
				  }
				  else
				  {
						j++;
				  }
				}
				if (!Found)
				{
				  i++;
				}
		  }
		  if (Found)
		  {
				Found = false;
				i = 0;
				while (!Found && i < animalList.getLength())
				{
				  if (animalList.get(i).getPosition().getAbsis() == x && animalList.get(i).getPosition().getOrdinat() == y)
				  {
					Found = true;
				  }
				  else
				  {
					i++;
				  }
				}
				return animalList.get(i);
		  }
		  else
		  {
			  return null;
		  }
		}
		public final Animal findbyposition(int x, int y)
		{
		  boolean Found = false;
		  int i = 0;
		  while (!Found && i < animalList.getLength())
		  {
			if (animalList.get(i).getPosition().getAbsis() == x && animalList.get(i).getPosition().getOrdinat() == y)
			{
			  Found = true;
			}
			else
			{
			  i++;
			}
		  }
		  if (Found)
		  {
			return animalList.get(i);
		  }
		  else
		  {
			return animalList.get(0);
		  }
		}

		public final void animalstarve(MatrixOfCell c)
		{
		  for (int i = 0; i < animalList.getLength();i++)
		  {
			if (animalList.get(i).getEnergy() <= 0)
			{
			  System.out.print(animalList.get(i).getName());
			  System.out.print(" mati");
			  System.out.print("\n");
			  c.getCell(animalList.get(i).getPosition().getAbsis(), animalList.get(i).getPosition().getOrdinat()).setIsAnimalOn(false);
			  animalList.Delete(findbyposition(animalList.get(i).getPosition().getAbsis(), animalList.get(i).getPosition().getOrdinat()));
			}
		  }
		}

		public final String facilitynearby(MatrixOfCell c)
		{
		  int i;
		  int j;
		  i = -1;
		  int x;
		  int y;
		  while (i <= 1)
		  {
			j = -1;
			while (j <= 1)
			{
			  if (getPosition().getAbsis() + i >= 0 && getPosition().getAbsis() + i <= 10 && getPosition().getOrdinat() + j >= 0 && getPosition().getOrdinat() + j <= 10)
			  {
				if (c.getCell(getPosition().getAbsis() + i, getPosition().getOrdinat() + j).getIsWell())
				{
				  return "well";
				}
				else if (c.getCell(getPosition().getAbsis() + i, getPosition().getOrdinat() + j).getIsMixer())
				{
				  return "mixer";
				}
				else if (c.getCell(getPosition().getAbsis() + i, getPosition().getOrdinat() + j).getIsTruck())
				{
				  return "truck";
				}
				else
				{
				  j++;
				}
			  }
			  else
			  {
				j++;
			  }
			}
			i++;
		  }
		  return "none";
		}

		public final void moveallanimal(MatrixOfCell c)
		{
		  for (int i = 0; i < animalList.getLength();i++)
		  {
				animalList.get(i).animalMovePosition(c);
		  }
		}

		public final char cekAnimal(int x, int y)
		{
		  String temp_name = findbyposition(x, y).getName();

		  if (temp_name.equals("buffalo"))
		  {
			return 'B';
		  }
		  else if (temp_name.equals("cat"))
		  {
			return 'C';
		  }
		  else if (temp_name.equals("chicken"))
		  {
			return 'H';
		  }
		  else if (temp_name.equals("cow"))
		  {
			return 'O';
		  }
		  else if (temp_name.equals("duck"))
		  {
			return 'D';
		  }
		  else if (temp_name.equals("eagle"))
		  {
			return 'E';
		  }
		  else if (temp_name.equals("rabbit"))
		  {
			return 'R';
		  }
		  else
		  {
			return 'A';
		  }
		}

		public final void Draw(MatrixOfCell c)
		{
		  for (int i = 0; i < c.getHeight(); i++)
		  {
			for (int j = 0; j < c.getWidth(); j++)
			{
			  System.out.print("|");
			  if (c.getCell(i, j).getIsPlayerOn())
			  {
				System.out.print("P");
			  }
			  else if (c.getCell(i, j).getIsAnimalOn())
			  {
				System.out.print(cekAnimal(i, j));
			  }
			  else
			  {
				System.out.print(c.getCell(i, j).render());
			  }
			}
			System.out.print("|");
			System.out.print("\n");
		  }
		}
		
		public final char[][] DrawUI(MatrixOfCell c)
		{
			char[][] temp = new char[11][11];
		  for (int i = 0; i < c.getHeight(); i++)
		  {
			for (int j = 0; j < c.getWidth(); j++)
			{
			  if (c.getCell(i, j).getIsPlayerOn())
			  {
					temp[i][j]='P';
			  }
			  else if (c.getCell(i, j).getIsAnimalOn())
			  {
					temp[i][j]=(cekAnimal(i, j));
			  }
			  else
			  {
					temp[i][j]=(c.getCell(i, j).render());
			  }
			}
		  }
			return temp;
		}

}
