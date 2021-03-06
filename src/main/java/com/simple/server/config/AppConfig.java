package com.simple.server.config;

import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import com.simple.server.dao.MsgDao;
import com.simple.server.domain.AContract;
import com.simple.server.domain.AbstractLogMsg;
import com.simple.server.domain.SysMessage;
import com.simple.server.factory.PhaserRunner;
import com.simple.server.mediators.Mediator;
import com.simple.server.mediators.Subscriber;
import com.simple.server.service.IService;

@Service("appConfig")
@Scope("singleton")
public class AppConfig {

	public final static String DATEFORMAT = "dd.MM.yyyy HH:mm:ss.SSSz";

	private Subscriber subscriber = new Subscriber();

	@Autowired
	private MessageChannel busLogChannel;

	@Autowired
	private MessageChannel srvLogChannel;

	@Autowired
	private IService msgLogService;

	@Autowired
	MsgDao msgDao;

	@Autowired
	private PhaserRunner phaserRunner;
	
	private LinkedBlockingQueue<String> dirtyBusJsonQueue;
	private LinkedBlockingQueue<String> dirtySrvJsonQueue;
	private LinkedBlockingQueue<AContract> busClientMsgQueue;
	private LinkedBlockingQueue<AbstractLogMsg> busLogMsgQueue;	
	private LinkedBlockingQueue<SysMessage> sysMsgQueue;

	private Mediator mediator = new Mediator();

	
	private static final Logger logger = LogManager.getLogger(AppConfig.class);
	
	public Mediator getMediator() {
		return mediator;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public PhaserRunner getPhaserRunner() {
		return phaserRunner;
	}

	public IService getMsgService() {
		return msgLogService;
	}

	public MsgDao getMsgDao() {
		return msgDao;
	}

	public MessageChannel getBusLogChannel() {
		return busLogChannel;
	}

	public MessageChannel getSrvLogChannel() {
		return srvLogChannel;
	}

	public LinkedBlockingQueue<String> getDirtyBusJsonQueue() {
		return dirtyBusJsonQueue;
	}

	public LinkedBlockingQueue<String> getDirtySrvJsonQueue() {
		return dirtySrvJsonQueue;
	}

	public LinkedBlockingQueue<AContract> getBusClientMsgQueue() {
		return busClientMsgQueue;
	}

	public LinkedBlockingQueue<SysMessage> getSysMsgQueue() {
		return sysMsgQueue;
	}
	
	public LinkedBlockingQueue<AbstractLogMsg> getBusLogMsgQueue() {
		return busLogMsgQueue;
	}
		
	public static Logger getLogger() {
		return logger;
	}

	public void initDirtyBusJsonQueue(int size){
		this.dirtyBusJsonQueue = new LinkedBlockingQueue<>(size);
	}
	
	public void initDirtySrvJsonQueue(int size) {
		this.dirtySrvJsonQueue = new LinkedBlockingQueue<>(size);
	}

	public void initBusClientMsgQueue(int size) {
		this.busClientMsgQueue = new LinkedBlockingQueue<>(size);
	}

	public void initBusLogMsgQueue(int size) {
		this.busLogMsgQueue = new LinkedBlockingQueue<>(size);
	}

	public void initSysMsgQueue(int size) {
		this.sysMsgQueue = new LinkedBlockingQueue<>(size);
	}

	
}
