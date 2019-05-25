package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTelurBebek {

	@Test
	public void test() {
		//create product
		TelurBebek f = new TelurBebek(50000);
																		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "telurBebek");
																	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
