package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.config.SqlType;
import com.simple.server.domain.AbstractLogMsg;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusTagParam.class)
public class BusTagParam extends AbstractLogMsg{
	private static final long serialVersionUID = 1L;
	
	private int id;	
	private BusTagTemplate tagTemplate;
	private String paramName;
	private String paramDesc;
	private String sqlType;
	private String sample;
	private int required;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getClazz() {
		return BusTagParam.class.getSimpleName();
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public BusTagTemplate getTagTemplate() {
		return tagTemplate;
	}

	public void setTagTemplate(BusTagTemplate tagTemplate) {
		this.tagTemplate = tagTemplate;
	}

	public String getSqlType() {
		return sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;		
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

	public int getRequired() {
		return required;
	}

	public void setRequired(int required) {
		this.required = required;
	}
	
	
}
