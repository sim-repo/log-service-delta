package com.simple.server;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple.server.config.AppConfig;
import com.simple.server.domain.contract.BusClassificator;
import com.simple.server.domain.contract.BusTagTemplate;
import com.simple.server.domain.contract.IContract;

@RestController
public class HomeController {
	
	@Autowired
	AppConfig appConfig;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	
	@RequestMapping(value = "/classificator", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String home(@RequestBody BusClassificator classificator) {
		
		List<IContract> list = new ArrayList();
		list.add(classificator);
		try {
			appConfig.getMsgDao().insertBus(list);
		} catch (Exception e) {	
			e.printStackTrace();
		}

		return "home";
	}
	
	
	
	
	@RequestMapping(value = "/help", method = RequestMethod.GET)
	public @ResponseBody BusClassificator home() {
						
		
		BusClassificator parent = new BusClassificator();
		
		BusClassificator child = new BusClassificator();
		child.setId("1");
		child.setName("child name");
		child.setDesc("hello world");
		//child.setChildren(null);
		//child.setParent(parent);
		
		BusClassificator child2 = new BusClassificator();
		child2.setId("2");
		child2.setName("child name");
		child2.setDesc("hello world");
		//child2.setChildren(null);
		//child2.setParent(parent);
		
		Set<BusClassificator> children = new HashSet();
		children.add(child);
		children.add(child2);
		
		
		parent.setId("0");
		parent.setName("parent name");
		parent.setDesc("hello world");
		//parent.setChildren(children);
		//parent.setParent(null);

		return parent;
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String home(@RequestBody BusTagTemplate tag) {
		
		List<IContract> list = new ArrayList();		
		try {
			list = appConfig.getMsgDao().readAll(tag);
			for(IContract msg: list){
				BusTagTemplate t = (BusTagTemplate)msg;
				System.out.println("res:" +t);
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}

		return "home";
	}
	
	
}
