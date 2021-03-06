package com.mh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh.dao.WebBindEmailDao;
import com.mh.entity.WebBindEmail;
import com.mh.service.WebBindEmailService;

@Service
public class WebBindEmailServiceImpl  implements WebBindEmailService{
	
	@Autowired
	public WebBindEmailDao webBindEmailDao;
	
	@Override
	public int addEntity(List<Object> list) {
		return this.webBindEmailDao.addEntity(list);
		
	}
	
	
	@Override
	public int updateBindEmail(List<Object> list){
		return this.webBindEmailDao.updateBindEmail(list);
		
	}
	
	
	@Override
	public WebBindEmail selectWebBindEmail(String userName){
		return this.webBindEmailDao.selectWebBindEmail(userName);
	}
	

}
