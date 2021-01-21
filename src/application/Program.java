package application;

import model.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> service = new PrintService<>();

        System.out.print("How many values: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            service.addValue(sc.nextInt());
        }

        service.print();
        System.out.println();

        System.out.print("First: " + service.first());

        sc.close();
    }
}
