import java.util.Scanner;
public class Training1_16{
  public static void main(String[] args){
    System.out.println("���̕\�ʐς�̐ς����߂܂��B");

    System.out.print("���a");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
    System.out.println(radius);

    System.out.println("�\�ʐς�" + (4 * 3.1416 * radius * radius ) + "�ł��B");
    System.out.println("�̐ς�" + (4 * 3.1416 * radius * radius * radius / 3) + "�ł��B");
  }
}