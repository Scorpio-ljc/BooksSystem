package com.ljc.model;
/*
	TableModel ��
 */

import javax.swing.table.AbstractTableModel;



public class BookModel extends AbstractTableModel{
	private Object[][] data={{"","","","",""}};
	private String[] columns={"���","���","����","������","�۸�"};
	private static BookModel bookModel=new BookModel(); 
	//˽�л����췽��
	private BookModel(){
		
	}
	//�ṩ��ȡBookModel��ʵ�з���
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
	//��ȡ������
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columns[column];
	}
	public void setArrays(Object[][] data){
		this.data=data;
	}
	
		
}
