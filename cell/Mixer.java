package cell;
import render.*;

// Class for defining a mixer
public class Mixer extends Cell implements Renderable
{
		// default ctor
		public Mixer()
		{
			super();
			this.setIsFacilityOn(true);
			this.setIsMixer(true);
		}

		// return object representation
		public final char render()
		{
			return 'M';
		}
}
