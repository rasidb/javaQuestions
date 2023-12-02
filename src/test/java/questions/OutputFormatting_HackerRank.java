package questions;

import java.util.Scanner;

public class OutputFormatting_HackerRank {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String isim = scanner.next();
            int puan =scanner.nextInt();
            int puanGerekenBosluk;
            String resultPuan = null;
            if (puan<10){
                resultPuan="00"+puan;
            }
            if (puan>9&&puan<100){
              resultPuan="0"+puan;
            }
            if (puan>100){
                resultPuan=puan+"";
            }
            int atılacakBosluk=15-(isim.length());
            String space=" ";
            String result="";
            for (int j = 0; j < atılacakBosluk; j++) {
            result=isim+" ";
            }
            result=result+resultPuan;
            System.out.println(result);
        }
    }
}
