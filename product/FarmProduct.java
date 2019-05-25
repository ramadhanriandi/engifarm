package product;
public class FarmProduct extends Product
{
		public FarmProduct(int harga, String namaProduk)
		{
			super(harga, namaProduk);

		}
		@Override
		public final int getHarga()
		{
		  return harga;
		}
}
