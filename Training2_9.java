import java.util.Scanner;
public class Training2_9{
  public static void main(String[] args){
    System.out.print("n>> ");
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int x = 1;
    int y = n;

 

    while( n > 0 ){
      x = x * n ;
      n = n - 1;
    }
    System.out.println( y + "!=" + x );
  }
}