package cell;
import render.*;

// class of Cell collection
public class MatrixOfCell
{
		// define size
		private int height;
		private int width;

		// array of array of cell
		private Cell[][] data;

		// user-defined ctor
		public MatrixOfCell(int _height, int _width)
		{
			height = _height;
			width = _width;
			data = new Cell[height][];
			for (int i = 0; i < height; i++)
			{
				data[i] = new Cell[width];
				for (int j = 0; j < width; j++)
				{
					Cell[][] data = new Cell[i][j];
				}
			}
		}

		// getter
		public final int getHeight()
		{
			return height;
		}
		public final int getWidth()
		{
			return width;
		}
		public final Cell getCell(int i, int j)
		{
			return data[j][i];
		}

		// setter
		public final void setHeight(int _height)
		{
			height = _height;
		}
		public final void setWidth(int _width)
		{
			width = _width;
		}
		public final void setCell(int i, int j, Cell c)
		{
			data[j][i] = c;
		}
}
