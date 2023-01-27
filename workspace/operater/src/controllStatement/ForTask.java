package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//브론즈
		
		//1~100까지 출력
//		for(int i=0; i<100; i=i+1) {
//			System.out.println(i + 1);
//		}
		//100~1까지 출력
//		for(int i=0; i<100; i=i+1) {
//			System.out.println(100 - i);
//		}
		//1~100까지 중 짝수만 출력
//		for(int i=0; i<51; i=i+1) {
//			System.out.println(i * 2); or ((i + 1) * 2)
//		}
		
		//실버
//		1~10까지 합 출력
//		int sum = 0;
//		for(int i=0; i<10; i=i+1) {
//			sum += i + 1; or sum = sum + i + 1;
//		}
//		System.out.println(sum);
		
//		1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		int n = 0;
//		n = sc.nextInt();
//		for(int i=0; i<n; i=i+1) {
//			result += i + 1;
//		}
//		System.out.println(result);
		
		//골드
		
//		A~F까지 출력
//		for(int i=0; i<6; i=i+1) {
//			System.out.println((char)i + 65);
//		}
		
//		A~F까지 중 C제외하고 출력
//		for(int i=0; i<5; i=i+1) {
//			System.out.println((char)(i > 1 ? i + 66 : i + 65));
//		}
		
		
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
//      for (int i = 0; i < 12; i++) {
//         System.out.print(i % 4 + " ");
//      }
      
//      aBcDeFgH...Z 출력
      for (int i = 0; i < 26; i++) {
         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));

		}
		
	}
}
