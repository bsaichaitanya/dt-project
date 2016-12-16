package com.niit.book;

import java.util.ArrayList;
import java.util.List;

public class Displaybook {
	
	public static void main(String args[])
	{
BOOK books;
ArrayList<BOOK> Book = new ArrayList();
books= new BOOK(1, "JAVA", 200);
Book.add(books);
books= new BOOK(2, "DB", 300);
Book.add(books);
books= new BOOK(3, "TOM", 400);
Book.add(books);
  DisplayAll dp =new DisplayAll();
 //   dp.search(Book, 1);
    
    BOOK enggbooks;
    ArrayList<BOOK> EnggBook = new ArrayList<BOOK>();
    enggbooks= new BOOK(1,"maths",500);
    EnggBook.add(enggbooks);
    enggbooks= new BOOK(2,"science",400);
    EnggBook.add(enggbooks);
    enggbooks= new BOOK(3,"physics",300);
    EnggBook.add(enggbooks);
    Book.addAll(EnggBook);
    dp.displayall(Book);
    dp.search(EnggBook, 3);
    
   
//OneBook o =new OneBook();
 //   o.displaybook (books);
}
}