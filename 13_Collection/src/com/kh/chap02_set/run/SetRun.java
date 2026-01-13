package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		
		/*
		 * set
		 * 	- 중복을 허용하지 않는다.
		 * 	- 저장된 순서를 보장하지 않는다.
		 * 	
		 * HashSet : 중복을 허용하지 않고, "빠르게" 저장 및 조회가 가능한 자료구조.
		 * LinkedHashSet : 중복을 허용하지 않지만, 저장된 순서를 유지 한다.
		 * TreeSet : 중복을 허용하지 않지만, 오름차순정렬(기본값)을 지원
		 *          - 마음에 들지 않으면 Comparator로 바꿀 수 있다.
		 * */
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("반갑습니다.");
		hs1.add("반갑습니다.");  // 중복값이 허용할까? -> 안한다.
		hs1.add("여러분");
		hs1.add("안녕하세요");
		hs1.add("여러분");  // 한번 뛰고 적은 것도 중복으로 볼까? -> 본다
		
		// 저장순서 X , 중복값 저장 x
		System.out.println(hs1);
		
		System.out.println(hs1.size()); // 크기 출력
		
		System.out.println(hs1.remove("여러분")); // 삭제가 되면 true 라고 나옴
		
		System.out.println(hs1);
		
		
		System.out.println("=====================================");
		/*
		 * HashSet이 객체를 저장하는 알고리즘(저장 순서)
		 * 1. 객체의 hashCode() 메서드로 객체를 저장할 위치(주소값)을 찾는다.
		 * 2. 저장한 위치에 이미 저장된 값이 있다면 equals를 통해 저장된 값과
		 * 새로 추가할 값이 같은지 검사한다.
		 * 3. 두 값이 같다면 데이터를 중복으로 저장하지 않고, 두값이 다르다면 저장된 값의
		 * 다음 위치에 새로운 값을 저장한다. 
		 * 
		 */
		
		
		
		Set<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("공유",40,100));
		hs2.add(new Student("공유",40,100)); // 이건 중복일까? -> 중복으로 보지 않는다
		// 주소값이 다르기 때문에
		// 같게 보게 하려면 Student에서 메서드를 고쳐야 한다.
		hs2.add(new Student("홍길동",24,60));
		hs2.add(new Student("김갑생",26,49));
		
		System.out.println(hs2);
		System.out.println(hs2.size());
		Student s1 = new Student("아이", 1 , 1);
		Student s2 = new Student("아이", 1 , 1);
		
		System.out.println(s1.equals(s2)); // true 가 나옴 
		                                   // 논리적으로 같음을 판단
		
		
		System.out.println("============================");
		// Set 계열 클래스 반복처리 (참고로 인덱스 개념은 없음)
		
		// 1. for문 활용하여 반복처리
		// 	- 기본 basic Loop문은 사용 불가, 향상된 for 문은 가능
		
		for(Student s : hs2/*배열, 컬렉션*/) {
			System.out.println(s);
		}
		
		// 2. Iterator를 통한 반복
		// - List계열과 Set 계열에서는 Iterator를 직접 구현하였기 때문에
		//  곧바로 사용이 가능하나, Map 계열에서는 '곧바로' 호출 불가능
		Iterator<Student> iter = hs2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//List <--> Set 
		//List의 중복값을 제거하기 위해서 
		
		// 1. LIst/Set에 Set/List계열 데이터를 추가하는 방법
		//매개변수 생성자
		List<Student> list = new ArrayList<>(hs2);
		
		
		// 2. List에 Set계열 데이터를 추가하는 방법
		// addAll()
		List<Student> list2 = new ArrayList<>();
		list2.addAll(hs2);
		
		
		//LinkedHashSet
		// - 저장 순서 유지
		Set<Integer> set1 = new LinkedHashSet();
		set1.add(123);
		set1.add(131);
		set1.add(115);
		set1.add(168);
		set1.add(265);
		
		System.out.println(set1);
		
		//TreeSet
		// - 데이터를 정렬(기본 오름차순)시켜서 보관
		
		Comparator<Integer> comp = Collections.reverseOrder();
		
		Set<Integer> set2 = new TreeSet<>(comp); //정수 내림차순 정렬 조건을 가진 객체
		set2.addAll(set1);
		System.out.println(set2);
		
		
		
		
		
	}

}
