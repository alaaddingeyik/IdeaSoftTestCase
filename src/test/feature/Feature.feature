Feature:Ideasoft sitesi urun kontrol etme calismasi
  Scenario: Urun sepete ekleme ve kontrol islemidir
    Given testcase.myideasoft.com adresine gidilir
    When Search box alanina urun yazilip arama butonuna tiklanir
    And Listelenen urunun detayina girilip 5 adet sepete eklenir
    And Sepetinize eklenmistir yazisinin gorundugu kontrol edilir
    Then Sepet sayfasına gidilir ve sepet iceriginde ilgili urunden 5 adet oldugu kontrol edilir
