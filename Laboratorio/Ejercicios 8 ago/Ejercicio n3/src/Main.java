public class Main {
    public static void main(String[] args) {
        System.out.println("Hello colo!");
        Ecuacion ecuacion1 = new Ecuacion(1, 2, 1);
        ecuacion1.calcularRaices();
    }
}

//3)  Realizar  un  sistema  que  me  permita  representar  las  raíces  de  una  ecuación  de  2º  grado.  La ecuación deberá tener asociado los coeficientes que se llamarán a, b yc.Al  ingresar  cada  ecuación  se  deberán  especificar  los  3  coeficientes,  siendo  el  primero  el  que acompaña a la X2, el segundo a la X y el tercero el término independienteRealizar la clase correspondiente con sus métodos asociados y un programa de prueba en el que se calculen  las  raíces.  Si  el  discriminante  es  mayor  a  0  el  programa  deberá  imprimir  las  dos  raíces mientras que si el discriminante es 0 imprimirá la única soluciónRecordatorio de la resolvente para calcular raíces de un polinomio de grado 2: