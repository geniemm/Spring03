package com.care.root.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.dao.MDao;
import com.care.root.dto.MDto;

@Service
public class MService {

	@Autowired
	private MDao dao;
	
	public MService() {
		System.out.println("서비스만들었다");
	}
	
	public void register(String id,String pwd,String name) {
		//db랑 연산한다는 가정하에 dao로 보내주래
		dao.register(id,pwd,name);
		
	}
	public int loginChk(String id,String pwd) {
		int result= dao.loginChk(id,pwd);
		return result;
	}
	public ArrayList<MDto> list() {
		ArrayList<MDto> dto = dao.list();
		return dto;
		
	}
	public MDto info(String id) {
		MDto dto = dao.info(id);
		return dto;
	}
}
