package com.ljc.ui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.ljc.ui.UI_1;

public class UI_2 {
	public JLabel jla1_3,
	jla1_3_1,jla1_3_2,jla1_3_3,jla1_3_4,jla1_3_5,jla1_3_6,jla5
	;
	public JButton jb3_1,jb3_2;
	public JTextField 
	jt3_1,jt3_2,jt3_3,jt3_4,jt3_5
	;
	JTable jTable;
	UI_1 ui;
	public JComboBox jcb,jcb4;
	public UI_2(UI_1 ui,JLabel jla1_3){
		this.ui=ui;
		this.jla1_3=jla1_3;
	}
		public void update(){
			jla1_3_1=new JLabel("修改信息");
			jla1_3_1.setFont(new Font("黑体",Font.BOLD, 40));
			jla1_3_2=new JLabel("类别：");
			jla1_3_3=new JLabel("编号：");
			jla1_3_4=new JLabel("书名：");
			jla1_3_5=new JLabel("出版社：");
			jla1_3_6=new JLabel("价格：");
			jla5=new JLabel("要修改书籍名称:");
			jt3_1=new JTextField();
			jt3_2=new JTextField();
			jt3_3=new JTextField();
			jt3_4=new JTextField();
			jt3_5=new JTextField();
			//下拉框
			String[] str={"编程类","文学类","小说类"};
			jcb=new JComboBox(str);
			jb3_1=new JButton("确定修改");
			jb3_2=new JButton("查询");
			jb3_1.addActionListener(ui);
			jb3_2.addActionListener(ui);
			jla1_3_1.setBounds(150, 10, 500, 40);
			jla1_3_2.setBounds(50, 60, 60,30);
			jla5.setBounds(300, 60,100,30);
			jla1_3_3.setBounds(50, 110, 60,30);
			jla1_3_4.setBounds(50, 160, 60,30);
			jla1_3_5.setBounds(36,210, 60,30);
			jla1_3_6.setBounds(50, 260, 60,30);
			jt3_1.setBounds(90, 110, 180, 25);
			jt3_2.setBounds(90, 160, 180, 25);
			jt3_3.setBounds(90, 210, 180, 25);
			jt3_4.setBounds(90, 260, 180, 25);
			jcb.setBounds(90, 60, 180, 25);
			jt3_5.setBounds(400, 60, 90, 25);
			jb3_1.setBounds(90, 320,160, 30);
			jb3_2.setBounds(300, 110, 180, 25);
			jla1_3.add(jb3_2);
			jla1_3.add(jt3_5);
			jla1_3.add(jla5);
			jla1_3.add(jb3_1);
			jla1_3.add(jcb);
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
}
