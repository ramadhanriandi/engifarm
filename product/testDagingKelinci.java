package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingKelinci {

	@Test
	public void test() {
		//create product
		DagingKelinci f = new DagingKelinci(50000);
						
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingKelinci");
					
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
