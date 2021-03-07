package com.cjy.whatIsMyName.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cjy.whatIsMyName.dto.Word;

@Mapper
public interface WordDao {
	
	List<Word> getWords();

}
