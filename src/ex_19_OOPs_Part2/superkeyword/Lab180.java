package ex_19_OOPs_Part2.superkeyword;

public class Lab180 {
}
class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
       if(isAdmin){
           this.browser = browser;
       }else{
           System.out.println("You are not allowed to change");
       }
    }
}