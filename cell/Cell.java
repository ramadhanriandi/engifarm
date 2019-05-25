package cell;

import render.*;

// Class for defining a cell
public abstract class Cell
{
		// stated whether there is another object on the top of land or not
		private boolean isPlayerOn;
		private boolean isAnimalOn;
		private boolean isGrassOn;
		private boolean isFacilityOn;
		private boolean isBarn;
		private boolean isCoop;
		private boolean isGrassland;
		private boolean isMixer;
		private boolean isTruck;
		private boolean isWell;

		// default ctor
		public Cell()
		{
			isPlayerOn = false;
			isAnimalOn = false;
			isGrassOn = false;
			isFacilityOn = false;
			isBarn = false;
			isCoop = false;
			isGrassland = false;
			isMixer = false;
			isTruck = false;
			isWell = false;
		}

		// getter
		public final boolean getIsPlayerOn()
		{
			return isPlayerOn;
		}
		public final boolean getIsAnimalOn()
		{
			return isAnimalOn;
		}
		public final boolean getIsGrassOn()
		{
			return isGrassOn;
		}
		public final boolean getIsFacilityOn()
		{
			return isFacilityOn;
		}
		public final boolean getIsBarn()
		{
			return isBarn;
		}
		public final boolean getIsCoop()
		{
			return isCoop;
		}
		public final boolean getIsGrassland()
		{
			return isGrassland;
		}
		public final boolean getIsMixer()
		{
			return isMixer;
		}
		public final boolean getIsTruck()
		{
			return isTruck;
		}
		public final boolean getIsWell()
		{
			return isWell;
		}

		// setter
		public void setIsPlayerOn(boolean _isPlayerOn)
		{
			isPlayerOn = _isPlayerOn;
		}
		public void setIsAnimalOn(boolean _isAnimalOn)
		{
			isAnimalOn = _isAnimalOn;
		}
		public void setIsGrassOn(boolean _isGrassOn)
		{
			isGrassOn = _isGrassOn;
		}
		public void setIsFacilityOn(boolean _isFacilityOn)
		{
			isFacilityOn = _isFacilityOn;
		}
		public void setIsBarn(boolean _isBarn)
		{
			isBarn = _isBarn;
		}
		public void setIsCoop(boolean _isCoop)
		{
			isCoop = _isCoop;
		}
		public void setIsGrassland(boolean _isGrassland)
		{
			isGrassland = _isGrassland;
		}
		public void setIsMixer(boolean _isMixer)
		{
			isMixer = _isMixer;
		}
		public void setIsTruck(boolean _isTruck)
		{
			isTruck = _isTruck;
		}
		public void setIsWell(boolean _isWell)
		{
			isWell = _isWell;
		}

		// return object representation
		public abstract char render();
}
