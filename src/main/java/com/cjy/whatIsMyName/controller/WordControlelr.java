package com.cjy.whatIsMyName.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

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
		
		String[] tss = null;
		
		//단어.txt에서 값 가져오기
		try{
            //파일 객체 생성
            File file = new File("C:\\work\\sts-4.8.0.RELEASE-workspace\\whatIsMyName\\src\\main\\resources\\input.txt");
            //스캐너로 파일 읽기
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
            	String ts = scan.nextLine();
            	tss = ts.split(" - ");
            	System.out.println(ts);
            }
            //System.out.println(scan.useDelimiter("\\z").next());
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }
		
		
		
		List<Word> words = wordService.getWords();
		
		System.out.println(words);
		System.out.println(tss[0]);
		
		req.setAttribute("tss", tss);
		
		req.setAttribute("words", words);
		
		return "/usr/word/list";
	}
	
}
