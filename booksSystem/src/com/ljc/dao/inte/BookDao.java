package com.ljc.dao.inte;

import java.util.Vector;

import com.ljc.model.Book;
import com.ljc.uitl.PagesUtil;

public interface BookDao {
	public boolean add(Book book);//添加书籍
	public boolean update(Book book,String s);//修改书籍信息
	public boolean delete(Book book);//删除书籍
	public Object[][] find(Book book);//查找书籍
	public int getRow(Book book);//得到查找书籍的总行数
	public Object[][] getArrays();//获取查询书籍的的表格
	public Book getBook(String id);//根据ID获取书的所有信息
	public PagesUtil getPages(Book book);//获取PagesUtil对象
}
