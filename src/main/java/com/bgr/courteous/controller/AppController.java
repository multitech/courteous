/**
 * @author iximqab
 */
package com.bgr.courteous.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The login action class
 * @author iximqab
 *
 */
@Controller
public class AppController {

	/**
	 * Entry point method to the application
	 * @param model
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	protected String viewLoginAction() {
		return "home";
	}
	
}