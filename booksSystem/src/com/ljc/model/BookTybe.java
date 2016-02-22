package com.ljc.model;
/*
 	书籍类别类
 */

public class BookTybe {
	private String id;
	private String name;
	public BookTybe(){
		
	}
	public BookTybe(String id,String name){
		this.id=id;
		this.name=name;
	}
	public BookTybe(String id){
		this.id=id;
	}
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
	
}
