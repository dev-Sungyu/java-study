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
//		�߰�(����)
//		50 �ڿ� 500 ����
		
		
//		����
//		90�� 9�� ����
		
//		����
//		80 ����
		
		
		
		
	}
}
