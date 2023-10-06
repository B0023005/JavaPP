import java.util.Scanner;

public class Training2_13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("®”’l : ");
    int x = sc.nextInt();
    int cnt = 0;
    for(int i = 1; i <= x; i++){
      if(x % i == 0){
        System.out.print(i + " ");
        cnt++;
      }
    }
    System.out.println();
    System.out.println("–ñ”‚Í" + cnt + "ŒÂ‚Å‚·B");
  }
}