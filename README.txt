Manuel Test Senaryoları
1. Yeni Adres Ekleme
Test Adı: Yeni bir adresin başarıyla eklenmesi.

Adımlar:

"Adres Defteri" sayfasını açın.
"Yeni Adres Ekle" butonuna tıklayın.
Açılan formda gerekli tüm alanları (Adres İsmi, Adı, Soyadı, Ülke, Şehir, İlçe, Telefon, Cep Telefonu, T.C. Kimlik No, Adres) geçerli bilgilerle doldurun.
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: Adres başarıyla eklenir ve "Adres Defteri" sayfasında listelenir.

2. Zorunlu Alanların Boş Bırakılması
Test Adı: Zorunlu alanlar boş bırakıldığında hata mesajlarının görüntülenmesi.

Adımlar:

"Yeni Adres Ekle" butonuna tıklayın.
Zorunlu alanlardan bir veya birkaçını boş bırakın.
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: Boş bırakılan zorunlu alanlar için hata mesajları görüntülenir ve adres eklenmez.

3. Telefon Numarası Formatı
Test Adı: Telefon numarası alanına yanlış formatta veri girildiğinde hata mesajının görüntülenmesi.
//

Adımlar:

"Yeni Adres Ekle" formunu açın.
Telefon ve Cep Telefonu alanlarına geçersiz bir formatta numara girin (örneğin, sadece harfler veya yetersiz sayıda rakam).
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: Telefon ve Cep Telefonu alanları için uygun formatta veri girilmesi gerektiğine dair bir hata mesajı görüntülenir.

4. T.C. Kimlik No Formatı
Test Adı: T.C. Kimlik No alanına yanlış formatta veri girildiğinde hata mesajının görüntülenmesi.

Adımlar:

"Yeni Adres Ekle" formunu açın.
T.C. Kimlik No alanına geçersiz bir formatta numara girin (örneğin, 11 haneden az veya fazla rakam).
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: T.C. Kimlik No'su için uygun formatta veri girilmesi gerektiğine dair bir hata mesajı görüntülenir.

5. Adres Güncelleme
Test Adı: Var olan bir adresin başarıyla güncellenmesi.

Adımlar:

"Adres Defteri" sayfasında mevcut bir adresi seçin.
Adres bilgilerini düzenlemek için ilgili adresin yanındaki "Düzenle" butonuna tıklayın.
Açılan formda bazı bilgileri değiştirin.
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: Değişiklikler başarıyla kaydedilir ve güncellenmiş bilgiler "Adres Defteri" sayfasında listelenir.

6. Adres Silme
Test Adı: Var olan bir adresin başarıyla silinmesi.

Adımlar:

"Adres Defteri" sayfasında mevcut bir adresi seçin.
Adresin yanındaki "Sil" butonuna tıklayın.
Silme işlemini onaylayın.
Beklenen Sonuç: Adres başarıyla silinir ve "Adres Defteri" sayfasında adres listesinde görünmez.

7. Adres İsim Alanının Zorunluluğu
Test Adı: Adres ismi alanı boş bırakıldığında hata mesajının görüntülenmesi.

Adımlar:

"Yeni Adres Ekle" formunu açın.
Adres İsmi alanını boş bırakın.
Diğer gerekli alanları doldurun.
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: "Adres İsmi" alanı boş bırakılamaz şeklinde bir hata mesajı görüntülenir.

8. Adres Defteri Boş İken
Test Adı: Adres Defteri'nin boş iken doğru şekilde görüntülenmesi.

Adımlar:

"Adres Defteri" sayfasına gidin.
Beklenen Sonuç: Adres Defteri'nin boş olduğunu belirten bir mesaj ve yeni adres eklemek için bir buton (örneğin "Yeni Adres Ekle") görünmelidir.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
BULUNAN HATALAR

1-)Hata Başlığı: Telefon Numarası Formatı Hatası

Test Adı: Telefon Numarası Formatı

Hata Türü: Telefon Numarası Formatı

Açıklama: KKTC alanı seciliyken  Telefon numarası ve cep telefonu alanına gecersiz telefon numarasi girildiğinde sistem bu formatı kabul ediyor ve hata mesajı göstermiyor.

Reproduksiyon Adımları:

"Yeni Adres Ekle" formunu açın.
Telefon ve Cep Telefonu alanlarına gecersiz işareti girin.
"Kaydet" butonuna tıklayın.
Beklenen Sonuç: Telefon numarası alanları için geçersiz formatta veri girildiğinde uygun formatta veri girilmesi gerektiğine dair bir hata mesajı görüntülenmelidir.

Gerçek Sonuç: gecersiz numara girildiğinde sistem bu formatı kabul ediyor ve hata mesajı göstermiyor.

2-)Hata Başlığı: KKTC Şehir Seçimi Sonrası İlçe Alanı Boş Kalıyor ve Geçersiz Karakterler Kabul Ediliyor

   Test Adı: İlçe Adı Formatı ve Zorunluluk

   Hata Türü: İlçe Alanı Boşluk ve Geçersiz Karakter Girişi

   Açıklama: KKTC (Kuzey Kıbrıs Türk Cumhuriyeti) şehir seçimi yapıldıktan sonra ilçe adı alanı boş gelmektedir. Ayrıca, bu alana farklı karakterler veya geçersiz ilçe isimleri girilebilmektedir.

   Reproduksiyon Adımları:

   "Yeni Adres Ekle" formunu açın.
   Ülke olarak "KKTC" seçeneğini seçin.
   Şehir alanında bir şehir seçin.
   İlçe alanının boş geldiğini gözlemleyin.
   İlçe alanına geçersiz karakterler (örneğin, /, @, !, vs.) veya geçersiz ilçe isimleri yazın.
   "Kaydet" butonuna tıklayın.
   Beklenen Sonuç:

   Şehir seçildikten sonra ilçe alanı doldurulmuş olmalı ve boş olmamalıdır.
   İlçe alanına geçersiz karakterler veya geçersiz ilçe isimleri girildiğinde uygun bir hata mesajı görüntülenmelidir.
   Gerçek Sonuç:

   Şehir seçildikten sonra ilçe adı alanı boş gelmektedir.
   İlçe alanına geçersiz karakterler veya geçersiz ilçe isimleri girilebilmektedir ve sistem bu girdileri kabul etmektedir.