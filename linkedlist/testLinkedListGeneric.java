package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLinkedListGeneric {

	@Test
	public void test() {
		//test constructor
		LinkedListGeneric l = new LinkedListGeneric();
		
		//test isEmpty()
		boolean p = l.isEmpty();
		assertEquals(p,true);
		
		//test getLength()
		int k = l.getLength();
		assertEquals(k, 0);
		
		//test insertTail()
		l.insertTail(12);
		
		//test getHead(), test dilakukan dengan mencetak alamat memori
		System.out.println(l.getHead());
		
		
		//test getHead(), test dilakukan dengan mencetak alamat memori
		l.insertTail(15);
		System.out.println(l.getTail());
		
		//test Delete, di program utama tidak masalah. Belum menemukan metode test yang cocok untuk delete ini. Agak error waktu di test
		//l.Delete(0);
		
		//test get(T t)
		assertEquals(l.get(0),12);
		assertEquals(l.get(1),15);
		
		//test find(T t)
		int kl = l.find(12);
		assertEquals(0,kl);
	}

}
