import java.util.Scanner;
public class Training1_12{
  public static void main(String[] args){
    System.out.print("整数値");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("10を加えた値は" + ( num + 10 ) + "です。");
    System.out.println("10を引いた値は" + ( num - 10 ) + "です。");
  }
}