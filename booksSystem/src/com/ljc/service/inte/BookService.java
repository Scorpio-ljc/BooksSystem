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
	public int getRow(Book book);//��ȡ��ѯ�鼮������
	public Book getBook(String id);//���ݱ�Ż�ȡ�鼮��Ϣ
	public String[] getArrays();//��ȡ�鼮���ļ���
	public String getID(String name);//���������õ�ID
	public PagesUtil getPages(Book book);
}
