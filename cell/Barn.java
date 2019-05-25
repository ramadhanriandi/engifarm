package cell;
import render.*;

// Class for defining a barn
public class Barn extends Cell implements Renderable
{
		// default ctor
		public Barn()
		{
			super();
			this.setIsBarn(true);
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
					return '@';
				}
				else
				{
					return 'x';
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
