package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDagingAyam {

	@Test
	public void test() {
		
		//create product
		DagingAyam f = new DagingAyam(50000);
		
		//test getNamaProduct();
		String nama = f.getNamaProduk();
		assertEquals(nama, "dagingAyam");
	
		//test getHarga();
		int harga = f.getHarga();
		assertEquals(harga, 50000);
		
	}

}
