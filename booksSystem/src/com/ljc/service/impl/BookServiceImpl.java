package com.ljc.service.impl;

import java.util.Vector;

import com.ljc.dao.impl.BookDaoImpl;
import com.ljc.dao.impl.BookTybeImpl;
import com.ljc.model.Book;
import com.ljc.model.BookTybe;
import com.ljc.service.inte.BookService;
import com.ljc.uitl.PagesUtil;

public class BookServiceImpl implements BookService {
 
	boolean temp=false;
	public boolean add(Book book) {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		temp=bookDaoImpl.add(book);
		return temp;
	}

	public boolean delete(Book book) {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		temp=bookDaoImpl.delete(book);
		return temp;
	}

	public boolean update(Book book,String s) {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		temp=bookDaoImpl.update(book,s);
		return temp;
	}

	public boolean add(BookTybe bookTybe) {
		BookTybeImpl bookTybeImpl=new BookTybeImpl();
		temp = bookTybeImpl.add(bookTybe);
		return temp;
	}

	public boolean delete(BookTybe bookTybe) {
		BookTybeImpl bookTybeImpl=new BookTybeImpl();
		temp=bookTybeImpl.delete(bookTybe);
		return temp;
	}

	public boolean update(BookTybe bookTybe) {
		BookTybeImpl bookTybeImpl=new BookTybeImpl();
		temp=bookTybeImpl.update(bookTybe);
		return temp;
	}

	public Object[][] find(Book book) {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		return bookDaoImpl.find(book);
	}

	public Book getBook(String id) {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		return bookDaoImpl.getBook(id);
	}
	public int getRow(Book book) {
		BookDaoImpl bookDaoImpl=new BookDaoImpl();
		return bookDaoImpl.getRow(book);
	}

	public String[] getArrays() {
		// TODO Auto-generated method stub
		BookTybeImpl bookTybeImpl=new BookTybeImpl();
		return bookTybeImpl.getTypes();
	}

	public String getID(String name) {
		// TODO Auto-generated method stub
		BookTybeImpl bookTybeImpl=new BookTybeImpl();
		return bookTybeImpl.getID(name);
	}

	public PagesUtil getPages(Book book) {
		// TODO Auto-generated method stub
		BookDaoImpl bookDaoImpl=new BookDaoImpl();
		return bookDaoImpl.getPages(book);
	}

	


	

}
