import java.util.Scanner;
public class Training1_15{
  public static void main(String[] args){
    System.out.println("�O�p�`�̖ʐς����߂܂��B");

    System.out.print("��� : ");
    Scanner scanner = new Scanner(System.in);
    double bottom = scanner.nextDouble();

    System.out.print("���� : ");
    Double height = scanner.nextDouble();

    System.out.println("");
    System.out.println("�ʐς�" + (bottom * height / 2));
  }
}