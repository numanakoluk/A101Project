public class Init{

    public static void main(String[] args) throws InterruptedException {
        Boolean data = StartTest();
        System.out.println(data);

    }

    static Boolean StartTest() throws InterruptedException{

        Main main = new Main();
        String baseurl = "https://a101.com.tr";

        //Open browser
        main.StartBrowser(baseurl);


//      Accept Cookies
        main.Click("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]");

//      Below Knee Socks Category
        main.Navigate("[title='GİYİM & AKSESUAR']", "Dizaltı Çorap");

//      Choose Socks
        main.Click("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a");

//      Choose Color
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a");

//      Add To Basket
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");

//      Go to Basket
        main.Click("/html/body/div[2]/div/div[1]/div/div[3]/a[3]");

//      Approve to Basket
        main.Click("/html/body/section/div[1]/div[2]/div/div[2]/div/a");

//      Continue Without Membership
        main.Click("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");

//      Go To Email Address
        main.Write("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input" , "numanakoluk01@mail.com");

//      Press Continue Button
        main.Click("/html/body/section/div[1]/div/div[2]/div/div/form/button");

//      Create Address
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");

//      Address Title
        main.Write("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input","EV");

//      Name
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input",System.currentTimeMillis()+"Numan");

//      Surname
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input",System.currentTimeMillis()+"AKOLUK");

//      Phone Number
        main.Write("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input","05000000000");

//      Country
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select","İSTANBUL");

//      District
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select","ŞİŞLİ");

//      Neighbourhood
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select","PAŞA MAH");

//      Address
        main.Write("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea","Ev Adresim Açıklaması...");

//      Post Code
        main.Write("/html/body/div[1]/div/div[2]/form/div[8]/div/div/label/input","00000");

//      Save
        main.Click("/html/body/div[1]/div/div[2]/form/button[1]");

//      Select the first shipping company
        main.ClickCss("div[class='check']");

//      Save and Continue
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");


//      Complate Order
        Boolean data = main.Check("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button");

//      Close Browser
        main.StopBrowser();

        return data;
    }


}
