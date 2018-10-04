package com.item.bc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.item.bs.ItemCost;
import com.item.bs.ItemDetails;

public class BusinessLogic {
	private static ApplicationContext context;
	private static AbstractApplicationContext abstractContext;

	public static void main(String[] args) {
		//ItemCost cost = new ItemCost();  tightly coupled
		
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		ItemCost cost = (ItemCost) beanFactory.getBean("itemCost");
//		System.out.println(cost.getTotalItemsCost());
		
		
		context = new ClassPathXmlApplicationContext("spring.xml");
		ItemCost cost = (ItemCost) context.getBean("itemCost");
	
		System.out.println("Item Cost (property) :: " + cost.getItemCost());
		System.out.println("Item Id (constructor-org) :: " + cost.getItemId());
		System.out.println("Item Name (constructor-org) :: " + cost.getItemName());
		System.out.println("Item Details (ref other class object) :: " + cost.getItemDetails());
		System.out.println("Item vendor (inner bean object) :: " + cost.getItemVendor());
		System.out.println("Item shipment type (List) :: " + cost.getShipmentType());
		
		
		ItemDetails itemDetails = (ItemDetails) context.getBean("itemDetails");
		ItemDetails dupItemDetails = (ItemDetails) context.getBean("dup-item-details");
		System.out.println("Instance of ItemDetails :: " + itemDetails.hashCode());
		System.out.println("Instance of dup ItemDetails :: " + dupItemDetails.hashCode());
		
		
		ItemDetails newItemDetails = (ItemDetails) context.getBean("itemDetails");
		System.out.println("Instance of ItemDetails :: " + newItemDetails.hashCode());
		
		// mostly used in the stand alone applications 
		abstractContext = new ClassPathXmlApplicationContext("spring.xml");
		abstractContext.registerShutdownHook();
		ItemCost cost2 = (ItemCost) abstractContext.getBean("itemCost");
	
	}
}
