package com.test.web.dao;

import java.util.List;

import com.test.web.model.ElectricityUser;


public interface ConsumerFetchDao {
	List<ElectricityUser> getUsers();

}
