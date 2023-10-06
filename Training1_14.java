import java.util.Scanner;
public class Training1_14{
  public static void main(String[] args){
    System.out.print("x‚Ì’l:");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    System.out.print("y‚Ì’l:");
    int y = scanner.nextInt();
    int add = x + y;
    int subt = x - y;
    int multi = x * y;
    int divi = x / y;
    int rem = x % y;
    System.out.println("x + y =" + add);
    System.out.println("x - y =" + subt);
    System.out.println("x * y =" + multi);
    System.out.println("x / y =" + divi);
    System.out.println("x ‚ðy‚ÅŠ„‚Á‚½—]‚è‚Í"+rem);
  }
}