package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AContract;


@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ErrDefMsg.class)
public class ErrDefMsg extends AContract{
	
	private Integer id;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
