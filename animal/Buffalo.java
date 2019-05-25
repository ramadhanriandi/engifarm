package animal;

import java.util.*;
import point.*;

public class Buffalo extends Animal
{
		//konstruktor
		public Buffalo(Point p)
		{
			super("buffalo", 30,p, 30, true, false, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("wer wer buffalo");
			System.out.print("\n");
		}
}
