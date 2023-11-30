package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Saat {
    public static void main(String[] args) {
        /*
        kullanıcı 4 tane rakam girsin, aynı rakamdan birden fazla girilebilir
        kullanıcıdan alınan rakamlara göre 24 saatlik zaman dilimine göre birbirinden
        farklı kaç tane saat girilebilir
         */
        Scanner scanner = new Scanner(System.in);
        int[] rakamlar = new int[4];
        for (int i = 0; i < 4; i++) {
            String saatText = scanner.next();
            int saat;
            try {
                saat = Integer.parseInt(saatText);
                if (saat < 10 && saat > 0) {
                    rakamlar[i] = saat;
                } else {
                    System.out.println("1 ile 10 arasında bir rakam girin");
                    i--;
                }
            } catch (NumberFormatException e) {
                System.out.println("geçerli bir rakam girin");
                i--;
            }
        }

        HashSet<String> result =new HashSet<>();
        for (int i = 0; i < rakamlar.length; i++) {
            for (int j = 0; j < rakamlar.length; j++) {
                for (int k = 0; k < rakamlar.length; k++) {
                    for (int l = 0; l < rakamlar.length; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l
                    /*
                        && rakamlar[i]!=rakamlar[j]&&rakamlar[i]!=rakamlar[k]&&rakamlar[i]!=rakamlar[l]
                        && rakamlar[j]!= rakamlar[k]&&rakamlar[j]!= rakamlar[l]
                        && rakamlar[k]!= rakamlar[l]
                     */
                                ){
                            int saat = rakamlar[i] * 10 + rakamlar[j];
                            int dakika = rakamlar[k] * 10 + rakamlar[l];
                            if (saat<24 && dakika< 60){
                                result.add(saat+":"+dakika);
                            }
                        }
                    }
                }
            }
        }
        for (String each : result) {
            System.out.print(each+", ");
        }
        System.out.println(rakamlar[0]+", "+rakamlar[1]+", "+rakamlar[2]+", "+rakamlar[3]+
                " rakamları kullanılarak birbirinden farklı "+result.size()+" tane saat yazılabilir");
    }
}
