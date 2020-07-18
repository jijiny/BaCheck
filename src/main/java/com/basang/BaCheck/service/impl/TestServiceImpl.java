package com.basang.BaCheck.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basang.BaCheck.dao.face.TestDao;
import com.basang.BaCheck.service.face.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired TestDao testDao;
	
	@Override
	public List<HashMap<String, Object>> selectAllInfo() {
		return testDao.select();
	}

}
