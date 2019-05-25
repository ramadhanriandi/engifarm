package animal;
import java.util.*;
import point.*;
import cell.*;

public abstract class Animal
{ //kelas ABC
		protected String name;
		protected int maxEnergy; //maksimum energy yang dapat dimiliki hewan
		protected int energy; //energy yang dimiliki hewan
		protected Point position = new Point(); //posisi hewan
		protected boolean readyProduct; //diisi apakah product sudah dibuat atau belum.
		protected static int countAnimal = 0; //banyaknya objek hewan pada saat runtime
		protected boolean meatProducingAnimal;
		protected boolean eggProducingAnimal;
		protected boolean milkProducingAnimal;
		//ctor, cctor, dtor, assignment. tidak perlu dibuat.
		public Animal()
		{
			this.maxEnergy = 10;
			this.energy = 10;
			this.position.setAbsis(0);
			this.position.setOrdinat(0);
			this.readyProduct = false;
		}
		public Animal(String name, int energy, Point position, int maxEnergy, boolean meatProducingAnimal, boolean eggProducingAnimal, boolean milkProducingAnimal)
		{
			this.name = name;
			this.maxEnergy = maxEnergy;
			this.energy = energy;
			this.position.setAbsis(position.getAbsis());
			this.position.setOrdinat(position.getOrdinat());
			this.readyProduct = false;
			this.meatProducingAnimal = meatProducingAnimal;
			this.eggProducingAnimal = eggProducingAnimal;
			this.milkProducingAnimal = milkProducingAnimal;
			countAnimal++;
		}
		//getter setter
		public final String getName()
		{
			return name;
		}
		public final int getEnergy()
		{
			return energy;
		}
		public final void setEnergy()
		{
			energy = maxEnergy;
		}
		public final Point getPosition()
		{
			return position;
		}
		public final void setPosition(Point p)
		{
			position.setAbsis(p.getAbsis());
			position.setOrdinat(p.getOrdinat());
		}
		public final void setProductReady(boolean b)
		{
			readyProduct = b;
		}

		//method lain
		public final void decreaseEnergy()
		{
			energy--;
		}
		//public final void animalMovePosition(MatrixOfCell c)
		public final void animalMovePosition(MatrixOfCell c)
		{
			int deltaX;
			int deltaY;
			Random rand = new Random();
			deltaX = rand.nextInt(50) % 3;
			deltaY = rand.nextInt(50) % 3;;

			int tempX;
			int tempY;

			if (deltaX == 0)
			{
				tempX = getPosition().getAbsis() + 1;
			}
			else if (deltaX == 1)
			{
				tempX = getPosition().getAbsis();
			}
			else
			{
				tempX = getPosition().getAbsis() - 1;
			}

			if (deltaY == 0)
			{
				tempY = getPosition().getOrdinat() + 1;
			}
			else if (deltaY == 1)
			{
				tempY = getPosition().getOrdinat();
			}
			else
			{
				tempY = getPosition().getOrdinat() - 1;
			}

			c.getCell(getPosition().getAbsis(), getPosition().getOrdinat()).setIsAnimalOn(false);
			if (tempX >= 0 && tempX <= 10)
			{
				if (tempY >= 0 && tempY <= 10)
				{
					if (!c.getCell(tempX, tempY).getIsPlayerOn() && !c.getCell(tempX, tempY).getIsFacilityOn() && !c.getCell(tempX, tempY).getIsAnimalOn())
					{
						if ((getName().equals("chicken") || getName().equals("duck") || getName().equals("eagle")) && c.getCell(tempX, tempY).getIsCoop())
						{
							position.setAbsis(tempX);
							position.setOrdinat(tempY);
						}
						else if ((getName().equals("cow") || getName().equals("buffalo")) && c.getCell(tempX, tempY).getIsBarn())
						{
							position.setAbsis(tempX);
							position.setOrdinat(tempY);
						}
					}
				}
			}

			if (getEnergy() < 10 && c.getCell(getPosition().getAbsis(), getPosition().getOrdinat()).getIsGrassOn())
			{
				c.getCell(getPosition().getAbsis(), getPosition().getOrdinat()).setIsGrassOn(false);
				setEnergy();
			}
			else
			{
				decreaseEnergy();
			}


			c.getCell(getPosition().getAbsis(), getPosition().getOrdinat()).setIsAnimalOn(true);
		}
		public final int getCountAnimal()
		{
			return countAnimal;
		}
		public final boolean isReadyProduct()
		{
			return readyProduct;
		}
		public final void addAnimal()
		{
			countAnimal++;
		}
		public abstract void talking();



}
