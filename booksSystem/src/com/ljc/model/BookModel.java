package com.ljc.model;
/*
	TableModel 类
 */

import javax.swing.table.AbstractTableModel;



public class BookModel extends AbstractTableModel{
	private Object[][] data={{"","","","",""}};
	private String[] columns={"编号","类别","名称","出版社","价格"};
	private static BookModel bookModel=new BookModel(); 
	//私有化构造方法
	private BookModel(){
		
	}
	//提供获取BookModel的实列方法
	public static BookModel getInstance(){
		return bookModel;
	}
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	//获取表格标题
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columns[column];
	}
	public void setArrays(Object[][] data){
		this.data=data;
	}
	
		
}
