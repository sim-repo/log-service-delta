package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.config.EndpointType;
import com.simple.server.config.ErrorType;
import com.simple.server.domain.AContract;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ErrMsg.class)
public class ErrMsg extends AContract{
	
	private Integer id;
	private String errorId;
	private String details;
	private String subscriberId;
	private String subscriberHandler;
	private String storeClass;	
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ErrorType getErrorId() {
		return ErrorType.valueOf(errorId);
	}
	public void setErrorId(ErrorType errorId) {
		this.errorId = errorId.toValue();
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public EndpointType getSubscriberId() {
		return EndpointType.valueOf(subscriberId);
	}
	public void setSubscriberId(EndpointType subscriberId) {
		this.subscriberId = subscriberId.toString();
	}
	public String getSubscriberHandler() {
		return subscriberHandler;
	}
	public void setSubscriberHandler(String subscriberHandler) {
		this.subscriberHandler = subscriberHandler;
	}
	public String getStoreClass() {
		return storeClass;
	}
	public void setStoreClass(String storeClass) {
		this.storeClass = storeClass;
	}
	
}
