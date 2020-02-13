package com.lti.hr.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.HrException;
import com.lti.hr.core.entities.Department;

@Repository
public class DeptDaoImpl implements DeptDao {
	@PersistenceContext
	private EntityManager manager;//jpa annotation
	
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		
		String strQry="from Department";
		Query qry= manager.createQuery(strQry);
		List<Department> lst = qry.getResultList();
		return (ArrayList<Department>) lst;
	}

	@Transactional(propagation=Propagation.REQUIRED)//to use same transaction that is started in service layer
	@Override
	public boolean insertNewDept(Department d) throws HrException {
		manager.persist(d);
		return true;
	}

}
