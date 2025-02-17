import java.util.Scanner;

public class App {

    public static String imparException(int numero){
        if (numero % 2 == 1)
            throw new ArithmeticException("Exception: es impar");
        return numero + " es par";
    }
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean impar = true;

        do {
            try{
                System.out.print("Escribe un numero par: ");
                int numero = Integer.parseInt(input.nextLine());
                imparException(numero);
                impar = false;

                System.out.println("Exito: " + numero + " es par...");
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
        } while (impar);
    }
}
