package linkedlist;

import java.util.*;
import java.io.*;

public class LinkedListGeneric<T>
{
		private Node<T> head;
		private Node<T> tail;
		private int length;

		//ctor
		public LinkedListGeneric()
		{
			head = null;
			tail = null;
			length = 0;
		}

		//Mengecek list kosong atau tidak
		public final boolean isEmpty()
		{
			return (head == null && tail == null);
		}

		public final int getLength()
		{
			return length;
		}

		public final Node<T> getHead()
		{
			return head;
		}

		public final Node<T> getTail()
		{
			return tail;
		}

		//Memasukkan elemen t ke indeks terakhir
		public final void insertTail(T t)
		{
			Node<T> N = new Node<T>();
			N.data = t;
			N.Next = null;
			if (isEmpty())
			{
				head = N;
				tail = N;
				length++;
			}
			else if (length == 1)
			{
				head.Next = tail;
				tail.Next = N;
				tail = N;
				length++;
			}
			else
			{
				tail.Next = N;
				tail = N;
				length++;
			}
		}



	public final void Delete(T t)
	{
		int index = find(t);
		if (index != -1)
		{
			//Kasus 1 elemen
			if (length == 1)
			{
					head = null;
					tail = null;
			}
			//Menghapus elemen head
			else if (index == 0)
			{
				head = head.Next;
			}
			//Menghapus elemen tail
			else if (index == length)
			{
				Node<T> N = tail;
				Node<T> p = head;
				Node<T> c = p.Next;
				while (c != N)
				{
						p = p.Next;
						c = p.Next;
				}
				tail.Next = null;
				tail = p;
				if (N != null)
					N=null;
			}
			else
			{
				Node<T> P = head;
				for (int i = 0; i < index - 1; i++)
				{
					P = P.Next;
				}
				Node<T> temp = P.Next;

				P.Next = (P.Next).Next;
				if (temp != null)
					temp = null;
			}
			length--;
		}
	}


	// Mengambil elemen pada indeks masukan
	public final T get(int index)
	{
			Node<T> P = head;
			int temp = index;
			while (temp > 0)
			{
					P = P.Next;
					temp--;
			}
			return P.data;
	}

	//Mengembalikan indeks dari elemen yang dicari
	public final int find(T t)
	{

		if (isEmpty())
		{
			return -1;
		}
		else
		{
			boolean Found = false;
			int i = 0;
				Node<T> P = head;
				while (!Found && P != tail)
				{
						if (P.data == t)
						{
							Found = true;
						}
						else
						{
							P = P.Next;
							i++;
						}
				}
				if (tail.data == t)
				{
					Found = true;
				}
			if (Found)
			{
				return i;
			}
			else
			{
				return -1;
			}
		}
	}
}
