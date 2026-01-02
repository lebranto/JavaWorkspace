package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	Employee e = new Employee();

	public void add(int empNO, String name, char gender, String phone) {
		e.setEmpNO(empNO);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}

	public void add(int empNO, String name, char gender, String phone, String dept, int salary, double bonus) {

		e.setEmpNO(empNO);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);

	}

	public void modify(String phone) {

		e.setPhone(phone);
	}

	public void modify(int salary) {

		e.setSalary(salary);

	}

	public void modify(double bonus) {

		e.setBonus(bonus);

	}

	public Employee remove() {
		
		e.setEmpNO(0);
		e.setName(null);
		e.setGender('0');
		e.setPhone(null);
		e.setDept(null);
		e.setSalary(0);
		e.setBonus(0);

		
		return e;

	}

	public String inform() {

		String s = e.printEmployee();

		if (e.getName() == null) {
			s = "사원의 정보를 찾을 수 없습니다.";
		}

		return s;

	}

}