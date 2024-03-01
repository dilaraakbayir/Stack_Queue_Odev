package com.dilara.soru3;

import java.util.UUID;

public class Musteri {
    private String id;
    private String musteriAd;
    private String musteriSoyad;
    private boolean bankaMusterisiMi;
    private static int siraNo = 1;

    public Musteri(String musteriAd, String musteriSoyad, boolean bankaMusterisiMi) {
        this.id = UUID.randomUUID().toString();
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.siraNo = siraNo++;
        this.bankaMusterisiMi = bankaMusterisiMi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Musteri{");
        sb.append("musteriAd='").append(musteriAd).append('\'');
        sb.append(", musteriSoyad='").append(musteriSoyad).append('\'');
        sb.append(", bankaMusterisiMi=").append(bankaMusterisiMi);
        sb.append('}');
        return sb.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public boolean isBankaMusterisiMi() {
        return bankaMusterisiMi;
    }

    public void setBankaMusterisiMi(boolean bankaMusterisiMi) {
        this.bankaMusterisiMi = bankaMusterisiMi;
    }

    public static int getSiraNo() {
        return siraNo;
    }

    public static void setSiraNo(int siraNo) {
        Musteri.siraNo = siraNo;
    }
}
