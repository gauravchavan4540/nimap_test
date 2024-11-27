package com.example.nimapbackend.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class ResponseDTO {
	
	int pages;
	long elements;
	boolean isLast;
	List<Products> products;
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public long getElements() {
		return elements;
	}
	public void setElements(long elements) {
		this.elements = elements;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "ResponseDTO [pages=" + pages + ", elements=" + elements + ", isLast=" + isLast + ", products="
				+ products + "]";
	}
	
	

}
