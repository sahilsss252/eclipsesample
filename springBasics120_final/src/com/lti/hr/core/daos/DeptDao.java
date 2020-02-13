package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.HrException;
import com.lti.hr.core.entities.Department;

public interface DeptDao {

	public ArrayList<Department> getDeptList() throws HrException;
	public boolean insertNewDept(Department d) throws HrException; 
}
