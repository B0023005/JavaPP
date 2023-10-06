import java.util.Scanner;
public class Training1_16{
  public static void main(String[] args){
    System.out.println("球の表面積を体積を求めます。");

    System.out.print("半径");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
    System.out.println(radius);

    System.out.println("表面積は" + (4 * 3.1416 * radius * radius ) + "です。");
    System.out.println("体積は" + (4 * 3.1416 * radius * radius * radius / 3) + "です。");
  }
}