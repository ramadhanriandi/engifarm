package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingKerbau {

	@Test
	public void test() {
		//create product
		DagingKerbau f = new DagingKerbau(50000);
								
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingKerbau");
							
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
