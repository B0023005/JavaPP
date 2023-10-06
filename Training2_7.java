import java.util.Scanner;
public class Training2_7{
  public static void main(String[] args){
    System.out.print("‚¢‚­‚Â•\Ž¦‚µ‚Ü‚·‚©H: ");
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    int num2 = num;

    while( num / 2 > 0 ){
      System.out.print("*");
      System.out.print("+");
      num = num - 2;
    }

    if( num % 2 == 1 ){
      System.out.println("*");
    }else if(num2 == 0){
      System.out.print(" ");
    }else{
      System.out.println(" ");
    }

  }
}