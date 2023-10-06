public class Training1_10{
  public static void main(String[] args){
    int cookie = 60;
    int firsttime = 3;
    int later = 2;
    double average = cookie / (firsttime + later);
    System.out.println("クッキーの枚数:" + (cookie));
    System.out.println("最初からいた友人の数:" + (firsttime));
    System.out.println("後から来た友人の数:" + (later));
    System.out.println("1人あたりのクッキーの枚数は:" + (average) + "です。");
  }
}