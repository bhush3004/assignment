package com.assignment.requestbody.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.assignment.validations.ContainerSize;
import com.assignment.validations.Quantity;

public class RequestData {
	
	@NotNull(message="containerSize : positive number value is required.")
	@ContainerSize()
	private int containerSize;
	
	@NotNull(message="origin : Value is required.")
	@Min(5)
	@Max(20)
	private String origin;
	
	@NotNull(message="destination : Value is required.")
	@Min(5)
	@Max(20)
	private String destination;
	
	@NotNull(message="quantity : Value is required.")
	@Quantity()
	private int quantity;
	
	@NotNull(message="containerType : Value is required.")
	private ContainerType containerType;

	public int getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(int containerSize) {
		this.containerSize = containerSize;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}

}
