import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 8: Cálculo de Promedio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la calificacion: ");
        double cl1 = scanner.nextDouble();
        System.out.println("Ingrese la calificacion: ");
        double cl2 = scanner.nextDouble();
        System.out.println("Ingrese la calificacion: ");
        double cl3 = scanner.nextDouble();

        double prom = (cl1 + cl2 + cl3)/3;

        if (prom > 10) {
            System.out.println("Usted ingreso mal una calificacion. Intente de nuevo");
        } else if (prom < 6) {
            System.out.println("El promedio es: " + prom + " Reprobado");
        } else {
            System.out.println("El promedio es: " + prom + " Aprobado");
        }
    }
}