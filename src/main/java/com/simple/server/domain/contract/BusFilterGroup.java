package com.simple.server.domain.contract;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AbstractLogMsg;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusFilterGroup.class)
public class BusFilterGroup extends AbstractLogMsg {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String modelClass;	
	private String controlType;
	private String caption;
	private String modelField;
	
	 @JsonManagedReference
	private Set<BusFilterItem> items;

	@Override
	public String getClazz() { 
		return this.getClass().getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelClass() {
		return modelClass;
	}

	public void setModelClass(String modelClass) {
		this.modelClass = modelClass;
	}

	public Set<BusFilterItem> getItems() {
		return items;
	}

	public void setItems(Set<BusFilterItem> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getModelField() {
		return modelField;
	}

	public void setModelField(String modelField) {
		this.modelField = modelField;
	}
	
		

}
