package com.simple.server.tasks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.simple.server.config.AppConfig;
import com.simple.server.domain.contract.IContract;
import com.simple.server.lifecycle.HqlStepsType;
import com.simple.server.mediators.CommandType;
import com.simple.server.statistics.time.Timing;

@SuppressWarnings("static-access")
@Service("BusLogMsgTask")
@Scope("prototype")
public class BusLogMsgTask extends AbstractTask  {
	
	@Autowired
	private AppConfig appConfig;

	private final static Integer MAX_NUM_ELEMENTS = 100000;
	private List<IContract> list = new ArrayList<IContract>();

	@Override
	public void update(Observable o, Object arg) {
		if (arg != null && arg.getClass() == CommandType.class) {
			switch ((CommandType) arg) {
			case WAKEUP_CONSUMER:
			case WAKEUP_ALL:
				arg = CommandType.WAKEUP_ALLOW;
				super.update(o, arg);
				break;
			case AWAIT_CONSUMER:
			case AWAIT_ALL:
				arg = CommandType.AWAIT_ALLOW;
				super.update(o, arg);
				break;
			}
		}
	}

	
	@Override
	public void task() throws Exception {
		
		if (appConfig.getBusLogMsgQueue().drainTo(list, MAX_NUM_ELEMENTS) == 0)
			list.add(appConfig.getBusLogMsgQueue().take());

		Thread.currentThread().sleep(Timing.getSleep());

		while (basePhaser.getCurrNumPhase() != HqlStepsType.START.ordinal()) {
			if (appConfig.getBusLogMsgQueue().size() > 0)
				appConfig.getBusLogMsgQueue().drainTo(list, MAX_NUM_ELEMENTS);
		}
		
		appConfig.getMsgService().insertBus(list);
		list.clear();
	}
}
