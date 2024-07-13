import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"jose", "gabriel", "fabian", "andres", "geronimo"};
        System.out.println("Ingrese el nombre que esta buscando: ");
        String name = scanner.nextLine();
        String nameMinus = name.toLowerCase();

        boolean encontrado = false;

        for (int i = 0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(nameMinus)) {
                System.out.println("Se encontro el nombre " + name);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro el nombre en la lista : ");
        }


    }
}