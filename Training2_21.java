import java.util.Scanner;
public class Training2_21{
  public static void main(String[] args){
    System.out.print("®”n : ");
    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());
    int vertical = 1;
    int beside = 1;

    while( vertical <= n ){
      while( beside <= n ){
        if( vertical <= beside ){
        System.out.printf( "%3s", "*" );
        beside++;
        }else{
        System.out.printf( "%3s", " " );
        beside++;
        }
      }
      System.out.println(" ");
      vertical++;
      beside = 1;
    }
  }
}