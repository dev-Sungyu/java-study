package collectionTest;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<>();
		final int SIZE = 9;
		
//		C
		for (int i = 0; i < SIZE; i++) {
			if(i > 4) {
				datas.add((14 - i) * 10);
				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
			System.out.println(datas.size());
		}
//		추가(삽입)
//		50 뒤에 500 삽입
		
		
//		수정
//		90을 9로 수정
		
//		삭제
//		80 삭제
		
		
		
		
	}
}
