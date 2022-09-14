public class Diputado extends Legislador{
    private int nro1NoSeQueHace;
    private int nro2NoSeQueHace;

    public Diputado(){
        nombre="nombre";
        apellido="apellido";
        edad=0;
        booleano=false;
        partido="";
        provincia=Provincia.BUENOS_AIRES;
        nro1NoSeQueHace=0;
        nro2NoSeQueHace=0;
    }

    public Diputado(String nombre, String apellido, int edad, boolean booleano, Provincia provincia, String partido, int nro1, int nro2){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.booleano=booleano;
        this.partido=partido;
        this.provincia=provincia;
        this.nro1NoSeQueHace = nro1;
        this.nro2NoSeQueHace = nro2;
    }

    public Diputado(String nombre, String apellido, int edad, boolean booleano, Provincia provincia, int nro1, int nro2){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.booleano=booleano;
        this.partido="partido";
        this.provincia=provincia;
        this.nro1NoSeQueHace = nro1;
        this.nro2NoSeQueHace = nro2;
    }

    public int getNro1NoSeQueHace() {
        return nro1NoSeQueHace;
    }

    public void setNro1NoSeQueHace(int nro1NoSeQueHace) {
        this.nro1NoSeQueHace = nro1NoSeQueHace;
    }

    public int getNro2NoSeQueHace() {
        return nro2NoSeQueHace;
    }

    public void setNro2NoSeQueHace(int nro2NoSeQueHace) {
        this.nro2NoSeQueHace = nro2NoSeQueHace;
    }

    public int getNro1(){
        return nro1NoSeQueHace;
    }
    public int getNro2(){
        return nro2NoSeQueHace;
    }
}
