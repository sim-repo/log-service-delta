package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AContract;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ErrSubMsg.class)
public class ErrSubMsg extends AContract{
	
	private Integer id;
	private String storeClass;	
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getStoreClass() {
		return storeClass;
	}
	public void setStoreClass(String storeClass) {
		this.storeClass = storeClass;
	}
}
