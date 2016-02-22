package com.ljc.service.inte;

import java.util.Vector;

import com.ljc.model.Book;
import com.ljc.model.BookTybe;
import com.ljc.uitl.PagesUtil;

public interface BookService {
	public boolean add(Book book);
	public boolean update(Book book,String s);
	public boolean delete(Book book);
	public boolean add(BookTybe bookTybe);
	public boolean update(BookTybe bookTybe);
	public boolean delete(BookTybe bookTybe);
	public Object[][] find(Book book);
	public int getRow(Book book);//获取查询书籍的行数
	public Book getBook(String id);//根据编号获取书籍信息
	public String[] getArrays();//获取书籍类别的集合
	public String getID(String name);//根据类名得到ID
	public PagesUtil getPages(Book book);
}
