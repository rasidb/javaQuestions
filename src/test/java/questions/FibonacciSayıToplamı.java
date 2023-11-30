package questions;


public class FibonacciSayıToplamı {
    /*
    4 milyonu geçmeyen Fibonacci serisindeki sayıları yazdır.
     */
    public static void main(String[] args) {
        long sınır = 4000000;
        int[] sayılar = new int[3];
        sayılar[0] = 1;
        sayılar[1] = 1;
        sayılar[2] = 2;
        int sayac = 0;
        do {
            if (sayac<3){
                switch (sayac){
                    case 0:
                        System.out.println(0);
                        System.out.println(0);
                        break;
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                }
            }else {
                sayılar[0]=sayılar[1];
                sayılar[1]=sayılar[2];
                sayılar[2]=sayılar[1]+sayılar[0];
                System.out.println(sayılar[2]);
            }
            sayac++;
        } while (sayılar[2] < sınır);
    }
}
