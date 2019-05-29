package com.laptopinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lap_id;
	@Column(name="lap_name")
	private String lap_name;
	@Column(name="lap_price")
	private int lap_price;

	public Laptop() {

	}

	public Laptop(int lap_id, String lap_name, int lap_price) {
		//super();
		this.lap_id = lap_id;
		this.lap_name = lap_name;
		this.lap_price = lap_price;
	}

	public int getLap_id() {
		return lap_id;
	}

	public void setLap_id(int lap_id) {
		this.lap_id = lap_id;
	}

	public String getLap_name() {
		return lap_name;
	}

	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}

	public int getLap_price() {
		return lap_price;
	}

	public void setLap_price(int lap_price) {
		this.lap_price = lap_price;
	}

}
