package com.test.web.service;

import java.util.List;

import com.test.web.dao.ConsumerFetchDao;
import com.test.web.dao.ConsumerFetchDaoImpl;
import com.test.web.model.ElectricityUser;

public class MeterImpl implements Meter{
	public boolean isValidMeter_det(int meterId) {
		ConsumerFetchDao dao = new ConsumerFetchDaoImpl();
		boolean isValid1 = false;
		List<ElectricityUser> userList1 = dao.getUsers();
		for (ElectricityUser user : userList1) {
			if (user.getMeterId()== meterId) {
				isValid1 = true;
			}
		}
		return isValid1;
	}

}
