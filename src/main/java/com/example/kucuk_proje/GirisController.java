package com.example.kucuk_proje;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GirisController {

    // Hafızada verileri tutacağımız geçici listemiz
    private final List<String> isimlerListesi = new ArrayList<>(List.of("Furkan", "Docker", "GitHub"));

    // 1. İstek (GET): Mevcut listeyi döner -> localhost:8080/api/isimler
    @GetMapping("/isimler")
    public List<String> listele() {
        return isimlerListesi;
    }

    // 2. İstek (POST): Listeye yeni isim ekler -> localhost:8080/api/ekle?yeniIsim=Ahmet
    @PostMapping("/ekle")
    public String ekle(@RequestParam String yeniIsim) {
        isimlerListesi.add(yeniIsim);
        return yeniIsim + " başarıyla listeye eklendi!";
    }
}