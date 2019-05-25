package animal;
import java.util.*;
import point.*;

public class Rabbit extends Animal
{
		//konstruktor
		public Rabbit(Point p)
		{
			super("rabbit", 23,p, 23, true, false, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("wkwkkwk rabbit");
			System.out.print("\n");
		}
}
