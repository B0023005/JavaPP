import java.util.Scanner;
public class Training2_12{
  public static void main(String[] args){
    System.out.println("1����n�܂ł̘a�����߂܂��B");
    System.out.print("n�̒l :");
    Scanner scanner = new Scanner(System.in);
    int num1 = Integer.parseInt(scanner.nextLine());
    int num2 = 1;
    int loop = 1;

    if( num1 == 1 ){
      System.out.println( num1 );
    }else{
      while( num1 > 1 ){
        num2 = num2 + num1;
        System.out.print( loop + "+");
        num1--;
        loop++;
      }
    System.out.print( loop );
    System.out.println( "=" + num2 );
    }
  }
}