public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha DiaSiguiente(){
         Fecha DiaDeMañana = new Fecha(this.dia + 1, this.mes, this.año);
         if(!DiaDeMañana.Valido()){
             DiaDeMañana.dia = 1;
             DiaDeMañana.mes++;
         }
         System.out.println("Dia: " + DiaDeMañana.dia);
         System.out.println("Mes: " + DiaDeMañana.mes);
         System.out.println("Año: " + DiaDeMañana.año);
         return DiaDeMañana;
    }

    public boolean esBisisesto(){
        return ((this.año % 4) == 0);
    }

    public boolean Valido(){
        if (this.mes == 2){
            if (this.esBisisesto()){
                System.out.println(this.dia);
                if(this.dia > 29){
                    return false;
                }
                else return true;
            }
            else{
                if(this.dia > 28){
                    return false;
                }
                else return true;
            }
        }
        else if(this.mes == 1 || this.mes == 3 || this.mes == 5
                || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12){
            if(this.dia > 31) return false;
            else return true;
        }
        else{
            if(this.dia > 30) return false;
            else return true;
        }
    }
    public void print(){
        System.out.println("(" + dia + "-" + mes + "-" + año + ")");
    }
}
