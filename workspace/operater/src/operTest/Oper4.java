package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
	   Scanner sc = new Scanner(System.in);
	   String msg = "Q. ����� �����ϴ� ���� �����ϼ���.\r\n"
	   		+ "        1. ������\r\n"
	   		+ "        2. �����\r\n"
	   		+ "        3. ������\r\n"
	   		+ "        4. ���";
	   System.out.println(msg);
	   int choice = sc.nextInt();
	   String result = null;
			String red = "�Ұ��� �������̰� �������̴�.";
			String yellow = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
			String black = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
			String white = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
			result = choice == 1 ? red : choice == 2 ? yellow
					: choice == 3 ? black : choice == 4 ? white :
						"�߸� �Է��ϼ̽��ϴ�.";
						System.out.println(result);
						
						
						//������� �ϽŰ�
						
//						 String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
//					      String choiceMessage = "1.������\n2.�����\n3.������\n4.���";
//					      String redMessage = "�Ұ��� �������̰� �������̴�."; 
//					      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
//					      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
//					      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
//					      String errorMessage = "�ٽ� �Է����ּ���.";
//					      String result = null;
//					      Scanner sc = new Scanner(System.in);
//					      int choice = 0;
					      
//					      System.out.println(message + "\n" + choiceMessage);
//					      choice = sc.nextInt();
					      
//					      result = choice == 1 ? redMessage :
//					         choice == 2 ? yellowMessage :
//					            choice == 3 ? blackMessage :
//					               choice == 4 ? whiteMessage :
//					                  errorMessage;
//					      if(choice == 1) {
//					         result = redMessage;
//					         
//					      }else if(choice == 2) {
//					         result = yellowMessage;
//					         
//					      }else if(choice == 3) {
//					         result = blackMessage;
//					         
//					      }else if(choice == 4) {
//					         result = whiteMessage;
//					         
//					      }else {
//					         result = errorMessage;
//					         
//					      }
					      
//					      switch(choice) {
//					      case 1:
//					         result = redMessage;
//					         break;
//					      case 2:
//					         result = yellowMessage;
//					         break;
//					      case 3:
//					         result = blackMessage;
//					         break;
//					      case 4:
//					         result = whiteMessage;
//					         break;
//					      default:
//					         result = errorMessage;
//					         break;
//					      }
//					      
//					      System.out.println(result);

			
			
   }
}