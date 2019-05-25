package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingSapi {

	@Test
	public void test() {
		//create product
		DagingSapi f = new DagingSapi(50000);
										
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingSapi");
									
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
