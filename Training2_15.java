import java.util.Scanner;

public class Training2_15{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = new String[10];
    String maxStr = "0";
    System.out.println("���͂��ꂽ10�s����1�Ԓ����������\�����܂��B");
    for(int i = 0; i < 10; i++){
      System.out.print("���������͂��Ă������� (" + (i + 1) + "): ");
      String x = sc.nextLine();
      str[i] = x;
      if(str[i].length() > maxStr.length()){
        maxStr = str[i];
      }
    }
    System.out.println("��Ԓ��������� : " + maxStr);
    System.out.println("������" + maxStr.length() + "����");
  }
}