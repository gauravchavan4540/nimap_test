package com.example.nimapbackend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String catname;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Products> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Categories(int id, String catname, List<Products> products) {
		super();
		this.id = id;
		this.catname = catname;
		this.products = products;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categories [id=" + id + ", catname=" + catname + ", products=" + products + "]";
	}
	
	
	

}
