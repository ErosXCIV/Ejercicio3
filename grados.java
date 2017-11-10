import java.util.Scanner;

public class grados {
    public static void main(String[]args) {

        int aux, temperatura;
        Scanner lector = new Scanner(System.in);

        System.out.println("Inserte la cantidad de grados Celsius a convertir;");
        aux = lector.nextInt();

        temperatura=(32+(9*aux/5));
        System.out.println("Grados Fahrenheit: "+temperatura);



    }
}
