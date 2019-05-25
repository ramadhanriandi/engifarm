package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingBebek {

	@Test
	public void test() {
		//create product
		DagingBebek f = new DagingBebek(50000);
				
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingBebek");
			
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
	}

}
