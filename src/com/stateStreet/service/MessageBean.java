package com.stateStreet.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class MessageBean {
	//上传路径
	private String dir;
	//大小
	private long size;
	//日期
	private Date date;
	
	private List<String> list;
	
	private Set<String> cities;
	
	private Map<String,String> books;
	
	private Properties properties;
	
	public List<String> getList() {
		return list;
	}
	
	public void setDate(String date){
		this.date=Date.valueOf(date);
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public void setBooks(Map<String, String> books) {
		this.books = books;
	}
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void show(){
		System.out.println("dir="+dir);
		System.out.println("size="+size);
		System.out.println("date="+date);
		System.out.println(list.toString());
		System.out.println(cities.toString());
		Set<String> keys=books.keySet();
		for(String key:keys){
			System.out.println(books.get(key));
		}
		 Set<Object> pkeys=properties.keySet();
		 for(Object obj:pkeys){
			 System.out.println(properties.get(obj));
		 }
	}
	
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
}
