package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.HrException;
import com.lti.hr.core.daos.DeptDao;
import com.lti.hr.core.entities.Department;

@Service//contains all annotation of spring only
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		return dao.getDeptList();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)//creats a new transaction
	@Override
	public boolean createNewDept(Department d) throws HrException {
		//Department department=new Department();
		//transaction must be start in service layer and managed by dao layer
		return dao.insertNewDept(d);
	}

}
