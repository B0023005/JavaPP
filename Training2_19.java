public class Training2_19{
  public static void main(String[] args){

    int x = 1;
    int y = 1;

    while( x <= 9 ){
      while( y <= 9 ){
        if( x <= y ){
          System.out.printf( "%4d", x * y );
          y++;
        }else{
          System.out.printf( "%4s", " ");
          y++;
        }
      }
      x++;
      y = 1;
      System.out.println(" ");
    }
  }
}