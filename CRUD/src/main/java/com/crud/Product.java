package com.crud;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Entity
public class Product {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull
	private String name;
	@NotNull
	private int BigDecimal;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	//Aqui hay que generar los métodos set y get

	
	//id
	public int getId(){
		return id;
	}
	public Product setId(int id){
		this.id = id;
		return this;
	}

	
	//name
	public String getName(){
		return name;
	}
	public Product setName(String name){
		this.name = name;
		return this;
	}
	
	
	//BigDecimal
	public int getBigDecimal(){
		return BigDecimal;
	}
	public Product setBigDecimal(int BigDecimal){
		this.BigDecimal=BigDecimal;
		return this;
	}
}
