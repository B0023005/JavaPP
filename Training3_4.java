public class Training3_4{
  public static void main(String[] args){
    int[] a = new int[10];

    for( int i = 0; i < 10; i++ ){
      a[i] = i + 1;
      if( a[i] % 2 == 0 ){
        System.out.println( ( i + 1 ) + "�Ԗڂ̒l��" + "�h�����@�h" + "�ł��B" );
      }else{
        System.out.println( ( i + 1 ) + "�Ԗڂ̒l��" + "�h � �h" + "�ł��B" );
      }
    }
  }
}