import java.util.Date;

public class Init{

    public static void main(String[] args) throws InterruptedException {
        Boolean data = StartTest();
        System.out.println(data);

    }

    static Boolean StartTest() throws InterruptedException{

        Base base = new Base();
        String baseurl = "https://a101.com.tr";

        //Open browser
        base.StartBrowser(baseurl);
        System.out.println(new Date()+"-Open browser");


//      Accept Cookies
        base.Click("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]");
        System.out.println(new Date()+"-Accept Cookies");


//      Below Knee Socks Category
        base.Navigate("[title='GİYİM & AKSESUAR']", "Dizaltı Çorap");
        System.out.println(new Date()+"-Below Knee Socks Category");


//      Choose Socks
        base.Click("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a");
        System.out.println(new Date()+"-Choose Socks");


//      Choose Color
        base.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a");
        System.out.println(new Date()+"-Choose Color");


//      Add To Basket
        base.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");
        System.out.println(new Date()+"-Add To Basket");


//      Go to Basket
        base.Click("/html/body/div[2]/div/div[1]/div/div[3]/a[3]");
        System.out.println(new Date()+"-Go to Basket");


//      Approve to Basket
        base.Click("/html/body/section/div[1]/div[2]/div/div[2]/div/a");
        System.out.println(new Date()+"-Approve to Basket");


//      Continue Without Membership
        base.Click("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");
        System.out.println(new Date()+"-Continue Without Membership");


//      Go To Email Address
        base.Write("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input" , "numanakoluk"+Math.floor(Math.random()*11) + "@gmail.com");
        System.out.println(new Date()+"-Go To Email Address");



//      Press Continue Button
        base.Click("/html/body/section/div[1]/div/div[2]/div/div/form/button");
        System.out.println(new Date()+"-Press Continue Button");


//      Create Address
        base.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
        System.out.println(new Date()+"-Create Address");


//      Address Title
        base.Write("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input","EV");
        System.out.println(new Date()+"-Address Title");


//      Name
        base.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input",System.currentTimeMillis()+"Numan");
        System.out.println(new Date()+"-Name");


//      Surname
        base.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input",System.currentTimeMillis()+"AKOLUK");
        System.out.println(new Date()+"-Surname");


//      Phone Number
        base.Write("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input","050706524315");
        System.out.println(new Date()+"-Phone Number");


//      Country
        base.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select","İSTANBUL");
        System.out.println(new Date()+"-Country");


//      District
        base.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select","ŞİŞLİ");
        System.out.println(new Date()+"-District");


//      Neighbourhood
        base.SelectBox("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select","PAŞA MAH");
        System.out.println(new Date()+"-Neighbourhood");


//      Address
        base.Write("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea","Ev Adresim Açıklaması...");
        System.out.println(new Date()+"-Address");


//      Post Code
        base.Write("/html/body/div[1]/div/div[2]/form/div[8]/div/div/label/input","00000");
        System.out.println(new Date()+"-Post Code");


//      Save
        base.Click("/html/body/div[1]/div/div[2]/form/button[1]");
        System.out.println(new Date()+"-Save");


//      Select the first shipping company
        base.ClickCss("div[class='check']");
        System.out.println(new Date()+"-Select the first shipping company");


//      Save and Continue
        base.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");
        System.out.println(new Date()+"-Save and Continue");



//      Complate Order
        Boolean data = base.Check("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button");
        System.out.println(new Date()+"-Complate Order");


//      Close Browser
        base.StopBrowser();
        System.out.println(new Date()+"-Close Browser");


        return data;
    }


}
