import java.util.Scanner;
public class Training1_12{
  public static void main(String[] args){
    System.out.print("�����l");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("10���������l��" + ( num + 10 ) + "�ł��B");
    System.out.println("10���������l��" + ( num - 10 ) + "�ł��B");
  }
}