package ex_19_OOPs_Part2.Poly.methodoverriding;

public class methodoverriding {
    public static void main(String[] args) {
        Pramod_poly p = new Pramod_poly();
        p.home();

        Father_poly f1 = new Father_poly();
        f1.home();

        Father_poly f2 = new Pramod_poly(); //Dynamic dispatch
        f2.home(); //method overriding riden the father
    }
}
