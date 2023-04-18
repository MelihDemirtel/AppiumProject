# Proje Hakkında
AppiumProject, mobil uygulama testlerini gerçekleştirmek için kullanılan açık kaynaklı bir araç olan Appium kullanılarak oluşturulmuştur. Bu proje, Appium ile iOS ve Android uygulamaları için otomatik test senaryolarının yazılmasını ve yürütülmesini sağlar. Bu projede N11 Mobil Uygulamasi ile Telefon Satın Alma testi yapılmıştır.

## Kullanılan Teknolojiler
Proje, aşağıdaki teknolojiler kullanılarak geliştirilmiştir:

- Java
- Appium
- TestNG
- Maven

## Kurulum
Projenin kopyalanması:
```
https://github.com/MelihDemirtel/AppiumProject.git
```

[Java kurulumu:](https://www.java.com/en/download/)
[Android Studio kurulumu:](https://developer.android.com/studio)
[Appium kurulumu:](http://appium.io/docs/en/about-appium/getting-started/)
[Maven kurulumu:](https://maven.apache.org/install.html)

## Nasıl Kullanılır?
1. Proje klonlanır veya indirilir.
2. İndirilen proje, IntelliJ IDEA gibi bir Java geliştirme ortamında açılır.
3. src/test/java altındaki test senaryoları incelemek ve değiştirmek için kullanılabilir.
4. Senaryoların çalıştırılması, ***src/test/resources/parallel.xml** dosyasının seçilerek "Run" seçeneği ile gerçekleştirilebilir.

## Senaryolar
Proje içerisinde şu anda aşağıdaki senaryolar yer almaktadır:

 Feature:n11 Mobil Uygulama
    Scenario:n11 Mobil Uygulamasi ile Telefon Satin Alma
      When Kategorilere tiklanir
      When Elektronik tiklanir
      When Telefonve Aksesuarlari Secilir
      When Cep telefonu secilin
      When Marka secilin
      When Filtrelemeye tiklanin
      When Filtreleme yapilin
      When Sonuclarigostere tiklanin
      When Urun sepete eklenir
      When Sepetime gidilir
      Then Sepete urunun geldigi kontrol edilir

## Özellikler
Projenin şu anda sunmuş olduğu özellikler şunlardır:

- iOS ve Android uygulamaları için uyumlu
- TestNG ile entegre
- Senaryoları kolayca eklenebilir ve güncellenebilir

# Lisans
Bu proje, MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasını inceleyebilirsiniz.

# Katkıda Bulunma
Herhangi bir hata veya öneriniz varsa, lütfen Github üzerinden issue açın veya pull request gönderin.

Teşekkürler!
