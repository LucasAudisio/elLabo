public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sala sala = new Sala();
        sala.inicializarAsientos(4, 9);
        System.out.println();
        for(int i = 0; i < sala.getAsientos().size(); i++){
            for(int j = 0; j < sala.getAsientos().get(i).size(); j++) {
                System.out.print(sala.getAsientos().get(i).get(j).getNumero());
                System.out.print(sala.getAsientos().get(i).get(j).getLetra());
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
/*4)    Utilizando   el   paradigma   orientado   a   objetos   vamos   a   programar   una   forma
        de   ubicar espectadores que van a ir a ver una película a un cine.
        En este caso, el cine tiene  solo una sala.
        De este  nos  vaa  interesar  conocer  la  película  que  están  pasando  y
        el  precio  de  la  entrada. De  las películas  nos  interesa  saber  el  título,
        duración,  edad  mínima permitida  y  director  y  del  espectador nos interesa saber
        su nombre, edad y el dinero que tiene.
        Los asientosson etiquetados por una letra (columna) y un número (fila), la fila 1 empieza al
        final de la  matriz  como  se  muestra  en  la  tabla.
        También  deberemos  saber  si  está  ocupado  o  no  el  asiento.
        Ejemplo:

        4 A 4 B 4 C 4 D 4 E 4 F 4 G 4 H 4 I
        3 A 3 B 3 C 3 D 3 E 3 F 3 G 3 H 3 I
        2 A 2 B 2 C 2 D 2 E 2 F 2 G 2 H 2 I
        1 A 1 B 1 C 1 D 1 E 1 F 1 G 1 H 1 I

       Para  poder  probar  el  programa  habrá  que  crear  un  conjunto  de  espectadores
       que  quieran  ver  una película  en  el  cine.  Una  vez  que  llegan  los  espectadores
       habrá  que  asignarles aleatoriamente  un asiento en la sala.
       El espectador solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y
       tiene edad para ver la película, en caso de que el asiento este ocupado le buscamos uno libre.
 */