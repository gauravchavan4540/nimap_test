package com.example.nimapbackend.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String proname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Categories categories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String proname, Categories categories) {
		super();
		this.id = id;
		this.proname = proname;
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", proname=" + proname + ", categories=" + categories + "]";
	}
	
	

}
