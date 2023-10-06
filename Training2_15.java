import java.util.Scanner;

public class Training2_15{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = new String[10];
    String maxStr = "0";
    System.out.println("“ü—Í‚³‚ê‚½10s‚©‚ç1”Ô’·‚¢•¶š—ñ‚ğ•\¦‚µ‚Ü‚·B");
    for(int i = 0; i < 10; i++){
      System.out.print("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ (" + (i + 1) + "): ");
      String x = sc.nextLine();
      str[i] = x;
      if(str[i].length() > maxStr.length()){
        maxStr = str[i];
      }
    }
    System.out.println("ˆê”Ô’·‚¢•¶š—ñ : " + maxStr);
    System.out.println("•¶š”" + maxStr.length() + "•¶š");
  }
}