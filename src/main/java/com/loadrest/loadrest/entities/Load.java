package com.loadrest.loadrest.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.GeneratedValue;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class Load {
	
	 @Id
	 @GeneratedValue
	 private long loadId;
	 private long shipperId;
	 private String loadingPoint;
	 private  String unLoadingPoint;
	 private  String productType;
	 private  String truckType;
	 private  int noOfTruck;
	 private int weight;
	 private String  Date;
	public Load(long loadId, long shipperId, String loadingPoint, String unLoadingPoint, String productType,
			String truckType, int noOfTruck, int weight, String date) {
		super();
		this.loadId = loadId;
		this.shipperId = shipperId;
		this.loadingPoint = loadingPoint;
		this.unLoadingPoint = unLoadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		Date = date;
	}
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLoadId() {
		return loadId;
	}
	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnLoadingPoint() {
		return unLoadingPoint;
	}
	public void setUnLoadingPoint(String unLoadingPoint) {
		this.unLoadingPoint = unLoadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTruck() {
		return noOfTruck;
	}
	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Load [loadId=" + loadId + ", shipperId=" + shipperId + ", loadingPoint=" + loadingPoint
				+ ", unLoadingPoint=" + unLoadingPoint + ", productType=" + productType + ", truckType=" + truckType
				+ ", noOfTruck=" + noOfTruck + ", weight=" + weight + ", Date=" + Date + "]";
	}
	
	 
	 	 
	 
	 
	
}
