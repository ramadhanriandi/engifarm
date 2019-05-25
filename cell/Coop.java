package cell;
import render.*;

// Class for defining a coop
public class Coop extends Cell implements Renderable
{
		// default ctor
		public Coop()
		{
			super();
			this.setIsCoop(true);
		}

		// return object representation
		public final char render()
		{
			if (this.getIsPlayerOn())
			{
				return 'P';
			}
			else
			{
				if (this.getIsGrassOn())
				{
					return '*';
				}
				else
				{
					return 'o';
				}
			}
		}

		// grass grows when player water the land
		public final void grassGrow()
		{
			this.setIsGrassOn(true);
		}

		// grass is eaten by farm animal
		public final void grassEaten()
		{
			this.setIsGrassOn(false);
		}
}
