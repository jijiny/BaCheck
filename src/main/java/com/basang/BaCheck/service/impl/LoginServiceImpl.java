package com.basang.BaCheck.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basang.BaCheck.dao.face.LoginDao;
import com.basang.BaCheck.dto.User;
import com.basang.BaCheck.service.face.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired LoginDao loginDao;
	
	@Override
	public int loginCheck(User user) {
		return loginDao.loginCheck(user);
	}

}
