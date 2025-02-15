package ex_19_OOPs_Part2.Poly.methodoverriding;

public class RealExample {
    public static void main(String[] args) {

        Tc t = new Tc();
        t.openBrowser();

        TC2 t1 = new TC2();
        t1.openBrowser();

    }
}

class commonToAllTCs{
    void openBrowser(){
        System.out.println("Open the browser in 5 sec");
    }
}

class  Tc extends commonToAllTCs{
    void startTC(){
        openBrowser();
    }
}

class TC2 extends commonToAllTCs{
    @Override
    void openBrowser(){
        System.out.println("Open the browser in 2 sec");
    }
}