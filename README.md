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
```

---

## ⚙️ Kurulum ve Çalıştırma

1️⃣ **Projeyi klonlayın:**
```bash
git clone https://github.com/bykaraga/Car-Rental-Project.git
```

2️⃣ **Klasöre girin:**
```bash
cd Car-Rental-Project
```

3️⃣ **Java dosyalarını derleyin:**
```bash
javac src/*.java
```

4️⃣ **Programı çalıştırın:**
```bash
java -cp src CarDriver
```

---

## 🧩 Sınıf Diyagramı

```text
        ┌────────────┐
        │   Car       │
        ├────────────┤
        │ brand       │
        │ model       │
        │ dailyPrice  │
        ├────────────┤
        │ printInfo() │
        └────────────┘
               ▲
               │
               │ has-a
               │
        ┌────────────┐
        │  Rental     │
        ├────────────┤
        │ car         │
        │ days        │
        ├────────────┤
        │ calculate() │
        │ printInfo() │
        └────────────┘
               ▲
               │
        ┌────────────┐
        │ CarDriver  │
        ├────────────┤
        │ main()     │
        └────────────┘
```

---

## 💡 Örnek Çıktı

```
Marka: BMW  
Model: 320i  
Günlük Ücret: 1500.0 TL  
Kiralama Süresi: 5 gün  
Toplam Ücret: 7500.0 TL  

Marka: Mercedes  
Model: C200  
Günlük Ücret: 1800.0 TL  
Kiralama Süresi: 3 gün  
Toplam Ücret: 5400.0 TL  

Marka: Toyota  
Model: Corolla  
Günlük Ücret: 900.0 TL  
Kiralama Süresi: 7 gün  
Toplam Ücret: 6300.0 TL
```

---

## 📘 Kullanılan Teknolojiler

| Teknoloji | Açıklama |
|------------|-----------|
| 🟠 **Java SE** | Ana programlama dili |
| 🧩 **OOP Prensipleri** | Encapsulation, Composition |
| 🧠 **Git & GitHub** | Versiyon kontrol sistemi |
| 🖥️ **Terminal** | Çalıştırma ortamı |

---

## 🤝 Katkıda Bulunma

Katkılar her zaman memnuniyetle karşılanır! 💪  

1. Bu repo’yu forkla  
2. Yeni bir branch oluştur (`feature/yeni-ozellik`)  
3. Değişikliklerini commit et  
4. Branch’ini push et  
5. Pull Request gönder 🎉  

---

## 📄 Lisans

Bu proje [MIT Lisansı](LICENSE) ile lisanslanmıştır.  
© 2025 [bykaraga](https://github.com/bykaraga)

---

<p align="center">
  Made with ❤️ by <b>bykaraga</b>
</p>
