package com.lti.hr.core.services;

import java.util.ArrayList;

import com.lti.hr.core.HrException;
import com.lti.hr.core.entities.Department;

public interface DeptService {

	public ArrayList<Department> getDeptList() throws HrException;
	public boolean createNewDept(Department d) throws HrException;
}
