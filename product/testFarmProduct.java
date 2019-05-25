package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFarmProduct {

	@Test
	public void test() {
		//test constructor
		FarmProduct f = new FarmProduct(50000, "tehKotak");
		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "tehKotak");
	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
