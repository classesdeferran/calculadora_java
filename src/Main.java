import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Mi calculadora!");

        Scanner input = new Scanner(System.in);
        System.out.println("Dime el primer número");
        double num1 = input.nextDouble();
        System.out.println("Dime el segundo número");
        double num2 = input.nextDouble();

        String menu = """
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
                System.out.println("La división es " + (Math.round(100.0 * (num1 / num2)))/100.0);
                break;
            case 5:
                System.out.println("La raíz cuadrada es " + Math.sqrt(num1));
                break;
            default:
                System.out.println("Operación no identificada");

        }



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}