import java.lang.Math;
public class Ecuacion {
    private int a;
    private int b;
    private int c;

    public Ecuacion(){
        a=1;
        b=2;
        c=3;
    }

    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void calcularRaices(){
        if (this.getB()*this.getB()-4*this.getA()*this.getC() != 0){
            double raiz1=0;
            double raiz2=0;
            raiz1=(-this.getB() - Math.sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA();
            raiz2=(-this.getB() + Math.sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA();
            String stringRaiz1 = raiz1+"";
            String stringRaiz2 = raiz2+"";
            System.out.println("Tiene dos raices, las cuales son:");
            System.out.println("Raiz 1: " + stringRaiz1);
            System.out.println("Raiz 2: " + stringRaiz2);
        }
        else{
            double raiz1=0;
            raiz1=(-this.getB() - Math.sqrt(this.getB()*this.getB()-4*this.getA()*this.getC()))/2*this.getA();
            String stringRaiz1 = raiz1+"";
            System.out.println("Tiene una raiz, la cual es: " + stringRaiz1);
        }
    }
}
