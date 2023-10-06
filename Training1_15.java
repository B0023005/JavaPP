import java.util.Scanner;
public class Training1_15{
  public static void main(String[] args){
    System.out.println("OŠpŒ`‚Ì–ÊÏ‚ğ‹‚ß‚Ü‚·B");

    System.out.print("’ê•Ó : ");
    Scanner scanner = new Scanner(System.in);
    double bottom = scanner.nextDouble();

    System.out.print("‚‚³ : ");
    Double height = scanner.nextDouble();

    System.out.println("");
    System.out.println("–ÊÏ‚Í" + (bottom * height / 2));
  }
}