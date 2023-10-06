import java.util.Scanner;
public class Training1_13{
  public static void main(String[] args){
    System.out.print("整数値:");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("最下位桁を除いた値は" + (num / 10) +"です。");
    System.out.println("最下位桁は" + (num - 123 * 10) + "です。");
  }
}