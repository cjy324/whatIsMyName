package com.cjy.whatIsMyName.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjy.whatIsMyName.dao.WordDao;
import com.cjy.whatIsMyName.dto.Word;

@Service
public class WordService {

	@Autowired
	WordDao wordDao;

	public List<Word> getWords() {
		return wordDao.getWords();
	}
	


}
