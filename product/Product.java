package product;
public abstract class Product
{
		protected int harga;
		protected String namaProduk;
		public Product(int harga, String namaProduk)
		{
		  this.harga = harga;
		  this.namaProduk = namaProduk;
		}

		public abstract int getHarga();
		public int getBnykBahanBaku()
		{
		  return 0;
		}
		public final String getNamaProduk()
		{
		  return namaProduk;
		}
}
