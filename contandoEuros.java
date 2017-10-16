package Eros;

import java.util.Scanner;

public class contandoEuros {
	public static void main(String[]args) {
		
		int cant; int q; int q2; int q3; int q4; int q5; int q6; int q7; int q8; int q9; double q10;
		
		Scanner escaner=new Scanner(System.in);
		System.out.println("Inserte cantidad de euros:");
		cant=escaner.nextInt();
		
		//bucle while
		while(cant>=1) {
		
		if(cant>=500) {
		q=cant/500;
		cant=cant%500;
		System.out.println("Billetes de 500 euros: "+q);
	} else if(cant>=200) {
		q2 = cant/200;
		cant=cant%200;
		System.out.println("Billetes de 200 euros: "+q2);
	}else if(cant>=100) {
			q3=cant/100;
			cant=cant%100;
			System.out.println("Billetes de 100 euros: "+q3);
		}else if(cant>=50) {
			q4=cant/50;
			cant=cant%50;
			System.out.println("Billetes de 50 euros: "+q4);
		}else if(cant>=20) {
			q5=cant/20;
			cant=cant%20;
			System.out.println("Billetes de 20 euros: "+q5);
		}else if(cant>=10) {
				q6=cant/10;
				cant=cant%10;
				System.out.println("Billetes de 10 euros: "+q6);
		}else if(cant>=5) {
			q7=cant/5;
			cant=cant%5;
			System.out.println("Billetes de 20 euros: "+q7);
		}else if(cant>=2) {
			q8=cant/2;
			cant=cant%2;
			System.out.println("Monedas de 2 euros: "+q8);
		}else if(cant>=1) {
			q9=cant/1;
			cant=cant%1;
			System.out.println("Monedas de 1 euro: "+q9);
		}else if(cant>=0.1) {
			q10=cant/0.1;
			cant=cant%1;
			System.out.println("Centimos de euro: "+q10);
		}
		}//fin del while
		}
			
	}

