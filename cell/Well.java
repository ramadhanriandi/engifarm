package cell;
import render.*;

// Class for defining a well
public class Well extends Cell implements Renderable
{
		// default ctor
		public Well()
		{
			super();
			this.setIsFacilityOn(true);
			this.setIsWell(true);
		}

		// return object representation
		public final char render()
		{
			return 'W';
		}
}
