import java.util.Scanner;
public class Training3_9{
  public static void main(String[] args){
    System.out.print("要素数 : ");
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    int i;
    int j;

    int[] a = new int[num];
    int[] b = new int[num];

    for( i = 0; i < a.length; i++ ){
      System.out.print("a[" + i + "]" + "= ");
      num = Integer.parseInt(scanner.nextLine());
      a[i] = num;
    }
    System.out.println("aの全要素を逆順にコピーしました。");

    for( j = 0; j < b.length; j++ ){
      i--;
      System.out.println("b[" + j + "]" + "= " + a[i] );
    }
  }
}