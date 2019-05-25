package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSteakSapi {

	@Test
	public void test() {
		Product[] pi = new Product[1];
		FarmProduct f1 = new FarmProduct(50000, "dagingSapi");
		pi[0] = f1;
		
		
		SteakSapi f = new SteakSapi(100000, pi, 1);
		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "steakSapi");
	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 100000);
		
		// test printBahanBaku();
		f.printBahanBaku();
		
		//test dispose
		f.dispose();
	}

}
