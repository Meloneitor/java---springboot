import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 6: Calculadora de Días del Mes
        System.out.println("Escoge un mes: " +
                "\n1.Enero \n2.Febrero \n3.Marzo \n4.Abril \n5.Mayo \n6.Junio \n7.Julio \n8.Agosto \n9.Septiembre \n10.Octubre \n11.Noviembre \n12.Diciembre");

        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();

        scanner.close();
        switch (opt) {
            case 1:
                System.out.println("Enero tiene 31 días.");
                break;
            case 2:
                System.out.println("Febrero tiene 28 o 29 días.");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días.");
                break;
            case 4:
                System.out.println("Abril tiene 30 días.");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días.");
                break;
            case 6:
                System.out.println("Junio tiene 30 días.");
                break;
            case 7:
                System.out.println("Julio tiene 31 días.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días.");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días.");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}