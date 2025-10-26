# 🚗 Araç Kiralama Sistemi (Car Rental Project)

> **Not:** Bu README dosyasının yalnızca bu kısmı ChatGPT tarafından hazırlanmıştır.  
> Projenin kodları, yorumları ve ek dokümantasyonlarında yapay zekâ kullanılması **yasaktır**.  

---

## 🎯 Projenin Amacı

Bu projenin amacı, **Java diliyle nesne yönelimli programlama (OOP)** ilkelerini kullanarak  
temel bir **araç kiralama sisteminin işleyişini modellemek** ve öğrencinin aşağıdaki konularda uygulamalı deneyim kazanmasını sağlamaktır:

- Sınıf (Class) ve Nesne (Object) kavramlarını doğru kullanmak,  
- Constructor (Yapıcı Metot) tanımlamak ve nesne başlatmak,  
- Metotlar aracılığıyla hesaplama işlemleri yapmak,  
- Erişim belirleyicilerini (`public`, `private`) doğru şekilde uygulamak,  
- Kodun çıktısını ekrana düzgün bir formatta yazdırmak.  

---

## 🧾 Projenin Tamamlanma Koşulları

Proje, **tamamlanmış** sayılabilmesi için aşağıdaki koşulları eksiksiz karşılamalıdır:

1. ✅ **Car** adlı bir sınıf oluşturulmalı ve en az şu değişkenleri içermelidir:  
   - `brand` (String): aracın markası  
   - `model` (String): aracın modeli  
   - `dailyPrice` (double): günlük kiralama ücreti  

2. ✅ **Rental** adlı bir sınıf oluşturulmalı ve şu özellikleri içermelidir:  
   - `Car` türünde bir değişken (kiralanan araç bilgisi)  
   - `days` (int): kiralama süresi  
   - `calculateTotal()` metodu: toplam ücreti hesaplar (`dailyPrice * days`)  
   - `printInfo()` metodu: araç ve kiralama bilgilerini ekrana yazdırır  

3. ✅ **CarDriver (main sınıfı)** oluşturulmalı ve:  
   - En az **3 farklı araç** tanımlanmalı,  
   - Her biri için **Rental** nesnesi oluşturulmalı,  
   - Bilgiler ekrana açık ve okunabilir biçimde yazdırılmalıdır.  

4. ✅ Kodda **nesne yönelimli prensipler** (class, constructor, method) doğru kullanılmalıdır.  

5. ✅ Çıktılar **Türkçe** ve düzenli biçimde gösterilmelidir.  

6. ✅ Projede **ArrayList, HashMap** veya ileri seviye yapılar kullanılmamalıdır.  
   (Sadece temel OOP konuları: class, object, method, constructor)  

---
| #   | Sınıf Adı     | Görevi                              | İçermesi Gerekenler                                                                                                                                                                                                                                                                                         |
| --- | ------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1️⃣ | **Car**       | Bir aracın temel bilgilerini tutar. | <ul><li>`String brand` → aracın markası</li><li>`String model` → aracın modeli</li><li>`double dailyPrice` → günlük kiralama ücreti</li><li>**Constructor:** `Car(String brand, String model, double dailyPrice)`</li><li>**Metot:** `void printInfo()` → aracın bilgilerini ekrana yazdırır.</li></ul>     |
| 2️⃣ | **Rental**    | Bir kiralama işlemini temsil eder.  | <ul><li>`Car car` → kiralanan araç</li><li>`int days` → kiralama süresi (gün)</li><li>**Constructor:** `Rental(Car car, int days)`</li><li>**Metot:** `double calculateTotal()` → toplam ücret (günlük ücret × gün sayısı)</li><li>**Metot:** `void printInfo()` → kiralama bilgilerini yazdırır.</li></ul> |
| 3️⃣ | **CarDriver** | Programın ana (main) sınıfıdır.     | <ul><li>`main(String[] args)` metodu bulunmalı</li><li>En az **3 farklı Car** nesnesi oluşturmalı</li><li>Her biri için **Rental** nesnesi tanımlamalı</li><li>`printInfo()` metotlarıyla sonuçları ekrana yazdırmalı</li></ul>                                                                             |


## 💻 Örnek Çalışma Akışı

---------------------
Marka: BMW
Model: 320i
Günlük Ücret: 1500.0 TL
Kiralama Süresi: 5 gün
Toplam Ücret: 7500.0 TL
---------------------

---------------------
Marka: Mercedes
Model: C200
Günlük Ücret: 1800.0 TL
Kiralama Süresi: 3 gün
Toplam Ücret: 5400.0 TL
---------------------

---------------------
Marka: Toyota
Model: Corolla
Günlük Ücret: 900.0 TL
Kiralama Süresi: 7 gün
Toplam Ücret: 6300.0 TL
---------------------

