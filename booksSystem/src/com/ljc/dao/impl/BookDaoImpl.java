package com.ljc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextField;

import com.ljc.dao.inte.BookDao;
import com.ljc.model.Book;
import com.ljc.model.BookTybe;
import com.ljc.uitl.DButil;   
import com.ljc.uitl.PagesUtil;
public class BookDaoImpl implements BookDao{
	ResultSet rs;
	int nowRow=0;//当前查到的行数
	 public static int readRow=0;//记录已经读了的行数
	 public static int count=1;//记录当前页数
	
	public boolean add(Book book) {
		String sql="insert into books values(?,?,?,?,?)";
		int i=DButil.addBook(sql,book.getId(),book.getBookTybe().getId(),book.getName(),book.getPress(), book.getPrice());
		if(i==1)
			return true;
		return false;
	}

	public boolean delete(Book book) { 
		String sql="delete from books where b_name=?";
		int i=DButil.deleteData(sql, book.getName());
		if(i==1)
			return true;
		return false;
	}

	public boolean update(Book book,String ss) {
		
		String sql="update books set b_id=?," +
		"b_lei=?,b_name=?,b_from=?,b_price=? where b_name='"+ss+"'";
		int i=DButil.addBook(sql,book.getId(),book.getBookTybe().getId(),book.getName(), 
				book.getPress(),book.getPrice());
		if(i==1)
			return true;
		return false;
	}

	public Object[][] getArrays() {
			
		return null;
	}
	public int getRow(Book book) {
		 String sql="select * from dual";
			String id=book.getId();
			String leiMing=book.getBookTybe().getName();
			//String leiID=book.getBookTybe().getId();
			String name=book.getName();
			System.out.println(id);
//			String press=book.getPress();
//			double price=book.getPrice();
//			System.out.println(id+"  "+name+"   "+leiMing);
			String[][] str=null;
			sql="select b_id,booklei.b_lei_name,b_name,b_from,b_price from books,booklei " +
			"where booklei.b_lei_name like ? and b_name like '"+name+"' and b_id like'"+id+"' and booklei.b_lei=books.b_lei";
			String[] ss={"编号","类别","名称","出版社","价格"};
			ResultSet rs=DButil.getSet1(sql, leiMing);
			//记录获取数据的行数
			int row=0;
				try {
					while(rs.next()){
						row++;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return row;
	}
	public Object[][] find(Book book) {
		// TODO Auto-generated method stub
	    String sql="select * from dual";
		String id=book.getId();
		String leiMing=book.getBookTybe().getName();
		//String leiID=book.getBookTybe().getId();
		String name=book.getName();
		System.out.println(id);
//		String press=book.getPress();
//		double price=book.getPrice();
//		System.out.println(id+"  "+name+"   "+leiMing);
		String[][] str=null;
		sql="select b_id,booklei.b_lei_name,b_name,b_from,b_price from books,booklei " +
		"where booklei.b_lei_name like ? and b_name like '"+name+"' and b_id like'"+id+"' and booklei.b_lei=books.b_lei";
		String[] ss={"编号","类别","名称","出版社","价格"};
		ResultSet rs=DButil.getSet1(sql, leiMing);
		//记录获取数据的行数
		int row=0;
		try {
			while(rs.next()){
				row++;
			}
			nowRow=row;
			str=new String[18][5];
			rs=DButil.getSet1(sql, leiMing);
			int i=0;
			int i1=0;
			while(rs.next()){
				if(i>readRow || readRow==0){
					System.out.println("i的值："+i);
					str[i1]=new String[]{
							rs.getString(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							String.valueOf(rs.getDouble(5))
					};
					readRow=i;
					i1++;
				}
				i++;
				if(i==18*count)
					break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count+=1;
		return str;
	}
	public Object[][] find(Book book,int a,int b) {
		count-=a;
		readRow-=b;
		// TODO Auto-generated method stub
	    String sql="select * from dual";
		String id=book.getId();
		String leiMing=book.getBookTybe().getName();
		//String leiID=book.getBookTybe().getId();
		String name=book.getName();
		System.out.println(id);
//		String press=book.getPress();
//		double price=book.getPrice();
//		System.out.println(id+"  "+name+"   "+leiMing);
		String[][] str=null;
		sql="select b_id,booklei.b_lei_name,b_name,b_from,b_price from books,booklei " +
		"where booklei.b_lei_name like ? and b_name like '"+name+"' and b_id like'"+id+"' and booklei.b_lei=books.b_lei";
		String[] ss={"编号","类别","名称","出版社","价格"};
		ResultSet rs=DButil.getSet1(sql, leiMing);
		//记录获取数据的行数
		int row=0;
		try {
			while(rs.next()){
				row++;
			}
			nowRow=row;
			str=new String[18][5];
			rs=DButil.getSet1(sql, leiMing);
			int i=0;
			int i1=0;
			while(rs.next()){
				if(i>readRow || readRow==0){
					System.out.println("i的值："+i);
					str[i1]=new String[]{
							rs.getString(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							String.valueOf(rs.getDouble(5))
					};
					readRow=i;
					i1++;
				}
				i++;
				if(i==18*count)
					break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count+=1;
		return str;
	}
	//获取书籍信息
	public Book getBook(String id) {
		Book book =new Book();
		String s1=null,s2=null,s3=null,s4=null,s5=null;
		String sql="select * from books where b_name=?";
		rs=DButil.getSet1(sql, id);
		try {
			while(rs.next()){
				s1=rs.getString(1);
				s2=rs.getString(2);
				s3=rs.getString(3);
				s4=rs.getString(4);
				s5=rs.getString(5);
			}
			book.setId(s1);
			book.setBookTybe(new BookTybe(s2));
			book.setName(s3);
			book.setPress(s4);
			Double d1=Double.valueOf(s5);
			double d=d1.doubleValue();
			book.setPrice(d);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return book;
	}

	public PagesUtil getPages(Book book) {
		// TODO Auto-generated method stub
		int allRow=getRow(book);
		PagesUtil pagesUtil=new PagesUtil(allRow);
		return pagesUtil;
	}

	
}
