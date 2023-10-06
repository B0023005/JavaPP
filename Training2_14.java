import java.util.Scanner;
public class Training2_14{
  public static void main(String[] args){

    System.out.print("âΩ cm Ç©ÇÁ : ");
    Scanner scanner = new Scanner(System.in);
    int heightStart = Integer.parseInt(scanner.nextLine());

    System.out.print("âΩ cm Ç‹Ç≈ : ");
    int heightLast = Integer.parseInt(scanner.nextLine());

    System.out.print("âΩ cm Ç≤Ç∆ : ");
    int heightSection = Integer.parseInt(scanner.nextLine());

    System.out.println("êgí∑  ïWèÄëÃèd");
    System.out.println("Å£Å§Å£Å§Å£Å§Å£Å§Å£Å§");

    while( heightStart <= heightLast ){
      System.out.println( heightStart + " " + (( heightStart - 100) *0.9) );
      heightStart = heightStart + heightSection;
    }
  }
}