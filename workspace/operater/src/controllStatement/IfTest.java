package controllStatement;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//      �� ���� ��Һ�
      int firstNumber = 0, lastNumber = 0;
      String message = "���� �� ���� �Է��ϼ���", result = null, msg = "ū ����:" ;
      Scanner sc = new Scanner(System.in);
      System.out.println(message);
      firstNumber = sc.nextInt();
      lastNumber = sc.nextInt();
      
      if(firstNumber > lastNumber) {
         result = msg + firstNumber;
      }else if(firstNumber != lastNumber) {
         result = msg + lastNumber;
      }else {
         result = "�� ���� �����ϴ�.";
      }
      System.out.println(result);
   }
}
















