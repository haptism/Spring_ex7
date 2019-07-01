package com.iu.s7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.computer.Mainboard;
import com.iu.computer.Ram;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private Mainboard mainboard;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		for(Ram ram:mainboard.getRams()) {
			System.out.println(ram.getSize());
			System.out.println(ram.getCompany());
		}
		System.out.println("============================");
		mainboard.getRams().get(0).setCompany("SAMSUNG");
		
		for(Ram ram:mainboard.getRams()) {
			System.out.println(ram.getSize());
			System.out.println(ram.getCompany());
		}
		
		
		
		return "home";
	}
	
}
