import java.util.Scanner;
public class Training2_8{
  public static void main(String[] args){
	System.out.println("正の整数値の桁数を求めます。");
	System.out.print("正の整数値:");
	Scanner scanner = new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
	int X = 0;
	while( num > 0 ){
	 X = X + 1;
	num = num / 10;
	}
	System.out.println("その数は" + X + "桁です");
  }
}