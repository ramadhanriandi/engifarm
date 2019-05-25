package animal;
import java.util.*;
import point.*;

public class Cow extends Animal
{
		//konstruktor
		public Cow(Point p)
		{
			super("cow", 30, p, 30, true, false, true);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("mooo cow");
			System.out.print("\n");
		}
}
