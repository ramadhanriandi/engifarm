package animal;
import java.util.*;
import point.*;

public class Cat extends Animal
{
		//konstruktor
		public Cat(Point p)
		{
			super("cat", 24, p, 24, true, false, false);
			//animal(int energy, Point position, int maxEnergy, bool meatProducingAnimal, bool eggProducingAnimal, bool milkProducingAnimal)
		}
		//method
		@Override
		public final void talking()
		{
			System.out.print("meong meong");
			System.out.print("\n");
		}
}
