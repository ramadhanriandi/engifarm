package animal;
import java.util.*;
import point.*;

public class Eagle extends Animal
{
		//konstruktor
		public Eagle(Point p)
		{
			super("eagle", 24, p, 24, true, false, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("ngeng ngeng eagle");
			System.out.print("\n");
		}
}
