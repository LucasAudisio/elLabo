public class TestLegisladores {
    public static void main (String [] args) {
        Legislador leg1 = new Diputado ("Carlos", "Pérez", 49, true, Provincia.CORDOBA,"FPV", 506, 25);
        Legislador leg2 = new Diputado ("Diego", "Ramírez", 51, false, Provincia.BUENOS_AIRES,"PRO", 208, 95);
        Legislador    leg3    =    new    Diputado    ("Alberto",    "Garay",    19,    false,    Provincia.FORMOSA, "Radicalismo", 774, 104);
        Legislador leg4 = new Diputado ("María", "Lopérfido", 39, true, Provincia.NEUQUEN, 225, 100);
        Legislador  leg5  =  new  Senador  ("Luisina",  "Brando",  62,  false, Provincia.SANTA_FE,"PRO",  58, 97);
        Legislador  leg6  =  new  Senador  ("Nestor",  "Kirchner",  61,  true, Provincia.SANTA_CRUZ,"FPV", 012, 41);
        Legislador leg7 = new Senador ("Cristina", "Fernández", 60, true, Provincia.SANTA_CRUZ,"FPV", 013, 42);
        NominaLegisladores listaCongreso = new NominaLegisladores ();
        listaCongreso.agregaLegislador(leg1);
        listaCongreso.agregaLegislador(leg2);
        listaCongreso.agregaLegislador(leg3);
        listaCongreso.agregaLegislador(leg4);
        listaCongreso.agregaLegislador(leg5);
        listaCongreso.agregaLegislador(leg6);
        listaCongreso.agregaLegislador(leg7);
        System.out.println ("El total de legisladores es de " + listaCongreso.getTamaño());
        System.out.println ("");listaCongreso.muestraContenido();
    }
}