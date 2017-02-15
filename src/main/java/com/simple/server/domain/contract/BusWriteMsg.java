package com.simple.server.domain.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AContract;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusWriteMsg.class)
public class BusWriteMsg extends AContract{	

}
