package com.order.service.item.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderItemService implements Serializable {

	private static final long serialVersionUID = 6590639235371898917L;
  
	@Id
	private Integer productCode;
	private String productName;
	private Integer qantity;
	public OrderItemService() {
	}
	public OrderItemService(Integer productCode, String productName, Integer qantity) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.qantity = qantity;
	}
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQantity() {
		return qantity;
	}
	public void setQantity(Integer qantity) {
		this.qantity = qantity;
	}
	@Override
	public String toString() {
		return "OrderItemService [productCode=" + productCode + ", productName=" + productName + ", qantity=" + qantity
				+ "]";
	}


	
}
