package Eros;

import java.util.Scanner;

public class calcularSegundos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t;
		int aux1;
		int aux2;
		int aux3;
		int aux4;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca el total de segundos: ");
		t=sc.nextInt();
		
		aux1=t/3600;  //60x60 son horas
		
		aux2=t%3600;  //segundos no convertidos a horas
		
		
		aux3=aux2/60;  //conseguimos minutos
		aux4=aux2%60;  //el resto son segundos no convertidos en minutos 
		
		
		//posible resultado final
		System.out.println("HORAS: "+aux1);
		System.out.println("MINUTOS: "+aux3);
		System.out.println("SEGUNDOS "+aux4);
			
		
	}
}