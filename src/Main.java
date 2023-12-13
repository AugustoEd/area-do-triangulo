import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /* Algoritmo desenvolvido para calcular área de triangulos usando a fórmula de Héron,
            Sem POO.
         */

        System.out.println("Entre com os lados do triangulo X:");
        double xA = scan.nextDouble();
        double xB = scan.nextDouble();
        double xC = scan.nextDouble();

        System.out.println("Entre com os lados do triangulo Y");
        double yA = scan.nextDouble();
        double yB = scan.nextDouble();
        double yC = scan.nextDouble();

        double p = (xA+xB+xC)/2;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
        System.out.printf("Valor da área do triangulo X: %.3f%n",areaX);

        double S = (yA+yB+yC)/2;
        double areaY = Math.sqrt(S * (S-yA) * (S-yB) * (S-yC));
        System.out.printf("Valor da área do triangulo Y: %.3f%n" , areaY);

        if (areaX>areaY) {
            System.out.println("A maior área é do triangulo X");

        } else {
            System.out.println("A maior área é a do triangulo Y ");

        }

    }
    }
