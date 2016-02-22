package com.ljc.uitl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 �������ݿ�汾3

*/
public class DButil {
	private static Connection con;
	private static Statement sta;
	private static ResultSet rs;
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static FileInputStream fis;
	private static PreparedStatement psta;
	static{
		getPro();
		try {
			Class.forName(driver);
			try {
				con=DriverManager.getConnection(url,user,pwd);
				sta=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void getPro(){
		try {
			//�������ļ���������
			fis=new FileInputStream("e:\\dbcon.properties");
			//��ȡ�����ļ�����
			Properties pp=new Properties();
			//���������ļ�
			pp.load(fis);
			//��ȡ����ֵ
			driver=pp.getProperty("driver");
			url=pp.getProperty("url");
			user=pp.getProperty("user");
			pwd=pp.getProperty("pwd");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static int addBook(String sql,String s1,String s2,String s3,String s4,double d){
		int i=0;
		try {
			psta=con.prepareStatement(sql);
			psta.setString(1, s1);
			psta.setString(2, s2);
			psta.setString(3, s3);
			psta.setString(4, s4);
			psta.setDouble(5, d);
			i=psta.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static int deleteData(String sql,String s){
		int i=0;
		try {
			psta=con.prepareStatement(sql);
			psta.setString(1, s);
			i=psta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	//ʹ��prepareStatementʵ����ɾ�Ĳ�
	public static ResultSet getSet1(String sql,String s){
		try {
			psta=con.prepareStatement(sql);
			psta.setString(1, s);
			rs=psta.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public static ResultSet getSet(String sql){
		try {
			rs=sta.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public static int getUp(String sql){
		int a=0;
		try {
			a = sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public static void closeLiu(){
		try {
			if(fis!=null){
			fis.close();
			System.out.println("fis�رճɹ�");
			}
			if(rs!=null){
				rs.close();
				System.out.println("rs�رճɹ�");
			}
			if(sta!=null){
				sta.close();
				System.out.println("sta�رճɹ�");
			}
			if(con!=null){
				con.close();
				System.out.println("con�رճɹ�");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
