import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Ejercicio 12: Generador de Horóscopo
        System.out.println("Escoge el mes en que naciste:\n" +
                "1. Enero\n" +
                "2. Febrero\n" +
                "3. Marzo\n" +
                "4. Abril\n" +
                "5. Mayo\n" +
                "6. Junio\n" +
                "7. Julio\n" +
                "8. Agosto\n" +
                "9. Septiembre\n" +
                "10. Octubre\n" +
                "11. Noviembre\n" +
                "12. Diciembre\n" +
                "0. Salir");
        System.out.print("Elige una opción: ");
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();


        String signo = "";

        switch (mes) {
            case 1:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia = scanner.nextInt();
                if (dia >= 1 && dia <= 19) {
                    signo = "Capricornio";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Acuario";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 2:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia2 = scanner.nextInt();
                if (dia2 >= 1 && dia2 <= 18){
                    signo = "Acuario";
                }else {
                    signo = "Picis";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 3:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia3 = scanner.nextInt();
                if (dia3 >= 1 && dia3 <= 20) {
                    signo = "Picis";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Aries";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 4:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia4 = scanner.nextInt();
                if (dia4 >= 1 && dia4 <= 19) {
                    signo = "Aries";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Tauro";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 5:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia5 = scanner.nextInt();
                if (dia5 >= 1 && dia5 <= 20) {
                    signo = "Tauro";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Geminis";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 6:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia6 = scanner.nextInt();
                if (dia6 >= 1 && dia6 <= 20) {
                    signo = "Geminis";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Cancer";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 7:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia7 = scanner.nextInt();
                if (dia7 >= 1 && dia7 <= 22) {
                    signo = "Cancer";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Leo";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 8:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia8 = scanner.nextInt();
                if (dia8 >= 1 && dia8 <= 22) {
                    signo = "Leo";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Virgo";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 9:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia9 = scanner.nextInt();
                if (dia9 >= 1 && dia9 <= 22) {
                    signo = "Virgo";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Libra";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 10:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia10 = scanner.nextInt();
                if (dia10 >= 1 && dia10 <= 22) {
                    signo = "Libra";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Escorpio";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 11:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia11 = scanner.nextInt();
                if (dia11 >= 1 && dia11 <= 21) {
                    signo = "Escorpio";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Sagitario";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 12:
                System.out.println("Ahora digita el dia que naciste: ");
                int dia12 = scanner.nextInt();
                if (dia12 >= 1 && dia12 <= 21) {
                    signo = "Sagitario";
                    System.out.println("Su signo es: " + signo);
                } else {
                    signo = "Capricornio";
                    System.out.println("Su signo es: " + signo);
                }
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }


    }
}