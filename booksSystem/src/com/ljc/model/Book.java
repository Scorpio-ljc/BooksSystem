package com.ljc.model;
//书籍类

public class Book {
	private String id;
	private String name;
	private	BookTybe bookTybe;
	public BookTybe getBookTybe() {
		return bookTybe;
	}
	public void setBookTybe(BookTybe bookTybe) {
		this.bookTybe = bookTybe;
	}
	private String press;//出版社
	private double price;//价格
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
