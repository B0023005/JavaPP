import java.util.Scanner;

public class Training2_15{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = new String[10];
    String maxStr = "0";
    System.out.println("入力された10行から1番長い文字列を表示します。");
    for(int i = 0; i < 10; i++){
      System.out.print("文字列を入力してください (" + (i + 1) + "): ");
      String x = sc.nextLine();
      str[i] = x;
      if(str[i].length() > maxStr.length()){
        maxStr = str[i];
      }
    }
    System.out.println("一番長い文字列 : " + maxStr);
    System.out.println("文字数" + maxStr.length() + "文字");
  }
}