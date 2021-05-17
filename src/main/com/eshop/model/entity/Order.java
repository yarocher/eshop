package com.eshop.model.entity;

public class Order {
	private long id;
	private Cart cart;
	private OrderState state;

	public long getId () {return id;}
	public Cart getCart () {return cart;}
	public OrderState getState () {return state;}

	public void setId (long id) {this.id = id;}
	public void setCart (Cart cart) {this.cart = cart;}
	public void setState (OrderState state) {this.state = state;}

	public Order () {}
	public Order (Cart cart) {
		setCart(cart);
	}

	@Override
	public String toString () {
		return "Order" + id + " {Cart" + cart.getId() + ", " + state + "}";
	}
}