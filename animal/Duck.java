package animal;
import java.util.*;
import point.*;

public class Duck extends Animal
{
		//konstruktor
		public Duck(Point p)
		{
			super("duck", 25, p, 25, true, true, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("wek wek duck");
			System.out.print("\n");
		}
}
