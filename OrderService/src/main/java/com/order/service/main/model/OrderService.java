package com.order.service.main.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class OrderService implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ORDER_ID")
	private Integer orderId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "SHIPPING_ADDRESS ")
	private String shippingAddress;
	@Column(name = "ORDER_ITEMS")
	private String orderItems;
	@Column(name = "TOTAL")
	private Double total;

	public OrderService() {
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