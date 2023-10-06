import java.util.Scanner;

public class Training3_7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] c = new int[10];
    for(int i = 0; i < 10; i++){
      c[i] = sc.nextInt();
    }
    for(int j = 9; j >= 0; j--){
      System.out.println(c[j] * 2);
    }
  }
}