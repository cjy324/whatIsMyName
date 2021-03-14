package com.cjy.whatIsMyName.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionControlelr {
	
	@RequestMapping("/usr/question/firstQuestion")
	public String firstQuestion() {
		return "/usr/question/firstQuestion";
	}
	
	@RequestMapping("/usr/question/secondQuestion")
	public String secondQuestion(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		
		req.setAttribute("firstAnswer", firstAnswer);	
		
		return "/usr/question/secondQuestion";
	}
	
	@RequestMapping("/usr/question/thirdQuestion")
	public String thirdQuestion(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		String secondAnswer = req.getParameter("secondAnswer");
		
		req.setAttribute("firstAnswer", firstAnswer);
		req.setAttribute("secondAnswer", secondAnswer);	
		
		return "/usr/question/thirdQuestion";
	}
	
	@RequestMapping("/usr/question/fourthQuestion")
	public String fourthQuestion(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		String secondAnswer = req.getParameter("secondAnswer");
		String thirdAnswer = req.getParameter("thirdAnswer");
		
		req.setAttribute("firstAnswer", firstAnswer);
		req.setAttribute("secondAnswer", secondAnswer);
		req.setAttribute("thirdAnswer", thirdAnswer);
		
		return "/usr/question/fourthQuestion";
	}
	
	@RequestMapping("/usr/question/fifthQuestion")
	public String fifthQuestion(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		String secondAnswer = req.getParameter("secondAnswer");
		String thirdAnswer = req.getParameter("thirdAnswer");
		String fourthAnswer = req.getParameter("fourthAnswer");
		
		System.out.println(fourthAnswer);
		
		req.setAttribute("firstAnswer", firstAnswer);
		req.setAttribute("secondAnswer", secondAnswer);
		req.setAttribute("thirdAnswer", thirdAnswer);
		req.setAttribute("fourthAnswer", fourthAnswer);
		
		return "/usr/question/fifthQuestion";
	}
	
	@RequestMapping("/usr/question/doConfirm")
	public String doConfirm(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		String secondAnswer = req.getParameter("secondAnswer");
		String thirdAnswer = req.getParameter("thirdAnswer");
		String fourthAnswer = req.getParameter("fourthAnswer");
		String fifthAnswer = req.getParameter("fifthAnswer");
		
		req.setAttribute("firstAnswer", firstAnswer);
		req.setAttribute("secondAnswer", secondAnswer);
		req.setAttribute("thirdAnswer", thirdAnswer);
		req.setAttribute("fourthAnswer", fourthAnswer);
		req.setAttribute("fifthAnswer", fifthAnswer);
		
		return "/usr/question/doConfirm";
	}
	
	@RequestMapping("/usr/question/confirm")
	public String confirm(HttpServletRequest req) {
		String firstAnswer = req.getParameter("firstAnswer");
		String secondAnswer = req.getParameter("secondAnswer");
		String thirdAnswer = req.getParameter("thirdAnswer");
		String fourthAnswer = req.getParameter("fourthAnswer");
		String fifthAnswer = req.getParameter("fifthAnswer");
		
		req.setAttribute("firstAnswer", firstAnswer);
		req.setAttribute("secondAnswer", secondAnswer);
		req.setAttribute("thirdAnswer", thirdAnswer);
		req.setAttribute("fourthAnswer", fourthAnswer);
		req.setAttribute("fifthAnswer", fifthAnswer);
		
		return "/usr/question/confirm";
	}
	
}
