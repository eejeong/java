package com.kbstar.dto;

public class ItemDTO {
	private String id;
	private String name;
	private double price;
	public ItemDTO() {
	}	
	public ItemDTO(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "ItemDAO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
