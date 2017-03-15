package com.simple.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simple.server.config.AppConfig;
import com.simple.server.domain.SysMessage;
import com.simple.server.domain.contract.IContract;


@Service("msgService")
@Scope("singleton")
public class ServiceImpl implements IService{
	
	@Autowired
	AppConfig appConfig;

	public AppConfig getAppConfig() throws Exception {
		return appConfig;
	}
	
	@Override
	public void send(IContract message) throws Exception {
		getAppConfig().getMsgDao().send(message);		
	}

	@Override
	@Transactional
	public void insertBus(List<IContract> msgList) throws Exception {
		getAppConfig().getMsgDao().insertBus(msgList);
	}
	
	@Override
	public void insert(List<IContract> msgList) throws Exception {
		for(IContract msg: msgList){
			getAppConfig().getMsgDao().insert(msg);
		}
	}

	@Override
	public void send(SysMessage message) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void insertSys(List<SysMessage> msg) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public List<IContract> readAll(IContract msg) throws Exception {		
		List<IContract> res =  getAppConfig().getMsgDao().readAll(msg);
		return res;
	}

	@Override
	public List<IContract> readbySQLCriteria(IContract msg, String sql) throws Exception {
		List<IContract> res =  getAppConfig().getMsgDao().readbySQLCriteria(msg, sql);
		return res;
	}		
}
