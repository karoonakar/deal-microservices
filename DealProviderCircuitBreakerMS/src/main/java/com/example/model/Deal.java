package com.example.model;



import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlRootElement
@Document(collection="Deals")
public class Deal {
	
	@Id
	private int id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-mm-dd")
	private Date startDate;
	private Date endDate;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	private String product;
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Deal() {
		// TODO Auto-generated constructor stub
	}

	public Deal(int id, Date startDate,Date endDate, String product) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

		
	
}
