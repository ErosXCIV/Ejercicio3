package Eros;

import java.util.Scanner;

public class areCir {
	public static void main(String[] args) {
		
	//variables o atributos
	double radio, area;
	Scanner scanner=new Scanner(System.in);
	
	//entrada de dato
	System.out.println("Introduce radio: ");
	radio=scanner.nextDouble();
	
	//Logica del programa area = pri*radioalcuadrado
	area=Math.PI*radio*radio;
	
	//Salida de informacion
	System.out.println("El area calculada es: "+area);
	}

}
