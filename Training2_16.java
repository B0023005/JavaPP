public class Training2_16{
  public static void main(String[] args){
    int x = 1;
    int y = 1;

    while( x <= 9 ){
      while( y <= 9 ){
        System.out.printf( "%3d", x * y );
        y++;
      }
      x++;
      y = 1;
      System.out.println(" ");
    }
  }
}