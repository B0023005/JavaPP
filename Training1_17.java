public class Training1_17{
  public static void main(String[] args){
    System.out.println("–{iÅ‚İ\\1,200j‚ğ‚P–œ‰~D‚ğo‚µ‚Äw“üB");
    System.out.println("ƒ|ƒCƒ“ƒgƒJ[ƒhŠ„ˆø‚ª5“‚ ‚èB");
    System.out.println("‚¨’Ş‚è‚Í8860‰~‚Å‚·B");
    System.out.println("–‡”‚Ì“à–ó«");

    int change = 8860;
    int dill5000 = change / 5000;
    change = change - 5000 * dill5000;
    int dill1000 = change / 1000;
    change = change - 1000 * dill1000;

    int yen500 = change / 500;
    change = change - 500 * yen500;

    int yen100 = change / 100;
    change = change - 100 * yen100;

    int yen50 = change / 50;
    change = change - 50 * yen50;

    int yen10 = change / 10;
    change = change -10 * yen10;

    int yen5 = change / 5;
    change = change - 5 * yen5;

    int yen1 = change / 1;
    change = change - 1 * yen1;

    System.out.println("5000‰~D : " + dill5000 + "–‡");
    System.out.println("1000‰~D : " + dill1000 + "–‡");
    System.out.println("500‰~‹Ê : " + yen500 + "–‡");
    System.out.println("100‰~‹Ê : " + yen100 + "–‡");
    System.out.println("50‰~‹Ê : " + yen50 + "–‡");
    System.out.println("10‰~‹Ê : " + yen10 + "–‡");
    System.out.println("5‰~‹Ê : " + yen5 + "–‡");
    System.out.println("1‰~‹Ê : " + yen1 + "–‡");
  }
}