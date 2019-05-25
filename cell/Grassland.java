package cell;
import render.*;

// Class for defining a grassland
public class Grassland extends Cell implements Renderable
{
		// default ctor
		public Grassland()
		{
			super();
			this.setIsGrassland(true);
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
					return '#';
				}
				else
				{
					return '-';
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
