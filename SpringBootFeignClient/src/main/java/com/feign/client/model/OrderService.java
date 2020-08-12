package com.feign.client.model;

import java.io.Serializable;
import java.util.Date;



public class OrderService implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Integer orderId;
	
	private String customerName;
	
	private Date orderDate;
	
	private String shippingAddress;
	
	private String orderItems;

	private Double total;
	
public OrderService() {
	// TODO Auto-generated constructor stub
}
public OrderService(Integer orderId, String customerName, Date orderDate, String shippingAddress, String orderItems,
		Double total) {
	super();
	this.orderId = orderId;
	this.customerName = customerName;
	this.orderDate = orderDate;
	this.shippingAddress = shippingAddress;
	this.orderItems = orderItems;
	this.total = total;
}
public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public String getShippingAddress() {
	return shippingAddress;
}

public void setShippingAddress(String shippingAddress) {
	this.shippingAddress = shippingAddress;
}

public String getOrderItems() {
	return orderItems;
}

public void setOrderItems(String orderItems) {
	this.orderItems = orderItems;
}

public Double getTotal() {
	return total;
}

public void setTotal(Double total) {
	this.total = total;
}
@Override
public String toString() {
	return "OrderService [orderId=" + orderId + ", customerName=" + customerName + ", orderDate=" + orderDate
			+ ", shippingAddress=" + shippingAddress + ", orderItems=" + orderItems + ", total=" + total + "]";
}



}