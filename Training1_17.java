public class Training1_17{
  public static void main(String[] args){
    System.out.println("�{�i�ō���\\1,200�j���P���~�D���o���čw���B");
    System.out.println("�|�C���g�J�[�h������5������B");
    System.out.println("���ނ��8860�~�ł��B");
    System.out.println("�����̓���");

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

    System.out.println("5000�~�D : " + dill5000 + "��");
    System.out.println("1000�~�D : " + dill1000 + "��");
    System.out.println("500�~�� : " + yen500 + "��");
    System.out.println("100�~�� : " + yen100 + "��");
    System.out.println("50�~�� : " + yen50 + "��");
    System.out.println("10�~�� : " + yen10 + "��");
    System.out.println("5�~�� : " + yen5 + "��");
    System.out.println("1�~�� : " + yen1 + "��");
  }
}