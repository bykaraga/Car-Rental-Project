<h1 align="center">🚗 Car Rental Project</h1>

<p align="center">
  <b>Basit ama etkili bir <i>Java</i> tabanlı Araç Kiralama Sistemi.</b><br>
  Nesne yönelimli programlama (OOP) ilkelerini uygulamalı olarak öğrenmek için tasarlanmıştır.
</p>

---

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/bykaraga/Car-Rental-Project?color=blue)
![GitHub stars](https://img.shields.io/github/stars/bykaraga/Car-Rental-Project?color=yellow)
![GitHub forks](https://img.shields.io/github/forks/bykaraga/Car-Rental-Project?color=green)
![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Java](https://img.shields.io/badge/language-Java-orange?logo=java)

</div>

---

## 🧭 İçindekiler

- [🎯 Proje Amacı](#-proje-amacı)
- [🧱 Özellikler](#-özellikler)
- [📂 Proje Yapısı](#-proje-yapısı)
- [⚙️ Kurulum ve Çalıştırma](#️-kurulum-ve-çalıştırma)
- [🧩 Sınıf Diyagramı](#-sınıf-diyagramı)
- [💡 Örnek Çıktı](#-örnek-çıktı)
- [📘 Kullanılan Teknolojiler](#-kullanılan-teknolojiler)
- [🤝 Katkıda Bulunma](#-katkıda-bulunma)
- [📄 Lisans](#-lisans)

---

## 🎯 Proje Amacı

Bu proje, **Java** dilinde **nesne yönelimli programlama (OOP)** prensiplerini pratikte uygulamak amacıyla geliştirilmiştir.  
Amaç; araç nesneleri, kiralama işlemleri ve hesaplamalar arasında **ilişkilendirilmiş, temiz bir yapı** kurmaktır.

---

## 🧱 Özellikler

✅ Araç nesnelerini (marka, model, günlük ücret) oluşturur  
✅ Kiralama işlemlerini ve gün bazlı ücret hesaplamasını yapar  
✅ OOP prensiplerini uygular (Encapsulation, Composition)  
✅ Basit, koleksiyon kullanmadan yazılmış, temel yapıda bir uygulamadır  
✅ Türkçe konsol çıktısı üretir  

---

## 📂 Proje Yapısı

```bash
Car-Rental-Project/
│
├── src/
│   ├── Car.java          # Araç sınıfı (marka, model, ücret)
│   ├── Rental.java       # Kiralama sınıfı (Car nesnesi + gün sayısı)
│   └── CarDriver.java    # Programın giriş noktası (main metodu)
│
├── .gitignore
├── LICENSE
└── README.md
