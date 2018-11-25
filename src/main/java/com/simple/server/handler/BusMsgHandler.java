package com.simple.server.handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service("busMsgHandler")
public class BusMsgHandler extends AbstractMsgHandler{
	
	
	public void handleBusJsonMsg(String json) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date();	
		System.out.println("log: handle " + dateFormat.format(date));	
	
		getAppConfig().getDirtyBusJsonQueue().put(json);
	}

	public void handleBusXmlMsg(String xml) throws Exception {
		// TODO Auto-generated method stub
	}
}
