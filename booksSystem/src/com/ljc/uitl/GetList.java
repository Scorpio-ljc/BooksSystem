package com.ljc.uitl;

import java.util.LinkedList;
import com.ljc.model.Book;
import com.ljc.service.impl.BookServiceImpl;
/**
 * ����list���ϵĹ��߰�
 * @author scxh
 *
 */
public class GetList {
	public static LinkedList get(Book book,int count){
		BookServiceImpl bookServiceImpl=new BookServiceImpl();
		LinkedList list=new LinkedList();
		for(int i=0;i<count;i++){
			list.add(bookServiceImpl.find(book));
		}
		return list;
	}
}
