import java.util.Scanner;
public class Training1_11{
  public static void main(String[] args){
    System.out.print("点数を入力してください:");
    Scanner scanner = new Scanner(System.in);
    String point = scanner.nextLine( );
    System.out.println("入力された点数は" + (point) + "です。");
  }
}