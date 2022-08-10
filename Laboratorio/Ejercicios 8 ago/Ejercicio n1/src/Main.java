public class Main {

    public static void main(String[] args) {
        System.out.println("Hello colo!");
        Cuenta cuenta1 = new Cuenta("xd", 1, 1, 200);
        Cuenta cuenta2 = new Cuenta("xd", 2, 3, 400);
        Cuenta.transferirDineral(100, cuenta2, cuenta1);
    }
}