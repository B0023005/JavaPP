import java.util.Scanner;
public class Training2_6{
public static void main(String[] args){
	System.out.print("いくつ*を表示しますか？：");
	Scanner scanner = new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
	while( num > 0 ){
	System.out.print("＊");
	num = num - 1;
   }
  }
}
