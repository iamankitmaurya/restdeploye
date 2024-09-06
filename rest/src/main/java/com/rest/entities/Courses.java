package com.rest.entities;

public class Courses {
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String title;
	private String description;
	private String price;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(long id, String title, String description, String price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
	

}
