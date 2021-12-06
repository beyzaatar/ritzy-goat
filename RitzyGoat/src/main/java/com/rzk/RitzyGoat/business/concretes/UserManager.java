package com.rzk.RitzyGoat.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rzk.RitzyGoat.core.utilities.results.DataResult;
import com.rzk.RitzyGoat.core.utilities.results.Result;
import com.rzk.RitzyGoat.core.utilities.results.SuccessResult;
import com.rzk.RitzyGoat.core.utilities.results.SuccessDataResult;
import com.rzk.RitzyGoat.business.abstracts.UserService;
import com.rzk.RitzyGoat.dataAccess.abstracts.UserDao;
import com.rzk.RitzyGoat.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult("registration is successful!!");
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"users are listed!");
		
	}

}
