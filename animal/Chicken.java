package animal;
import java.util.*;
import point.*;

public class Chicken extends Animal
{
		//konstruktor
		public Chicken(Point p)
		{
			super("chicken", 20,p, 20, true, true, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("petok petok chicken");
			System.out.print("\n");
		}
}
