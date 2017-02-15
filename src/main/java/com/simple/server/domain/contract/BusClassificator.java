package com.simple.server.domain.contract;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AbstractLogMsg;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusClassificator.class)
public class BusClassificator extends AbstractLogMsg{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String desc;
	private BusClassificator parent = null;	
	private Integer level = 1;
	private Short clickable = 0; 
	private Set<BusClassificator> children = new HashSet();
	
	
	@Override
	public String getClazz() {	
		return null;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}			
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Short getClickable() {
		return clickable;
	}
	public void setClickable(Short clickable) {
		this.clickable = clickable;
	}
	public BusClassificator getParent() {
		return parent;
	}
	public void setParent(BusClassificator parent) {
		this.parent = parent;
	}		
	public Set<BusClassificator> getChildren() {
		return children;
	}
	public void setChildren(Set<BusClassificator> children) {
		this.children = children;
	}
	
	
}
