package com.dilara;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Soru2 {
    /*
    String bir kuyruk olusturacağız ve yazacağımız metot ile 10 tane müsteri ekleyeceğiz, daha sonra
    random 1 - 12 adet arasında pide üreteceğiz. Oluşmuş kuyruğa pideleri dağıtacağız, pide
    bittiğinde pide kalmadı çıktısını vereceğiz. Eğer pide bitmemiş ise ve pide almayan varsa
    pide almayanları da ayrıca yazdıracağız.
     */
    public static void main(String[] args) {
        Queue<String> musteriKuyrugu = new LinkedList<>();

        musteriEkle(musteriKuyrugu, 10);

        Random random = new Random();
        int pideSayisi = random.nextInt(1,12);
        System.out.println("Üretilen toplam pide: " + pideSayisi);

        pideDagit(musteriKuyrugu, pideSayisi);
        if (pideSayisi == 0) {
            System.out.println("Pide kalmamıştır!");
        } else {
            System.out.println("Pide bitmiştir.");
            System.out.println("- - - - - - - - -");
            System.out.println("Alamayan müşteri sayısı: "+(musteriKuyrugu.size()));
            for (String customer : musteriKuyrugu) {
                System.out.println(customer);
            }
        }


    }

    public static void musteriEkle (Queue<String> kuyruk, int sayi) {
        for (int i = 1; i <= sayi; i++) {
            kuyruk.add("Müşteri " + i);
        }
    }
    public static void pideDagit (Queue<String> kuyruk, int pideSayisi) {
        while (!kuyruk.isEmpty() && pideSayisi > 0) {
            String customer = kuyruk.poll();
            System.out.println(customer + " pide almıştır.");
            pideSayisi--;
        }
    }


}
