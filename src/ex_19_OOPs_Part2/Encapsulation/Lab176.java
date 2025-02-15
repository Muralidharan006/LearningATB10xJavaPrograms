package ex_19_OOPs_Part2.Encapsulation;

public class Lab176 {



    public static void main(String[] args) {
        Vwologing vwo = new Vwologing("admin","pass123");
        System.out.println(vwo.password);//its not secured

        GoodEncapVwoLogin Gd = new GoodEncapVwoLogin("admin","87uhj");
Gd.setUsername("sushma");
        System.out.println(Gd.getUsername());
    }
}

class Vwologing{
    String username;
    String password;

    public Vwologing(String user,String pwd) {
        this.username = user;
        this.password = pwd;
    }
}

class GoodEncapVwoLogin{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean isadmin = true;
        if(isadmin == true){

        }
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GoodEncapVwoLogin(String user2, String pwd2) {
        this.username = user2;
        this.password = pwd2;
    }

}
