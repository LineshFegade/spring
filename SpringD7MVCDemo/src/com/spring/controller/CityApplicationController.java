package com.spring.controller;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.CityInfo;
@Controller
@RequestMapping("/")
public class CityApplicationController {
	@RequestMapping(method = RequestMethod.GET)
	public String myhomemethod(ModelMap model) {
		
		return "mywelcomepage";
	}
	@RequestMapping(value = "getCityInfo")
	public String getCityInfo(HttpServletRequest request,ModelMap model) {
		String city=request.getParameter("city");
		
		HashMap<String,CityInfo> hm=new HashMap<>();
		hm.put("Pune",new CityInfo("Pune", "MH", "famous for historical places") );
		hm.put("Mumbai",new CityInfo("Mumbai", "MH", "famous for industries & employment") );
		hm.put("Jaipur",new CityInfo("Jaipur", "RJ", "famous for forts & palaces") );
		hm.put("Delhi",new CityInfo("Delhi", "DL", "famous for Taj Mahal") );
		hm.put("keral",new CityInfo("keral", "KL", "famous for Turisum") );
		
		CityInfo cinfo=hm.get(city);
		model.addAttribute("cinfo",cinfo);		
		return "View";
	}
}
