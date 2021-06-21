Feature: first test case of beinconnect
  Maç başlıyor sayfasına ulaşılır.
  BeinConnecte devam edilir
  Giriş Yap butonuna tıklanır ve Giriş sayfası açılır.
  Kullanıcı bilgileri girilir ve giriş yap butonuna tıklanır.
  Canlı TV menüsünden Ulusal alt menüsü seçilir.
  Kanal Listesinden SHOW TV oldugu kontrol edilir
  Yayını durdur ve yenıden baslat
  Log out ol  Scenario:player test

@wip
  Scenario: first
   Given the homepage is opened
   And user clicks on login button
   And user login with valid account
   When user navigate to "Ulusal" under "CANLI TV"
   Then page should include "SHOW TV"
   And user pause and start player

