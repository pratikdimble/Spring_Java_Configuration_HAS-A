package com.app.test;

public class Address {
	private int addrId;
	private String loc;
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", loc=" + loc + "]";
	}
	
	

}
