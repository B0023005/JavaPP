import java.util.Scanner;
public class Training2_17{
  public static void main(String[] args){
    System.out.println("正方形を表示します。");
    System.out.print("段数は :");
    Scanner scanner = new Scanner(System.in);

    int ns = Integer.parseInt(scanner.nextLine());
    int nsLine1 = 0;
    int nsLine2 = 0;

    for( nsLine1 = ns; nsLine1 > 0; nsLine1-- ){
      for( nsLine2 = ns; nsLine2 > 0; nsLine2-- ){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}