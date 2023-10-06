import java.util.Scanner;

public class Training3_8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] d = new int[6];
    for(int i = 0; i < d.length; i++){
      System.out.print(">>");
      d[i] = sc.nextInt();
    }

    System.out.println("Šï”");
    for(int i = 0; i < d.length; i++){
      if(d[i] % 2 != 0){
        System.out.print(d[i] + ",");
      }
    }

    System.out.println();
    System.out.println("‹ô”");
    for(int i = 0; i < d.length; i++){
      if(d[i] % 2 == 0){
        System.out.print(d[i] + ",");
      }
    }
  }
}