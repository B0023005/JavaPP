import java.util.Scanner;
public class Training1_13{
  public static void main(String[] args){
    System.out.print("�����l:");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("�ŉ��ʌ����������l��" + (num / 10) +"�ł��B");
    System.out.println("�ŉ��ʌ���" + (num - 123 * 10) + "�ł��B");
  }
}