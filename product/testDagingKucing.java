package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingKucing {

	@Test
	public void test() {
		//create product
		DagingKucing f = new DagingKucing(50000);
												
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingKucing");
											
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
