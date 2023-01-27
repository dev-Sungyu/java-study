package methodTest;

public class Test {
//  1~10까지 println()으로 출력하는 메소드
	void print() {
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = i + 1;
			System.out.println(result);
		}
	}
	
	
//  "홍길동"을 n번 println()으로 출력하는 메소드
	
//  이름을 n번 println()으로 출력하는 메소드
	
//  세 정수의 뺄셈을 해주는 메소드
	
//  두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	
//  1~n까지의 합을 구해주는 메소드
	
//  홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	
//  문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	
//  문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	
//  5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	
//  한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	
	public static void main(String[] args) {
		Test oneToTen = new Test();
		oneToTen.print();
	}
}
