package com.ljc.dao.inte;

import java.util.Vector;


import com.ljc.model.BookTybe;

public interface BookTybeDao {
	public boolean add(BookTybe bookTybe);
	public boolean update(BookTybe bookTybe);
	public boolean delete(BookTybe bookTybe);
	public String[] getTypes();
	public String getID(String name);//根据类名找到对应的编号
}
