package ex_19_OOPs_Part2.Encapsulation;

public class Lab177 {
    public static void main(String[] args) {


        ICICIBank Murali = new ICICIBank("Amit", 100);
        System.out.println(Murali.getName());
        System.out.println(Murali.getBal());
        boolean isCashier = true;
        Murali.setBal(1000, isCashier);
        System.out.println(Murali.getBal());
    }




}
class ICICIBank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier ==  true){      this.bal = bal;}else{
            System.out.println("not allowed");
        }

    }



    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}