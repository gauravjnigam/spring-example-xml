package com.gn.service;

import java.util.List;

import com.gn.model.Employee;
import com.gn.repository.EmpRepository;

public class EmpServiceImp implements EmpService {

	private EmpRepository empRepository;
	
	// for constructor injection
	public EmpServiceImp(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}
	
	public EmpServiceImp() {
		
	}
	
	// for setter injection
	public void setEmpRepository(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}
	
	

	public List<Employee> getAll() {
		return empRepository.getAll();
	}
}
