package com.niit.book;

import java.util.ArrayList;

public class DisplayAll  {
	public void displayall(ArrayList<BOOK> books)
	{
		for(BOOK B: books)
		{
			displaybook(B);
		}
	}
	public void displaybook(BOOK B)
	{
		System.out.println("book id "+B.getId());
		System.out.println("book name"+B.getName());
		System.out.println("book price"+B.getPrice());
			
	}
	public void search(ArrayList<BOOK> books,int id)
	{
		for(BOOK B : books)
			if(B.getId()==id)
			{
				System.out.println("the book is available");
				displaybook(B);
			}
		
	}

}
