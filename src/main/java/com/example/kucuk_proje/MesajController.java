package com.example.kucuk_proje;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesajController {

    // 1. Klasik Sabit Mesajımız (Adres: http://localhost:8080/merhaba)
    @GetMapping("/merhaba")
    public String karsilamaMesaji() {
        return "Merhaba Yazılım Öğretmenim, projemiz başarıyla çalışıyor!";
    }

    // 2. Yeni Akıllı Mesajımız (Adres: http://localhost:8080/selam?isim=Furkan)
    @GetMapping("/selam")
    public String ozelKarsilama(@RequestParam(value = "isim", defaultValue = "Misafir") String gelenIsim) {
        return "Selam " + gelenIsim + "! Spring Boot kampımıza hoş geldin.";
    }
}