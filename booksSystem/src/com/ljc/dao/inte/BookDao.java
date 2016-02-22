package com.ljc.dao.inte;

import java.util.Vector;

import com.ljc.model.Book;
import com.ljc.uitl.PagesUtil;

public interface BookDao {
	public boolean add(Book book);//����鼮
	public boolean update(Book book,String s);//�޸��鼮��Ϣ
	public boolean delete(Book book);//ɾ���鼮
	public Object[][] find(Book book);//�����鼮
	public int getRow(Book book);//�õ������鼮��������
	public Object[][] getArrays();//��ȡ��ѯ�鼮�ĵı��
	public Book getBook(String id);//����ID��ȡ���������Ϣ
	public PagesUtil getPages(Book book);//��ȡPagesUtil����
}
