public class Training3_5{
  public static void main(String[] args){
    int[] a = {10, 20, 30, 40, 50, 60};
    int sum = 0;

    for( int i : a ){
     sum = sum + i;
    }
    System.out.println( sum );
  }
}