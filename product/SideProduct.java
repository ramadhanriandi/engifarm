package product;
public class SideProduct extends Product
{
		protected Product[] bahanBaku;
		protected int bnyk_bahanBaku;
		public SideProduct(int harga, Product[] bahanBaku, int bnyk_bahanBaku, String namaProduk)
		{
			super(harga, namaProduk);
			this.bnyk_bahanBaku = bnyk_bahanBaku;
			this.bahanBaku = new Product[bnyk_bahanBaku];

			for (int i = 0; i < bnyk_bahanBaku; i++)
			{
				this.bahanBaku[i] = bahanBaku[i];
			}
		}
		public void dispose()
		{
			this.bahanBaku = null;
		}

		@Override
		public final int getHarga()
		{
		  return harga;
		}

		public final void printBahanBaku()
		{
			System.out.println("bahan bakunya adalah");
			for (int i = 0; i < bnyk_bahanBaku; i++)
			{
				System.out.print(bahanBaku[i].getNamaProduk() + " ");
				System.out.print(bahanBaku[i].getHarga());
				System.out.print("\n");
			}
		}
}
