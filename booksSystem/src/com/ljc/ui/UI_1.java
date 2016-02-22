package com.ljc.ui;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.ljc.uitl.DButil;
import com.ljc.uitl.DivideArrays;
import com.ljc.uitl.GetList;
import com.ljc.uitl.IDTime;
import com.ljc.uitl.ListClear;
import com.ljc.uitl.PagesUtil;
import com.ljc.dao.impl.BookDaoImpl;
import com.ljc.model.BookModel;
import com.ljc.model.Book;
import com.ljc.model.BookTybe;
import com.ljc.service.impl.BookServiceImpl;


public class UI_1 extends JFrame implements ActionListener {
	JLabel jla1, jla1_1, jla1_2, jla1_3, jla1_4, jla1_5, jla1_1_1, jla1_2_1,
			jla1_2_2, jla1_2_3, jla1_2_4, jla1_3_1, jla1_3_2, jla1_3_3,
			jla1_3_4, jla1_3_5, jla1_3_6, jla1_4_1, jla1_4_2, jla1_4_3,
			bookID,bookType,bookName,showRow,page
			;
	JButton jb1, jb2, jb3, jb4, jb5, jb1_1, jb2_1, jb3_1, jb4_1, jb4_2,previous,next,home,
	last,jump
	;
	JTextField jt1_1, jt2_1, jt2_2, jt3_1, jt3_2, jt3_3, jt3_4, jt4_1,
	jBookID,jBookType,jBookName,rowNum
	;
	JTable jTable;
	JComboBox jcb, jcb4;
	JTextArea jta1;
	UI_2 ui_2;
	BookModel bookModel=BookModel.getInstance();
	BookServiceImpl bookServiceImpl=new BookServiceImpl();
	Book book=new Book();
	BookTybe bookTybe=new BookTybe();
	Vector ve=new Vector();
	LinkedList linkedList=new LinkedList();
	int shu=0;//�����һҳ�Ĵ���
	Vector vector=null;
	int row=0;//��¼��ѯ���ݵ�����
	int ye=0;//ҳ��
	int now=1;//��ǰ����
	String[] str={};
	PagesUtil pagesUtil;
	public UI_1() {
		init();
	}

	public void init() {
		this.setTitle("ͼ���ѯ");
		this.setSize(620,500);
		this.setLocationRelativeTo(getOwner());
		JPanel jp = new JPanel();
		jp.setLayout(null);

		jla1 = new JLabel();
		jla1.setBounds(0, 0, 100, 500);
		jb1 = new JButton("��ѯ");
		jb1.addActionListener(this);
		jb2 = new JButton("�����");
		jb2.addActionListener(this);
		jb3 = new JButton("���鼮");
		jb3.addActionListener(this);
		jb4 = new JButton("ɾ��");
		jb4.addActionListener(this);
		jb5 = new JButton("����Ϣ");
		jb5.addActionListener(this);
		previous=new JButton("��ҳ");
		previous.addActionListener(this);
		next=new JButton("��ҳ");
		next.addActionListener(this);
		home=new JButton("��ҳ");
		home.addActionListener(this);
		last=new JButton("ĩҳ");
		last.addActionListener(this);
		jump=new JButton("go");
		jump.addActionListener(this);
		// 5����ͬ������
		jla1_1 = new JLabel();
		jla1_2 = new JLabel();
		jla1_3 = new JLabel();
		jla1_4 = new JLabel();
		jla1_5 = new JLabel();
		showRow=new JLabel();
		bookID=new JLabel("��ţ�");
		bookName=new JLabel("����:");
		bookType=new JLabel("����:");
		jla1_1_1 = new JLabel("��ѯ�鼮");
		page=new JLabel("ҳ");
		// ����ѯ����еı������������С
		jla1_1_1.setFont(new Font("����", Font.BOLD, 40));
		// ��ѯ�����
		jBookID = new JTextField();
		jBookName = new JTextField();
		jBookType = new JTextField();
		rowNum=new JTextField();
		// ��ѯȷ����ť
		jb1_1 = new JButton("��ѯ");
		jb1_1.addActionListener(this);
		// Ĭ����ʾ��һ������
		jla1_1.setVisible(true);
		jla1_2.setVisible(false);
		jla1_3.setVisible(false);
		jla1_4.setVisible(false);
		jla1_5.setVisible(false);
		jla1.setLayout(null);
		jla1_1_1.setBounds(150, 10, 400, 40);
		bookID.setBounds(10, 60, 60, 30);
		bookName.setBounds(130, 60, 60, 30);
		bookType.setBounds(246, 60, 60, 30);
		jBookID.setBounds(42, 60, 80, 25);
		jBookName.setBounds(160, 60, 80, 25);
		jBookType.setBounds(276, 60, 80, 25);
		jb1_1.setBounds(380, 60, 80, 25);
		jb1.setBounds(10, 10, 80, 80);
		jb2.setBounds(10, 100, 80, 80);
		jb3.setBounds(10, 190, 80, 80);
		jb4.setBounds(10, 280, 80, 80);
		jb5.setBounds(10, 370, 80, 80);
		jla1_1.setBounds(100, 0, 520, 500);
		jla1_2.setBounds(100, 0, 520, 500);
		jla1_3.setBounds(100, 0, 520, 500);
		jla1_4.setBounds(100, 0, 520, 500);
		jla1_5.setBounds(100, 0, 520, 500);
		previous.setBounds(140, 430, 60, 20);
		next.setBounds(220, 430, 60, 20);
		home.setBounds(300, 430, 60, 20);
		last.setBounds(380, 430, 60, 20);
		showRow.setBounds(460, 430, 30, 20);
		rowNum.setBounds(10, 430, 30, 20);
		page.setBounds(42, 430,20, 20);
		jump.setBounds(60, 430, 50, 20);
		jla1_1.add(jump);
		jla1_1.add(page);
		jla1_1.add(rowNum);
		jla1_1.add(showRow);
		jla1_1.add(last);
		jla1_1.add(home);
		jla1_1.add(next);
		jla1_1.add(previous);
		jla1_1.add(jb1_1);
		jla1_1.add(bookType);
		jla1_1.add(bookName);
		jla1_1.add(bookID);
		jla1_1.add(jBookName);
		jla1_1.add(jBookID);
		jla1_1.add(jBookType);
		jla1_1.add(jla1_1_1);
		jla1.add(jb5);
		jla1.add(jb4);
		jla1.add(jb3);
		jla1.add(jb1);
		jla1.add(jb2);
		jp.add(jla1_1);
		jp.add(jla1_2);
		jp.add(jla1_3);
		jp.add(jla1_4);
		jp.add(jla1_5);
		jp.add(jla1);
		this.add(jp);
		jTable=new JTable(bookModel);
		JScrollPane jsp = new JScrollPane(jTable);
		jsp.setBounds(0, 100, 500, 320);
		jla1_1.add(jsp);
		addLei();
		addBooks();
		delectLei();
		ui_2=new UI_2(this, jla1_5);
		ui_2.update();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//������������
	public  void addLei(){
		//��������
		jla1_2_1=new JLabel("������");
		//��������
		jla1_2_2=new JLabel("��������:");
		jla1_2_3=new JLabel("��ţ�");
		jla1_2_4=new JLabel("���������");
		jt2_1=new JTextField();
		jt2_2=new JTextField();
		jta1=new JTextArea();
		jb2_1=new JButton("���");
		jla1_2_1.setFont(new Font("����",Font.BOLD, 40));
		
		jb2_1.addActionListener(this);
		jla1_2_1.setBounds(150, 10, 500, 40);
		jt2_1.setBounds(130, 60, 180,25);
		jt2_2.setBounds(130,100, 180,25);
		jla1_2_2.setBounds(60, 60, 60, 25);
		jla1_2_3.setBounds(83, 100, 60, 25);
		jla1_2_4.setBounds(60, 130, 80, 25);
		jta1.setBounds(130, 130, 200, 150);
		jb2_1.setBounds(300, 300, 60,25);
		jla1_2.setLayout(null);
		jla1_2.add(jta1);
		jla1_2.add(jt2_2);
		jla1_2.add(jb2_1);
		jla1_2.add(jla1_2_4);
		jla1_2.add(jla1_2_3);
		jla1_2.add(jla1_2_2);
		jla1_2.add(jla1_2_1);
		jla1_2.add(jt2_1);
	}
	//���鼮
	public void addBooks(){
		jla1_3_1=new JLabel("�����鼮");
		jla1_3_1.setFont(new Font("����",Font.BOLD, 40));
		jla1_3_2=new JLabel("���");
		jla1_3_3=new JLabel("��ţ�");
		jla1_3_4=new JLabel("������");
		jla1_3_5=new JLabel("�����磺");
		jla1_3_6=new JLabel("�۸�");
		jt3_1=new JTextField();
		jt3_1.setEditable(false);
		jt3_2=new JTextField();
		jt3_3=new JTextField();
		jt3_4=new JTextField();
		//������
		jcb=new JComboBox(str);
		jcb.setBounds(140, 60, 180, 25);
		jla1_3.add(jcb);
		jb3_1=new JButton("ȷ�����");
		jb3_1.addActionListener(this);
		jla1_3_1.setBounds(150, 10, 500, 40);
		jla1_3_2.setBounds(100, 60, 60,30);
		jla1_3_3.setBounds(100, 110, 60,30);
		jla1_3_4.setBounds(100, 160, 60,30);
		jla1_3_5.setBounds(86,210, 60,30);
		jla1_3_6.setBounds(100, 260, 60,30);
		jt3_1.setBounds(140, 110, 180, 25);
		jt3_2.setBounds(140, 160, 180, 25);
		jt3_3.setBounds(140, 210, 180, 25);
		jt3_4.setBounds(140, 260, 180, 25);
		
		jb3_1.setBounds(140, 320,160, 30);
		jla1_3.add(jb3_1);
		
		jla1_3.add(jt3_4);
		jla1_3.add(jt3_3);
		jla1_3.add(jt3_2);
		jla1_3.add(jt3_1);
		jla1_3.add(jla1_3_6);
		jla1_3.add(jla1_3_5);
		jla1_3.add(jla1_3_4);
		jla1_3.add(jla1_3_3);
		jla1_3.add(jla1_3_2);
		jla1_3.add(jla1_3_1);
	}
	//ɾ��������
	public void delectLei(){
		jla1_4_1=new JLabel("ɾ������");
		jla1_4_2=new JLabel("������");
		jla1_4_3=new JLabel("�鼮���ƣ�");
		jt4_1=new JTextField();
		jb4_1=new JButton("ȷ��ɾ��");
		jb4_2=new JButton("ȷ��ɾ��");
		jb4_2.addActionListener(this);
		jb4_1.addActionListener(this);
		jla1_4_1.setFont(new Font("����",Font.BOLD, 40));
		jla1_4_1.setBounds(150, 10, 500, 40);
		jla1_4_2.setBounds(100, 60, 100, 40);
		jla1_4_3.setBounds(76, 110, 100, 40);
		jt4_1.setBounds(140, 120, 180, 25);
		jcb4=new JComboBox(str);
		jcb4.setBounds(140, 70, 180, 25);
		jla1_4.add(jcb4);
		jb4_1.setBounds(340, 70, 100, 25);
		jb4_2.setBounds(340, 120, 100, 25);
		jla1_4.add(jt4_1);
		jla1_4.add(jb4_2);
		jla1_4.add(jb4_1);
		
		jla1_4.add(jla1_4_3);
		jla1_4.add(jla1_4_2);
		jla1_4.add(jla1_4_1);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1){
			jla1_1.setVisible(true);
			jla1_2.setVisible(false);
			jla1_3.setVisible(false);
			jla1_4.setVisible(false);
			jla1_5.setVisible(false);
			
		}
		if(e.getSource()==jb2){
			jt2_1.setText("");
			jla1_1.setVisible(false);
			jla1_2.setVisible(true);
			jla1_3.setVisible(false);
			jla1_4.setVisible(false);
			jla1_5.setVisible(false);
		}
		//���鼮���尴ť
		if(e.getSource()==jb3){
			//���Ƴ�ԭ�ȵ��������ٻ�ȡ�µ�������ﵽˢ�µ�Ŀ��
			jla1_3.remove(jcb);
			str=bookServiceImpl.getArrays();
			String s=IDTime.getTime();
			jt3_1.setText(s);
			jcb=new JComboBox(str);
			jcb.setBounds(140, 60, 180, 25);
			jla1_3.add(jcb);
			//System.out.println(ve);
			jla1_1.setVisible(false);
			jla1_2.setVisible(false);
			jla1_3.setVisible(true);
			jla1_4.setVisible(false);
			jla1_5.setVisible(false);
			
		}
		//ɾ���鼮
		if(e.getSource()==jb4){
			//���Ƴ�ԭ�ȵ��������ٻ�ȡ�µ�������ﵽˢ�µ�Ŀ��
			jla1_4.remove(jcb4);
			str=bookServiceImpl.getArrays();
			jcb4=new JComboBox(str);
			jcb4.setBounds(140, 70, 180, 25);
			jla1_4.add(jcb4);
			jla1_1.setVisible(false);
			jla1_2.setVisible(false);
			jla1_3.setVisible(false);
			jla1_4.setVisible(true);
			jla1_5.setVisible(false);
			
		}
		if(e.getSource()==jb5){
			//���Ƴ�ԭ�ȵ��������ٻ�ȡ�µ�������ﵽˢ�µ�Ŀ��
			ui_2.jla1_3.remove(ui_2.jcb);
			ui_2.jcb=new JComboBox(str);
			ui_2.jcb.setBounds(90, 60, 180, 25);
			ui_2.jla1_3.add(ui_2.jcb);
			jla1_1.setVisible(false);
			jla1_2.setVisible(false);
			jla1_3.setVisible(false);
			jla1_4.setVisible(false);
			jla1_5.setVisible(true);
		}
		//��ѯ��ť����
		if(e.getSource()==jb1_1){
			BookDaoImpl.count=1;
			BookDaoImpl.readRow=0;
			//��ʼ��linkedList
			ListClear.clear(linkedList);
			now=1;
			if(jBookID.getText().equals("")){
				book.setId("%");
			}else{
				book.setId(jBookID.getText());
			}
			if(jBookName.getText().equals("")){
				book.setName("%");
			}else{
				book.setName(jBookName.getText());
			}
			if(jBookType.getText().equals("")){
				book.setBookTybe(new BookTybe("","%"));
			}else{
				book.setBookTybe(new BookTybe("",jBookType.getText()));				
			}
			pagesUtil=bookServiceImpl.getPages(book);
			row=pagesUtil.getAllRow();
			ye=pagesUtil.getAllPages();
			showRow.setText(now+"/"+ye);
			linkedList=GetList.get(book, ye);
			bookModel.setArrays((Object[][])linkedList.get(0));
			//ˢ�±��
			jTable.updateUI();
			
		}
		//����ఴť����
		if(e.getSource()==jb2_1){
			boolean temp=false;
			int i=JOptionPane.showConfirmDialog(this, "ȷ����ӣ�");
			if(!jt2_1.getText().equals("")&& i==0){
				bookTybe.setId(jt2_2.getText());
				bookTybe.setName(jt2_1.getText());
				temp=bookServiceImpl.add(bookTybe);
			}
			if(temp)
				JOptionPane.showMessageDialog(this,"��ӳɹ���");
			else
				JOptionPane.showMessageDialog(this, "���ʧ�ܣ�");
		}
		//����鼮��ť����
		if(e.getSource()==jb3_1){
			boolean temp=false;
			int i=JOptionPane.showConfirmDialog(this, "ȷ����ӣ�");
			if(i==0){
				String s1=jt3_1.getText();
				String s2=getLei();
				String s3=jt3_2.getText();
				String s4=jt3_3.getText();
				Double d1= Double.valueOf(jt3_4.getText());
				double d = d1.doubleValue();
				book.setId(s1);
				book.setBookTybe(new BookTybe(s2));
				book.setName(s3);
				book.setPress(s4);
				book.setPrice(d);
				//ʹ��service����ʵ�ַ�����
				temp=bookServiceImpl.add(book);
			}
			if(temp)
				JOptionPane.showMessageDialog(this,"��ӳɹ���");
			else
				JOptionPane.showMessageDialog(this, "���ʧ�ܣ�");
		}
		//ɾ���ఴť
		if(e.getSource()==jb4_1){
			boolean temp=false;
			int i=JOptionPane.showConfirmDialog(this, "ȷ��ɾ����");
			if(i==0){
				String ss=(String)jcb4.getSelectedItem();
				bookTybe.setName(ss);
				System.out.println(ss);
				temp=bookServiceImpl.delete(bookTybe);
				//ɾ�����������е�����
			}
			if(temp){
				jcb4.removeItemAt(jcb4.getSelectedIndex());
				JOptionPane.showMessageDialog(this,"ɾ���ɹ���");
			}
			else
				JOptionPane.showMessageDialog(this, "ɾ��ʧ�ܣ�");
		}
		//ɾ���鼮��ť
		if(e.getSource()==jb4_2){
			boolean temp=false;
			int i=JOptionPane.showConfirmDialog(this, "ȷ��ɾ����");
			if(i==0){
				
				String s=jt4_1.getText();
				book.setName(s);
				temp=bookServiceImpl.delete(book);
			}
			if(temp)
				JOptionPane.showMessageDialog(this,"ɾ���ɹ���");
			else
				JOptionPane.showMessageDialog(this, "ɾ��ʧ�ܣ�");
		}
		//ȷ���޸İ�ť
		if(e.getSource()==ui_2.jb3_1){
			boolean temp=false;
			int i=JOptionPane.showConfirmDialog(this, "ȷ���޸ģ�");
			if(i==0){
				String s1=ui_2.jt3_1.getText();
				String s2=getLei1();
				String s3=ui_2.jt3_2.getText();
				String s4=ui_2.jt3_3.getText();
				Double d1= Double.valueOf(ui_2.jt3_4.getText());
				double d = d1.doubleValue();
				book.setId(s1);
				book.setBookTybe(new BookTybe(s2));
				book.setName(s3);
				book.setPress(s4);
				book.setPrice(d);
				temp=bookServiceImpl.update(book, ui_2.jt3_5.getText());
			}
			if(temp)
				JOptionPane.showMessageDialog(this,"�޸ĳɹ���");
			else
				JOptionPane.showMessageDialog(this, "�޸�ʧ�ܣ�");
		}
		//��ȡ�޸��鼮���ݵİ�ť
		if(e.getSource()==ui_2.jb3_2){
			book=bookServiceImpl.getBook(ui_2.jt3_5.getText());
			ui_2.jt3_1.setText(book.getId());
			ui_2.jt3_2.setText(book.getName());
			ui_2.jt3_3.setText(book.getPress());
			ui_2.jt3_4.setText(String.valueOf(book.getPrice()));
		}
		//��һҳ�����ť
		if(e.getSource()==previous){
			if(now!=1){
				
				now-=1;
				
				bookModel.setArrays((Object[][])linkedList.get(now-1));
				
				showRow.setText(now+"/"+ye);
				jTable.updateUI();
			}
		}
		//��һҳ�����ť
		if(e.getSource()==next){
				if(now<ye){
					now+=1;
					bookModel.setArrays((Object[][])linkedList.get(now-1));
					System.out.println("���ڵ�����"+shu);
					showRow.setText(now+"/"+ye);
					jTable.updateUI();
				}
		}
		//��ҳ�����ť
		if(e.getSource()==home){
			now=1;
			bookModel.setArrays((Object[][])linkedList.get(0));
			showRow.setText(now+"/"+ye);
			jTable.updateUI();
		}
		//ĩҳ�����ť
		if(e.getSource()==last){
			now=ye;
			bookModel.setArrays((Object[][])linkedList.get(ye-1));
			showRow.setText(now+"/"+ye);
			jTable.updateUI();
		}
		//��ҳ
		if(e.getSource()==jump){
			int a=0;
			try{
				a=Integer.parseInt(rowNum.getText());
			}catch (Exception e1) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "���������Ϣ����!");
				rowNum.setText("");
				return;
			}
			if(a<=ye&&a>0){
				now=a;
				bookModel.setArrays((Object[][])linkedList.get(now-1));
				showRow.setText(now+"/"+ye);
				jTable.updateUI();
			}else{
				JOptionPane.showMessageDialog(this, "û����һҳ!");
				rowNum.setText("");
			}
		}
		
	}
	//��ȡ����鼮��������ѡ��ֵ��Ӧ��ID
	public String getLei(){
		String name=(String)jcb.getSelectedItem();
		String s=bookServiceImpl.getID(name);
		return s;
	}
	//�޸��鼮��������ѡ��ֵ��Ӧ��ID
	public String getLei1(){
		String name=(String)ui_2.jcb.getSelectedItem();
		String s=bookServiceImpl.getID(name);
		return s;
	}
}
