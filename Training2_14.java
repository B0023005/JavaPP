import java.util.Scanner;
public class Training2_14{
  public static void main(String[] args){

    System.out.print("�� cm ���� : ");
    Scanner scanner = new Scanner(System.in);
    int heightStart = Integer.parseInt(scanner.nextLine());

    System.out.print("�� cm �܂� : ");
    int heightLast = Integer.parseInt(scanner.nextLine());

    System.out.print("�� cm ���� : ");
    int heightSection = Integer.parseInt(scanner.nextLine());

    System.out.println("�g��  �W���̏d");
    System.out.println("��������������������");

    while( heightStart <= heightLast ){
      System.out.println( heightStart + " " + (( heightStart - 100) *0.9) );
      heightStart = heightStart + heightSection;
    }
  }
}