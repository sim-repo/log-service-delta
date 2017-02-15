package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AbstractLogMsg;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusFilterItem.class)
public class BusFilterItem extends AbstractLogMsg{
	
	private static final long serialVersionUID = 1L;
	@JsonBackReference
	private BusFilterGroup filterGroup;
	private Integer id;
	private String modelField;
	private String type;			
	private String value;	
	private String valueCaption;
	private Integer minValue;	
	private Integer maxValue;
	
	@Override
	public String getClazz() {
		return this.getClass().getName();
	}
	public BusFilterGroup getFilterGroup() {
		return filterGroup;
	}
	public void setFilterGroup(BusFilterGroup filterGroup) {
		this.filterGroup = filterGroup;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getModelField() {
		return modelField;
	}
	public void setModelField(String modelField) {
		this.modelField = modelField;
	}
	public Integer getMinValue() {
		return minValue;
	}
	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}
	public Integer getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
	public String getValueCaption() {
		return valueCaption;
	}
	public void setValueCaption(String valueCaption) {
		this.valueCaption = valueCaption;
	}	
	
}
