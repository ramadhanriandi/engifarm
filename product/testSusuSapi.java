package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSusuSapi {

	@Test
	public void test() {
		//create product
		SusuSapi f = new SusuSapi(50000);
														
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "susuSapi");
													
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
