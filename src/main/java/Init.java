public class Init{

    public static void main(String[] args) throws InterruptedException {
        Boolean data = StartTest();
        System.out.println(data);

    }

    static Boolean StartTest() throws InterruptedException{

        Main main = new Main();
        String baseurl = "https://a101.com.tr";
        //Tarayıcı Aç
        main.StartBrowser(baseurl);


//      Başta çıkan Cookileri Kabul Et
        main.Click("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]");

//      Diz Altı Çorap Kategorisi Getirilir
        main.Navigate("[title='GİYİM & AKSESUAR']", "Dizaltı Çorap");

//      Çorap Seçilir
        main.Click("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a");

//      Renk Seçilir
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/a");

//      Sepete Eklenir
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");

//      Sepete Gidilir
        main.Click("/html/body/div[2]/div/div[1]/div/div[3]/a[3]");

//      Sepet Onaylanır
        main.Click("/html/body/section/div[1]/div[2]/div/div[2]/div/a");

//      Üyesiz Devam Et
        main.Click("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");

//      Mail Adresine Git
        main.Write("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input" , "numanakoluk01@mail.com");

//      Devam Butonuna Bas
        main.Click("/html/body/section/div[1]/div/div[2]/div/div/form/button");

//      Adres Oluşturulur
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");

//      Adres Başlığı
        main.Write("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input","EV");

//      Ad
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input",System.currentTimeMillis()+"Numan");

//      Soyad
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input",System.currentTimeMillis()+"AKOLUK");

//      Telefon Numarası
        main.Write("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input","0500 000 0000");

//      İl
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select","İSTANBUL");

//      İlçe
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select","ŞİŞLİ");

//      Mahalle
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select","PAŞA MAH");

//      Adres
        main.Write("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea","Ev Adresim Açıklaması...");

//      Posta kodu
        main.Write("/html/body/div[1]/div/div[2]/form/div[8]/div/div/label/input","012345");

//      Kaydet
        main.Click("/html/body/div[1]/div/div[2]/form/button[1]");

//      İlk kargo firmasını seç
        main.ClickCss("div[class='check']");

//      Kaydet ve devam et
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");


//      Siparişi tmamala
        Boolean data = main.Check("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button");

//      Tarayıcı Kapat
        main.StopBrowser();

        return data;
    }


}
