package com.item.bs;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ItemCost implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	private String itemName;
	private int itemId;
	private float totalPrice;
	private int quatity;
	private float itemCost;
	private List<String> shipmentType;
	
	public List<String> getShipmentType() {
		return shipmentType;
	}
	public void setShipmentType(List<String> shipmentType) {
		this.shipmentType = shipmentType;
	}

	private ItemVendor itemVendor;
	
	public ItemVendor getItemVendor() {
		return itemVendor;
	}
	public void setItemVendor(ItemVendor itemVendor) {
		this.itemVendor = itemVendor;
	}

	private ItemDetails itemDetails;
	
	public ItemDetails getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}
	public ItemCost(int itemId, String itemName) {
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public String getItemName() {
		return itemName;
	}
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
	public int getItemId() {
		return itemId;
	}
//	public void setItemId(int itemId) {
//		this.itemId = itemId;
//	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public float getItemCost() {
		return itemCost;
	}
	public void setItemCost(float itemCost) {
		this.itemCost = itemCost;
	}
	
	public float getTotalItemsCost() {
		return (float) 12.5;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name :: " + beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Destory the ItemCost bean");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing init the ItemCost bean");
		
	}
	
	public void myInit() {
		System.out.println("Custome init method");
	}
	
	public void destoryBean() {
		System.out.println("Custome destory method");
	}
}
