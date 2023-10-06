import java.util.Scanner;
public class Training2_10{
  public static void main(String[] args){
    System.out.print("n>> ");
    Scanner scanner = new Scanner(System.in);
    int cnt = Integer.parseInt(scanner.nextLine());
    int b = 0;

    while( cnt > 0 ){
      System.out.print(">> ");
      int num = Integer.parseInt(scanner.nextLine());

      if( num > b ){
        b = num;
      }
      cnt--;
    }
    System.out.println( "Å‘å’l=" + b );
  }
}