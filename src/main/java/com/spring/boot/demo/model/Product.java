package com.spring.boot.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long id;
	
	@Column(name = "product_name", nullable = false)
	private String name;
	
	@Column(name = "product_description", nullable = false)
	private String description;
	
	@Column(name = "product_price", nullable = false)
	private BigDecimal price;
	
	@Column(name = "active", nullable = false)
	private boolean active;
	
	@Column(name = "image", nullable = false)
	private String imageUrl;
	
	@CreationTimestamp
	@Column(name = "dateCreated")
	private Date dateCreated;
	
	@UpdateTimestamp
	@Column(name = "lastUpdate")
	private Date lastUpdate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long id, String name, String description, BigDecimal price, boolean active, String imageUrl,
			Date dateCreated, Date lastUpdate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.imageUrl = imageUrl;
		this.dateCreated = dateCreated;
		this.lastUpdate = lastUpdate;
	}

	public Product(String name, String description, BigDecimal price, boolean active, String imageUrl, Date dateCreated,
			Date lastUpdate) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.imageUrl = imageUrl;
		this.dateCreated = dateCreated;
		this.lastUpdate = lastUpdate;
	}

	public Product(String name, String description, BigDecimal price, boolean active, String imageUrl) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.imageUrl = imageUrl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", active=" + active + ", imageUrl=" + imageUrl + ", dateCreated=" + dateCreated + ", lastUpdate="
				+ lastUpdate + "]";
	}
	
	
	
}
