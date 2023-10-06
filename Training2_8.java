import java.util.Scanner;
public class Training2_8{
  public static void main(String[] args){
	System.out.println("³‚Ì®”’l‚ÌŒ…”‚ğ‹‚ß‚Ü‚·B");
	System.out.print("³‚Ì®”’l:");
	Scanner scanner = new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
	int X = 0;
	while( num > 0 ){
	 X = X + 1;
	num = num / 10;
	}
	System.out.println("‚»‚Ì”‚Í" + X + "Œ…‚Å‚·");
  }
}