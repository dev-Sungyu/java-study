package controllStatement;

import java.util.Scanner;

public class SwitchTest {
   public static void main(String[] args) {
//      사용자에게 아래의 메뉴를 출력하고
//      번호를 입력받는다.
      
//      1. 빨간색
//      2. 검은색
//      3. 노란색
//      4. 흰색

//      사용자가 입력한 번호의 색상을 영어로 출력한다.
      
      String title = "색상을 골라주세요!";
      String menu = "1.빨간색\n2.검은색\n3.노란색\n4.흰색";
      String result = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(title);
      System.out.println(menu);
      choice = sc.nextInt();
      
      switch(choice) {
      case 1:
    	  result = "Red";
    	  	break;
      case 2:
    	  result = "Black";
        	break;
      case 3:
    	  result = "Yellow";
        	break;
      case 4:
    	  result = "White";
        	break;
      default:
    	  result = "다시 입력해주세요.";
      }
      System.out.println(result);
   }
}













