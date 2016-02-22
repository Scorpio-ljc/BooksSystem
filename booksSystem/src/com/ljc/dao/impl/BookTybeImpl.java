package com.ljc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.ljc.uitl.DButil;
import com.ljc.dao.inte.BookTybeDao;
import com.ljc.model.BookTybe;

public class BookTybeImpl implements BookTybeDao {
	int i=0;

	public boolean add(BookTybe bookTybe) {
		String s1 = bookTybe.getId();
		String s2 = bookTybe.getName();
		String sql = "insert into booklei values('" + s1 + "','" + s2 + "')";
		i = DButil.getUp(sql);
		if (i == 1)
			return true;
		return false;
	}

	public boolean delete(BookTybe bookTybe) {
		String sql="delete from booklei where b_lei_name=?";
		String s=bookTybe.getName();
		i=DButil.deleteData(sql, s);
		if(i==1)
			return true;
		return false;
	}

	public boolean update(BookTybe bookTybe) {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getTypes() {
		String[] str=null;
		String sql="select * from  booklei";
		ResultSet rs=DButil.getSet(sql);
		int row=0;
		try {
			while(rs.next()){
				row++;
			}
			str=new String[row];
			int i=0;
			 rs=DButil.getSet(sql);
			while(rs.next()){
				str[i]=rs.getString("b_lei_name");
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	public String getID(String name) {
		String sql="select * from booklei where b_lei_name=?";
		ResultSet rs=DButil.getSet1(sql, name);
		String s=null;
		try {
			while(rs.next()){
				s=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	

}
