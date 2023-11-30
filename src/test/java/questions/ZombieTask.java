package questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ZombieTask {
    /*
    yan yana 8 tane şehir olsun ve bu şehirlerin nüfusları random olarak belirlensin(min 1.000 max 10.000)
    bir gün bu şehirlerin bi tanesinde zombi saldırısı olmuş ve nüfusu 0'a iner
    eğer ki bir şehrin nüfusu 0'sa ertesi gün o şehrin sağında ve solunda bulunan şehirlerin nüfusları yarı yarıya azalır
    buna göre kaç gün içinde zombiler tüm şehirlerin nüfuslarını 0'a düşürmüş olur
     */
    public static void main(String[] args) {
        //şehirlerin nüfuslarını belirleyen Random sınıfı objesi
        Random rastgeleNüfus = new Random();

        //şehirlerin bulunduğu int Array'i
        int[] sehirler = new int[8];

        // sehirler array'i icine nüfusları yerleştir
        for (int i = 0; i < sehirler.length; i++) {
            sehirler[i] = rastgeleNüfus.nextInt(9001) + 1000;
        }
        System.out.println(Arrays.toString(sehirler)); // zombi saldırısından önce şehirlerin nüfusu
        int zombilerinSaldırdığıSehir = rastgeleNüfus.nextInt(8); // zombilerin rastgele saldıracağı şehrin index numarası
        sehirler[zombilerinSaldırdığıSehir]=0; //şehrin nüfusu 0 a düşürüldü

        //flag<8 döngüsü açıyoruz, eğer ki tüm şehirlerin nüfusu sıfıra düşerse döngü kırılacak
        int flag = 0; //flag her döngüde sıfırlanıp sehirler array'inde bulunan şehirlerin nüfuslarının 0 a düşüp düşmediğini sayacak eğer ki flag=8 olursa döngü kırılır
       int günSayacı=0; // zombi saldırısının kaç gün süreceğini say
        do {
            for (int i = 0; i < sehirler.length; i++) {

                //sehirler[i] eğer ki 0 a eşitse aşağıdaki işlemleri yap
                if (sehirler[i] == 0) {
                    //ilk şehrin nüfusu sıfır olduysa solunda şehir olmayacağından sadece sağındaki şehrin nüfusunu yarı yarıya azalt
                    if (i == 0) {
                        sehirler[i + 1] = sehirler[i + 1] / 2;
                    }
                    //son şehrin nüfusu sıfır olduysa sağında şehir olmayacağından sadece solundaki şehrin nüfusunu yarı yarıya azalt
                    if (i == 7) {
                        sehirler[i - 1] = sehirler[i - 1] / 2;
                    }
                    //eğer ki nüfusu 0 olan şehir değilse solundaki ve sağındaki şehrin nüfuslarını yarı yarıya azalt
                    if (i < 7 && i > 0) {
                        sehirler[i + 1] = sehirler[i + 1] / 2;
                        sehirler[i - 1] = sehirler[i - 1] / 2;
                    }
                }
                //şuanki kontrol edilen şehrin nüfusu 0 ise flag 1 artsın
                if (sehirler[i] == 0) {
                    flag++;
                }


            }
            if (flag != 8) {
                flag = 0; // tüm şehirlerin müfusu 0 olana kadar işlem devam edeceği için flag sıfırlandı
            }
            System.out.println(Arrays.toString(sehirler)); //şehirlerin o gece ki nüfusları
            günSayacı++;
        } while (flag < 8);
        System.out.println("zombi saldırısı toplam "+günSayacı+" gün sürdü");
    }
}
