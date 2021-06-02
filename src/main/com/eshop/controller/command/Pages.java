package com.eshop.controller.command;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Pages <E> {
	private int portion;
	private List <E> elements;

	public int getPortion () {return portion;}
	public List <E> getAll () {
		if (elements == null) elements = new ArrayList <> ();
		return elements;
	}
	public List <E> getPage (int num) {
		List <E> page = getAll().stream()
			.skip((num - 1) * portion)
			.limit(portion)
			.collect(Collectors.toList());
		System.out.println(num);
		System.out.println(portion);
		System.out.println(page);
		System.out.println(getAll());
		return page;
	}
	public void setPortion (int portion) {this.portion = portion;}

	public <E> Pages () {}
	public <E> Pages (int portion) {
		setPortion(portion);
	}
}
