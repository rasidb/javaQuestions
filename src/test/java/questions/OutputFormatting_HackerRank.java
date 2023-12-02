package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting_HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isim;
        int puan ;
        String formatlıPuan;
        String resultString;
        List<String> resultList=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            isim = scanner.next();
            puan = scanner.nextInt();
            if (10 <= puan && puan < 100) {
                formatlıPuan = "0" + puan;
            } else if (puan < 10) {
                formatlıPuan = "00" + puan;
            } else {
                formatlıPuan = String.valueOf(puan);
            }
            while (isim.length() < 15) {
                isim = isim + " ";
            }
            resultString = isim + formatlıPuan;
            resultList.add(resultString);
        }
        scanner.close();
        for (String each : resultList) {
            System.out.println(each);
        }
    }
}
