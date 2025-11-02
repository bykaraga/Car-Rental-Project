Aşağıda, `Car-Rental-Project` için “codify” tarzında, yani yapısal, okunabilir ve standart bir README dosyası şablonu oluşturdum. Mevcut README içeriğini referans alarak, eksiksiz ve temiz bir versiyon hazırladım; sen istersen ben bunu doğrudan GitHub’a eklemene uygun hâle getirebilirim.

---

```md
# Car Rental Project / Araç Kiralama Sistemi

**Java** ile yazılmış bu proje, nesne yönelimli programlama (OOP) prensiplerini kullanarak temel bir araç kiralama sistemini modellemeyi amaçlar.

---

## 🚀 İçerik

- [Amaç](#amaç)  
- [Özellikler](#özellikler)  
- [Projenin Tamamlanma Ölçütleri](#projenin-tamamlanma-ölçütleri)  
- [Sınıf Mimarı](#sınıf-mimarı)  
- [Örnek Çıkış](#örnek-çıkış)  
- [Kurulum & Çalıştırma](#kurulum--çalıştırma)  
- [Lisans](#lisans)  
- [Uyarı](#uyarı)  

---

## Amaç

Bu projenin amacı:

- Java dilinde **nesne yönelimli programlamayı (OOP)** uygulamalı hale getirmek,  
- Sınıf, nesne, constructor, metot, erişim belirleyicileri gibi temel kavramları pekiştirmek,  
- Basit bir araç kiralama sisteminin işleyişini modellemek ve çıktıyı okunabilir formatta vermek.

---

## Özellikler

Projede olması beklenen temel özellikler:

- `Car` sınıfı: araç markası, modeli ve günlük kira bedeli bilgilerini tutar.  
- `Rental` sınıfı: kiralama işlemini temsil eder; kaç gün kiralandığı ve toplam bedel hesaplama mantığı içerir.  
- `CarDriver` (main) sınıfı: birkaç araç tanımlar, kiralama işlemlerini oluşturur ve bilgileri ekrana yazdırır.  
- Kod, OOP prensiplerine uygun, okunabilir ve anlaşılabilir olmalıdır.  
- Gelişmiş koleksiyon yapıları (ArrayList, HashMap vb.) **kullanılmamalıdır**.

---

## Projenin Tamamlanma Ölçütleri

Projenin “tamamlanmış” sayılabilmesi için aşağıdaki koşullar yerine getirilmelidir:

1. `Car` sınıfı en az aşağıdaki değişkenlere sahip olmalı:  
   - `String brand`  
   - `String model`  
   - `double dailyPrice`  

2. `Rental` sınıfı şu özelliklere sahip olmalı:  
   - `Car car`  
   - `int days`  
   - `double calculateTotal()` metodu → günlük kira × gün sayısı  
   - `void printInfo()` metodu → kiralama bilgilerini ekrana yazdırma  

3. `CarDriver` sınıfında:  
   - `main(String[] args)` metodu olmalı  
   - En az **3 farklı** `Car` nesnesi tanımlanmalı  
   - Her biri için `Rental` nesnesi oluşturulmalı  
   - `printInfo()` ile sonuçlar okunabilir biçimde gösterilmeli  

4. Çıktılar Türkçe olmalı ve düzgün formatta olmalı.  
5. Koleksiyonlar (ArrayList, HashMap vb.) kullanılmamalıdır — yalnızca temel OOP yapıları kullanılmalıdır.

---

## Sınıf Mimarisi

| Sınıf       | Sorumlulukları |
|-------------|----------------|
| `Car`       | Araç verilerini tutar (marka, model, günlük ücret), `printInfo()` metodu içerir. |
| `Rental`    | Kiralama işlemini temsil eder; kaç gün kiralandığını, kiralanan `Car` objesini tutar, toplam ücreti hesaplar. |
| `CarDriver` | Programın giriş noktasıdır (`main`). Araçları tanımlar, kiralama nesneleri oluşturur, `printInfo()` ile çıktı verir. |

---

## Örnek Çıkış

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

````

---

## Kurulum & Çalıştırma

1. Bu projeyi klonlayın:

   ```bash
   git clone https://github.com/bykaraga/Car-Rental-Project.git
````

2. Java derleyicisi (JDK) kurulu olmalı (Java 8 veya üzeri önerilir).
3. IDE ile projeyi açın (IntelliJ, Eclipse vb.).
4. `CarDriver` sınıfını çalıştırın.
5. Konsol çıktısını gözlemleyin.

---

## Lisans

Bu proje **MIT Lisansı** ile lisanslanmıştır. ([GitHub][1])

---

## Uyarı

Bu README’nin yalnızca genel açıklama bölümleri ChatGPT tarafından oluşturulmuştur. Proje kodları, yorumları ve dokümantasyonlarında **yapay zekâ kullanılması yasaktır**.

---

```


::contentReference[oaicite:1]{index=1}
```

[1]: https://github.com/bykaraga/Car-Rental-Project "GitHub - bykaraga/Car-Rental-Project: Araç Kiralama Sistemi (Car Rental Project) Bu projenin amacı, **Java diliyle nesne yönelimli programlama (OOP)** ilkelerini kullanarak   temel bir **araç kiralama sisteminin işleyişini modellemek** ve öğrencinin aşağıdaki konularda uygulamalı deneyim kazanmasını sağlamaktır:"
