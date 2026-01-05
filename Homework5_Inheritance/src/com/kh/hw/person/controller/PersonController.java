package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student [] s = new Student[3];
	Employee [] e = new Employee[10];
  
	public int[] personCount() {
		
		int[] arr = new int[2];
		
		arr[0] = 0;
		for (Student snum : s) {
			if(snum !=null) {
				arr[0]++;				
			}
		}
		
		arr[1] = 0;
		for (Employee num : e) {
			if(num !=null) {
				arr[1]++;				
			}
		}
		
	
		
		return arr;
	}
	
	public void insertStudnt(String name, int age, double height, double weight, int grade
			, String major) {
		
		Student stu = new Student(name, age, height, weight, grade, major);
		
		for(int i = 0 ; i < e.length ; i++) {
			if(s[i]==null) {
				s[i] = stu;
				break;
			}
		
		}
	}
	
	public Student[] printStudent() {
		
		
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary
			,String dept) {
		
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		
		for(int i = 0 ; i < e.length ; i++) {
			if(e[i]==null) {
				e[i] = emp;
				break;
			}
			
		}
		
		
	}
	
	public Employee[] printEmployee() {
		
		
		return e;
	}

}
