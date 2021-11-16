package com.yogesh.loadApi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "LoadingDetail")
public class Loading {
	@Id
	private long loadId;
	
	
	@Column(name = "shipperId")
	private long shipperId;
	
	@Column(name = "weight")
	private long weight;
	
	@Column(name = "noOfTrucks")
	private long noOfTrucks;
	
	@Column(name = "productType")
	private String productType;
	
	@Column(name = "truckType")
	private String truckType;
	
	@Column(name = "laodingPoint")
	private String loadingPoint;
	
	@Column(name ="unloadingPoint")
	private String unloadingPoint;
	
	@Column(name = "comment")
	private String comment;
	
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date date;
	
	public Loading(){
		
	}
	
	public Loading(long loadId, long shipperId, long weight, long noOfTrucks, String productType, String truckType,
			String loadingPoint, String unloadingPoint, String comment, Date date) {
		super();
		this.loadId = loadId;
		this.shipperId = shipperId;
		this.weight = weight;
		this.noOfTrucks = noOfTrucks;
		this.productType = productType;
		this.truckType = truckType;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.comment = comment;
		this.date = date;
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

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
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

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Loading [loadId=" + loadId + ", shipperId=" + shipperId + ", weight=" + weight + ", noOfTrucks="
				+ noOfTrucks + ", productType=" + productType + ", truckType=" + truckType + ", loadingPoint="
				+ loadingPoint + ", unloadingPoint=" + unloadingPoint + ", comment=" + comment + ", Date=" + date + "]";
	}
	
	
	
}
