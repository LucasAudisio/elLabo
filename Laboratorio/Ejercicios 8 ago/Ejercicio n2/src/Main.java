import java.util.Scanner;
import java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello colo!");

        Fecha fecha1 = new Fecha (29,2,2000);

        fecha1.DiaSiguiente();
        if(fecha1.Valido()) System.out.println("ta bien");
        else System.out.println("ta mal");

        Scanner ingresoDia = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = ingresoDia.nextInt();

        Scanner ingresoMes= new Scanner(System.in);
        System.out.println("Ingrese el mes");
        int mes = ingresoMes.nextInt();

        Scanner ingresoAño = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int año = ingresoAño.nextInt();

        Fecha fechaIngresada = new Fecha(dia, mes, año);
        if(fechaIngresada.Valido()){
            fechaIngresada.print();

            for(int i = 0; i < 10; i++){
                System.out.println("Siguiente dia: ");
                fechaIngresada = fechaIngresada.DiaSiguiente();
                System.out.println("----------------------------");
            }
        }
        else System.out.println("no es valida");
    }
}