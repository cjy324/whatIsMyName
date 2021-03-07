package com.cjy.whatIsMyName.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjy.whatIsMyName.dto.Word;
import com.cjy.whatIsMyName.service.WordService;

@Controller
public class WordControlelr {
	
	@Autowired
	WordService wordService;

	@RequestMapping("/usr/word/list")
	public String showList(HttpServletRequest req) {
		
		List<Word> words = wordService.getWords();
		
		System.out.println(words);
		
		req.setAttribute("words", words);
		
		return "/usr/word/list";
	}
	
}
