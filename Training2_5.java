import java.util.Scanner;
public class Training2_5{
  public static void main(String[] args){
    System.out.print("�����l����͂��Ă�������: ");
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());

    if( num >= 0 ){
      while( num >= 0 ){
        System.out.println( num );
        num = num - 1;
      }
    }else{
      System.out.println("���̒l�����͂��ꂽ���߁A�J�E���g�_�E���𒆎~���܂��B");
    }
  }
}