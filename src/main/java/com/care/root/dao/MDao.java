package com.care.root.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.root.dto.MDto;

@Repository
public class MDao {
	ArrayList<MDto> DB;
	
	public MDao() {
		System.out.println("dao만들어");
		DB = new ArrayList<MDto>();
	}
	
	public void register(String id,String pwd, String name) {
		MDto dto = new MDto();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		DB.add(dto);
		System.out.println(DB.size());
	}
	public int loginChk(String id, String pwd) {
		int result =0;
		for(int i=0;i<DB.size();i++) {
			if(id.equals(DB.get(i).getId()) && pwd.equals(DB.get(i).getPwd())) {
				System.out.println("로그인성공");
				result=1;
			}
		}
		return result;
	}
	public ArrayList<MDto> list() {
		ArrayList<MDto> list = new ArrayList<MDto>();
		for(int i=0;i<DB.size();i++) {
			MDto dto = new MDto();
			dto.setId(DB.get(i).getId());
			dto.setPwd(DB.get(i).getPwd());
			dto.setName(DB.get(i).getName());
			
			list.add(dto);
		}
		return list;
	}
	public MDto info(String id) {
		MDto dto = new MDto();
		for(int i=0;i<DB.size();i++) {
			if(id.equals(DB.get(i).getId())) {
				dto.setId(DB.get(i).getId());
				dto.setPwd(DB.get(i).getPwd());
				dto.setName(DB.get(i).getName());
			}
		}
		return dto;
	}
}
