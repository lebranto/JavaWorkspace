package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	List<Music> list = new ArrayList<>();

	public int addlist(Music music) {
		try {
			list.add(music);

			return 1;
		} catch (Exception e) {

			return 0;
		}
	}

	public int addAtZero(Music music) {
		try {
			list.add(0, music);

			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Music> printAll() {

		return list;
	}

	public Music searchMusic(String title) {

		Music result = null;

		// list.contains(title) 는
		// ["제목1","제목2"] 이럴때 사용 가능 한것
		// 이건 객체를 찾는 것이기에 올바르지 않음

		for (Music m : list) { // 제네릭이 없다면
			if (m.getTitle().equals(title)) {// object o : list
				m = result; // Music music = (Music) o; 다운 캐스팅을 해야함
				break;
			}

		}

//		for (int i = 0; i < list.size(); i++) {
//			if (result.getTitle() == title) {
//				result = list;
//			} else {
//				result = null;
//			}
//		}

		return result;
	}

	public Music removeMusic(String title) {

		Music result = null;
		
		
//		// 방법 1.
//		for (int i = 0; i < list.size(); i++) {
//			if (result.getTitle().equals(title)) {
//				list.remove(i);
//			}
//		}

		 //방법 2.
		Object o = searchMusic(title); // 삭제하려는 객체 찾기
		result = (Music) o; // 다운 캐스팅
		list.remove(o);

		return result;
	}

	public Music setMusic(String title, Music music) {

		try {
			Music result = null;
			int index = -1;
			for (int i = 0; i < list.size(); i++) {
				if (result.getTitle().equals(title)) {
					index = i;
					break;
				}
			}
			list.set(index, result);
			return result;
		} catch (Exception e) {
			return null;
		}


		// Music result = new Music();
//
////		for (int i = 0; i < list.size(); i++) {
////			if (result.getTitle().equals(title)) {
////				list.set(i, music);
////			} else {
////				result = null;
////			}
////		}

	}

	public int ascTitle() {

		Collections.sort(list,new AscTitle());

		return 1;

	}

	public int descSinger() {

//		Comparator<Music> comp2 = new AscTitle();
		Collections.sort(list/*, comp2*/); //내부 클래스에서 사용하기 때문에 생략 가능

		return 1;

	}

}
