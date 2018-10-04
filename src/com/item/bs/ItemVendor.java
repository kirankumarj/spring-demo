package com.item.bs;

public class ItemVendor {
	private String vendorName;
	private String address;
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ItemVendor [vendorName=" + vendorName + ", address=" + address + "]";
	}
}
