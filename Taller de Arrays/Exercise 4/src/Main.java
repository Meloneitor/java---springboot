import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"handles", "pears", "Apples"};
        int[] prices = {1400,1200,1500};

        int[] quantities = new int[products.length];

        for (int i=0; i < products.length; i++){
            System.out.println(products[i] + " - $" + prices[i]);
            System.out.print("How many " + products[i] + " do you want to buy? ");
            quantities[i] = scanner.nextInt();
        }

        int total = 0;
        double discount = 0;
        for (int i = 0; i < products.length; i++) {
            total += quantities[i] * prices[i];
        }

        if (total >= 200){
            discount = total * 0.10;
        } else if (total >= 300) {
            discount = total * 0.15;
        }else if (total >= 500) {
            discount = total * 0.20;
        }else if (total >= 1000) {
            discount = total * 0.25;
        }

         double facture = total - discount;

        System.out.println("The invoice total is: $" + facture);
        scanner.close();
    }
}