package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTelurAyam {

	@Test
	public void test() {
		//create product
		TelurAyam f = new TelurAyam(50000);
																
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "telurAyam");
															
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
