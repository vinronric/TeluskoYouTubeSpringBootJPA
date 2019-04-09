package com.vinoth.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	private Log logger = LogFactory.getLog(ExceptionController.class);
	
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleException(HttpServletRequest req, Exception ex) {
		logger.error("Request " + req.getRequestURI() + " Threw an Exception ", ex);
		ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex);
	    mav.setViewName("error");
		return mav;
	}
	
}
