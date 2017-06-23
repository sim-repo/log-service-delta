package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AbstractLogMsg;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = RedirectRouting.class)
public class RedirectRouting extends AbstractLogMsg{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("id")
	protected Integer id;
	
	protected String methodName;	
	protected String url;	
	protected Boolean useAuth;
	
	@Override
	public String getClazz() { 
		return this.getClass().getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getUseAuth() {
		return useAuth;
	}

	public void setUseAuth(Boolean useAuth) {
		this.useAuth = useAuth;
	}
	
}
