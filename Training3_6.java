import java.util.Scanner;

public class Training3_6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] b = new int[4];
    for(int i = 0; i < 4; i++){
      b[i] = sc.nextInt();
    }
    for(int j = 3; j >= 0; j--){
      System.out.println(b[j]);
    }
  }
}