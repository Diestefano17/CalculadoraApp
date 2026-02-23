// CalculadoraApp.java
import java.util.Scanner;

public class CalculadoraApp{
    private Scanner scanner;

    public CalculadoraApp() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Número 1: ");
                double num1 = scanner.nextDouble();
                System.out.print("Número 2: ");
                double num2 = scanner.nextDouble();

                switch(opcion) {
                    case 1:
                        System.out.println("= " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("= " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("= " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("= " + (num1 / num2));
                        } else {
                            System.out.println("Error: División por cero");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida");
            }

        } while(opcion != 5);

        System.out.println("¡Adiós!");
        scanner.close();
    }

    public static void main(String[] args) {
        CalculadoraApp calc = new CalculadoraApp();
        calc.iniciar();
    }
}
