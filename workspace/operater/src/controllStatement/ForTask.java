package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//�����
		
		//1~100���� ���
//		for(int i=0; i<100; i=i+1) {
//			System.out.println(i + 1);
//		}
		//100~1���� ���
//		for(int i=0; i<100; i=i+1) {
//			System.out.println(100 - i);
//		}
		//1~100���� �� ¦���� ���
//		for(int i=0; i<51; i=i+1) {
//			System.out.println(i * 2); or ((i + 1) * 2)
//		}
		
		//�ǹ�
//		1~10���� �� ���
//		int sum = 0;
//		for(int i=0; i<10; i=i+1) {
//			sum += i + 1; or sum = sum + i + 1;
//		}
//		System.out.println(sum);
		
//		1~n���� �� ���
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		int n = 0;
//		n = sc.nextInt();
//		for(int i=0; i<n; i=i+1) {
//			result += i + 1;
//		}
//		System.out.println(result);
		
		//���
		
//		A~F���� ���
//		for(int i=0; i<6; i=i+1) {
//			System.out.println((char)i + 65);
//		}
		
//		A~F���� �� C�����ϰ� ���
//		for(int i=0; i<5; i=i+1) {
//			System.out.println((char)(i > 1 ? i + 66 : i + 65));
//		}
		
		
//      ���̾�
//      0 1 2 3 0 1 2 3 0 1 2 3 ���
//      for (int i = 0; i < 12; i++) {
//         System.out.print(i % 4 + " ");
//      }
      
//      aBcDeFgH...Z ���
      for (int i = 0; i < 26; i++) {
         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));

		}
		
	}
}
