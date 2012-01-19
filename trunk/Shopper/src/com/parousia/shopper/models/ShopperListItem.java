package com.parousia.shopper.models;

import java.util.ArrayList;

import android.location.Location;

public class ShopperListItem {
	
	String listHeader;
	ArrayList<ShopperListContents> listContents;
	Location location;
	ArrayList<ShopperListAlarms> listAlarms;
	/**
	 * @return the listHeader
	 */
	public String getListHeader() {
		return listHeader;
	}
	/**
	 * @param listHeader the listHeader to set
	 */
	public void setListHeader(String listHeader) {
		this.listHeader = listHeader;
	}
	/**
	 * @return the listContents
	 */
	public ArrayList<ShopperListContents> getListContents() {
		return listContents;
	}
	/**
	 * @param listContents the listContents to set
	 */
	public void setListContents(ArrayList<ShopperListContents> listContents) {
		this.listContents = listContents;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @return the listAlarms
	 */
	public ArrayList<ShopperListAlarms> getListAlarms() {
		return listAlarms;
	}
	/**
	 * @param listAlarms the listAlarms to set
	 */
	public void setListAlarms(ArrayList<ShopperListAlarms> listAlarms) {
		this.listAlarms = listAlarms;
	}
	

}
