package com.item.bs;

import org.springframework.beans.factory.BeanNameAware;

public class ItemDetails implements BeanNameAware{
	private Boolean itemW;
	private String locationR;
	
	public ItemDetails(Boolean itemW, String locationR) {
		this.itemW = itemW;
		this.locationR = locationR;
	}

	@Override
	public String toString() {
		return "ItemDetails [itemW=" + itemW + ", locationR=" + locationR + "]";
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name :: " + beanName);
	}
	
}
