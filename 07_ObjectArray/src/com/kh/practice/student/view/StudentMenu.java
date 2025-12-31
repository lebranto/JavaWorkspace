package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("====== 학생 정보 출력 ======");

//		for (int i = 0; i < ssm.printStudent().length; i++) {
//			System.out.println(ssm.printStudent()[i].inform());
//			// ssm.printStudent() => 객체
//		}
		
		Student [] arr = ssm.printStudent(); //학생객체배열, 주소값 복사
		for (Student s : arr) { // arr = ssm.printStudent
			System.out.println(s.inform());
		}
		

		System.out.println("====== 학생 성적 출력 ======");
		
		
		double [] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + dArr[0] );
		System.out.println("학생 점수 평균 : " + dArr[1] );
		
		
//		System.out.println("학생 성적 합계 : " + ssm.avgScore()[0]);
//				// ssm.printStudent() => 객체
//		System.out.println("학생 성적 평균 : " + ssm.avgScore()[1]);
//		

		System.out.println("====== 성적 결과 출력 ======");
		
		 //이름 + "학생은 " + " 재시험 대상/ 통과" + 입니다.
		 //이름은 가져오고 재시험 대상/ 통과는 함수로 판별해야한다.
		
		for(Student s : arr) {
			System.out.println(s.getName()+ "은 " + (
					s.getScore()<StudentController.cut_line ? "재시험 대상입니다." : "통과입니다."));
		}
		
		
//		for (int i = 0; i < ssm.printStudent().length; i++) {
//			if(ssm.printStudent()[i].getScore() < StudentController.cut_line) {
//			System.out.println(ssm.printStudent()[i].getName()+ "학생은 재시험 대상입니다.");
//		}else if(ssm.printStudent()[i].getScore() >= StudentController.cut_line){
//			System.out.println(ssm.printStudent()[i].getName()+ "학생은 통과입니다.");
//		}
//		
//		}	
		
	}

}
