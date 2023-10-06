public class Training3_3{
  public static void main(String[] args){
    double[] a = new double[200];
    for( int i = 0; i < 200; i++ ){
      a[i] = i / 200.0;
      System.out.println("a[" + i + "]" + "=" + a[i]);
    }
  }
}