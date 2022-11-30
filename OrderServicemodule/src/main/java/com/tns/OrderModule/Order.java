package com.tns.OrderModule;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Id;

@EntityScan

public class Order {

	private int id;
	private int dateofPurchase;
	private float total;
	
	public Order() {
		super();
	}
	
	public Order(int id, int dateofPurchase, float total, int customer_id, String paymentmode, int shop_id) {
		super();
		this.id = id;
		this.dateofPurchase = dateofPurchase;
		this.total = total;
		this.customer_id = customer_id;
		this.paymentmode = paymentmode;
		this.shop_id = shop_id;
	}
	
	@Id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(int dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	
	private int customer_id;
	private String paymentmode;
	private int shop_id;
	@Override
	public String toString() {
		return "Order [id=" + id + ", dateofPurchase=" + dateofPurchase + ", total=" + total + ", customer_id="
				+ customer_id + ", paymentmode=" + paymentmode + ", shop_id=" + shop_id + ", getId()=" + getId()
				+ ", getDateofPurchase()=" + getDateofPurchase() + ", getTotal()=" + getTotal() + ", getCustomer_id()="
				+ getCustomer_id() + ", getPaymentmode()=" + getPaymentmode() + ", getShop_id()=" + getShop_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
