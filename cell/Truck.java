package cell;
import render.*;

// Class for defining a truck
public class Truck extends Cell implements Renderable
{
		// default ctor
		public Truck()
		{
			super();
			this.setIsFacilityOn(true);
			this.setIsTruck(true);
		}

		// return object representation
		public final char render()
		{
			return 'T';
		}
}
