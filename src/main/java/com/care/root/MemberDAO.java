package com.care.root;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.login.TestDTO;

@Repository
public class MemberDAO {
	ArrayList<TestDTO> DB;
	public MemberDAO() {
		DB = new ArrayList<TestDTO>();
		
	
		
	}
}
