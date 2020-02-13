package com.lti.hr.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.hr.core.HrException;
import com.lti.hr.core.entities.Department;
import com.lti.hr.core.services.DeptService;

@Controller
public class HrController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("menu.do")
	public String getMainMenu(){
		return "MainMenu";
	}
	@RequestMapping("viewDept.do")
	public ModelAndView getdeptlist() {
		ModelAndView madv= new ModelAndView();
		ArrayList<Department> lst=null;
		try {
			lst = deptService.getDeptList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		madv.addObject("dept",lst);
		madv.setViewName("viewDept");
		return madv;
		//return "MainMenu";
	}
	
	@RequestMapping("entryDept.do")
	public String insertdeptlist() {
		return "Entry"; 
	}
	
	@RequestMapping("createDept.do")
	public ModelAndView createNewDepartment(@RequestParam("deptNo") int deptNo,@RequestParam("dName") String dName,@RequestParam("dLoc") String loc) throws HrException{
		ModelAndView mAndV = new ModelAndView();
		Department d = new Department(deptNo,dName,loc);
		boolean isInserted = deptService.createNewDept(d);
		if(isInserted){
			mAndV.addObject("msg", "Department Created successfully");
			mAndV.setViewName("SuccessInsert");
		}
		else{
			mAndV.addObject("msg", "Department Creation failed!!!");
			mAndV.setViewName("Entry");
		}
		return mAndV;
	}
}
