import java.util.Scanner;
public class Training2_5{
  public static void main(String[] args){
    System.out.print("整数値を入力してください: ");
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());

    if( num >= 0 ){
      while( num >= 0 ){
        System.out.println( num );
        num = num - 1;
      }
    }else{
      System.out.println("負の値が入力されたため、カウントダウンを中止します。");
    }
  }
}