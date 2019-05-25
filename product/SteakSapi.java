package product;
public class SteakSapi extends SideProduct
{
		public SteakSapi(int harga, Product[] bahanBaku, int bnyk_bahanBaku)
		{
			super(harga, bahanBaku, bnyk_bahanBaku, "steakSapi");

		}
		public final int getBnykBahanBaku()
		{
		  return bnyk_bahanBaku;
		}

}
