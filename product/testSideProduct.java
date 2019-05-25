package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSideProduct {

	@Test
	public void test() {
		Product[] pi = new Product[2];
		FarmProduct f1 = new FarmProduct(50000, "dagingSapi");
		FarmProduct f2 = new FarmProduct(50000, "susuSapi");
		pi[0] = f1;
		pi[1] = f2;
		
		
		SideProduct f = new SideProduct(50000, pi, 2 , "steakSapi");
		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "steakSapi");
	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
		
		// test printBahanBaku();
		f.printBahanBaku();
		
		//test dispose
		f.dispose();
	}

}
