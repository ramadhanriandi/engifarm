package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testOporTelur {

	@Test
	public void test() {
		Product[] pi = new Product[1];
		FarmProduct f1 = new FarmProduct(50000, "telurAyam");
		pi[0] = f1;
		
		
		OporTelur f = new OporTelur(100000, pi, 1);
		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "oporTelur");
	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 100000);
		
		// test printBahanBaku();
		f.printBahanBaku();
		
		//test dispose
		f.dispose();
	}

}
