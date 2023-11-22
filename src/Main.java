import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        System.out.println("Mi calculadora!");

        System.out.println("¿Cómo te llamas?");
        String nombre = input.next();

        System.out.println(STR."Te llamas \{nombre}");

        try {

            calcular(input, nombre);

        } catch (Exception e) {

            System.out.println("Error en los valores");
            // System.out.println("Exception : " + e);
        }




    input.close();
    }

    public static Boolean comprobarDivisor(double divisor){
        if (divisor == 0) {
            System.out.println("No se puede dividir por cero");
            return false;
        } else {
            return true;
        }
    }

    public static void calcular(Scanner input, String nombre) {

        System.out.println("Dime el primer número");
        double num1 = input.nextDouble();
        System.out.println("Dime el segundo número");
        double num2 = input.nextDouble();
        String menu = STR."""
                Tu calculadora \{nombre}
                1 - suma
                2 - resta
                3 - multiplicación
                4 - división
                5 - raíz cuadrada
                """;
        System.out.println("¿Qué operación quieres hacer?");
        System.out.println(menu);
        int operacion = input.nextInt();

        switch (operacion){
            case 1:
                System.out.println("La suma es " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es " + (num1 * num2));
                break;
            case 4:
                if (comprobarDivisor(num2)) {
                    System.out.println("La división es " + Math.round(100.0 * (num1 / num2))/100.0);
                }
                break;
            case 5:
                System.out.println("La raíz cuadrada es " + Math.sqrt(num1));
                break;
            default:
                System.out.println("Operación no identificada");

        }

    }


}