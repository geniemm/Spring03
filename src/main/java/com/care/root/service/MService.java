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
		System.out.println("���񽺸������");
	}
	
	public void register(String id,String pwd,String name) {
		//db�� �����Ѵٴ� �����Ͽ� dao�� �����ַ�
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
