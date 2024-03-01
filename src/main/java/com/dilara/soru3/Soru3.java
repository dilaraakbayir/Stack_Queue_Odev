package com.dilara.soru3;

import java.util.PriorityQueue;

public class Soru3 {
    /*
    Müşterilerimizin ismi olsun, sıra no olsun ve banka müşterisi mi değil mi onu
    tuttuğumuz bir değişken olsun. Daha sonra bankada bir müsteri kuyruğu olusturalım
    ve banka müşterisi olanlara öncelik verelim.
     */
    public static void main(String[] args) {
        PriorityQueue<Musteri> oncelikliKuyruk = new PriorityQueue<>((m1, m2) -> {
            if (m1.isBankaMusterisiMi() && !m2.isBankaMusterisiMi()) {
                return -1; // bu durumda m1 öncelikli olmalı
            } else if (!m1.isBankaMusterisiMi() && m2.isBankaMusterisiMi()) {
                return 1; // bu durumda m2 öncelikli olmalı
            } else {
                return Integer.compare(m1.getSiraNo(), m2.getSiraNo()); // Harici durumda sıra numarasına göre öncelik
            }
        });

        while (!oncelikliKuyruk.isEmpty()) {
            Musteri siradakiMusteri = oncelikliKuyruk.poll();
            System.out.println("Ad Soyad: " + siradakiMusteri.getMusteriAd()+" "+siradakiMusteri.getMusteriSoyad() +
                    ", Sıra Numarası: " + siradakiMusteri.getSiraNo() +
                    ", Banka Müşterisi: " + siradakiMusteri.isBankaMusterisiMi());
        }


        oncelikliKuyruk.add(new Musteri("Berfu", "Yolcu",true));
        oncelikliKuyruk.add(new Musteri("Can", "Kaya",true));
        oncelikliKuyruk.add(new Musteri("Deniz", "Barlas",false));
        oncelikliKuyruk.add(new Musteri("Ece", "Derin",false));
        oncelikliKuyruk.add(new Musteri("Aslı", "Korhun",false));
        oncelikliKuyruk.add(new Musteri("Samet", "Yıkılmaz",true));
        oncelikliKuyruk.add(new Musteri("Beril", "Paslı",false));
        oncelikliKuyruk.add(new Musteri("Tan", "Toprak",true));
        oncelikliKuyruk.add(new Musteri("Alara", "Tastan",false));

        oncelikliKuyruk.forEach(System.out::println);
    }


}
