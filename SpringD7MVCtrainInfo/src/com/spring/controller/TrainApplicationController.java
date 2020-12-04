package com.spring.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.TrainInfo;
@Controller
@RequestMapping("/")
public class TrainApplicationController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String myHomeMethod(ModelMap model) {
		
		return "welcomepage";
	}
	
	
	
	@RequestMapping(value = "/getTrainInfo",method = RequestMethod.GET)
	public String getTrainInfo(HttpServletRequest request,ModelMap model) {
		String tno=request.getParameter("trainNo");
		HashMap<String, TrainInfo> hm=new  HashMap<>();
		hm.put("12105", new TrainInfo(12105, "gitanjali exp", "CSMT", "Nagpur", "8:30"));
		hm.put("13216", new TrainInfo(13216, "Duronto exp", "Nagpur", "Pune", "11:25"));
		hm.put("22108", new TrainInfo(22108, "Garibrath exp", "CSMT", "Amrutsar", "19:05"));
		hm.put("12005", new TrainInfo(12005, "Pragati exp", "CSMt", "pune", "6:40"));
		hm.put("11109", new TrainInfo(11109, "Decan Queen exp", "pune", "CSMT", "14:15"));
		hm.put("22505", new TrainInfo(22505, "Tejas Exp", "CSTM", "Goa", "13:07"));
		hm.put("52073", new TrainInfo(52073, "Udhyan exp", "CSTM", "Banglore", "20:30"));
		
		TrainInfo traininfo=hm.get(tno);
		model.addAttribute("traininfo", traininfo);
		return "view";
	}
}
