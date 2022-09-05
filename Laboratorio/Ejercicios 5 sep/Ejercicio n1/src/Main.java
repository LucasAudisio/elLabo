public class Main {
    public static void mostrarNombreClase(String nombre) throws ExcepcionNombreNull {
        if (nombre == null) {
            throw new ExcepcionNombreNull("El valor guardado es nulo");
        } else {
            System.out.println("El nombre es: " + nombre.length());
        }
    }

    public static void mostrarNombre(String nombre) throws Exception {
        System.out.println("El nombre es: " + nombre.length());
    }

    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("El valor guardado es nulo");
        }

        if (nombre == null) {
            throw new NullPointerException("El valor guardado es nulo");
        }

        try {
            mostrarNombre(nombre);
        } catch (Exception e) {
            System.out.println("El valor guardado es nulo");
        }
        try {
            mostrarNombreClase(nombre);
        } catch (ExcepcionNombreNull err) {
            err.printStackTrace();
        }
    }
}