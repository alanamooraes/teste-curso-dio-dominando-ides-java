package br.com.dio.calculado;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     int a, b;
     
     System.out.println("Digite o primeiro valor: ");
     a = scan.nextInt();
     System.out.println("Digite o segundo valor: ");
     b = scan.nextInt();
		
     double soma = soma(a,b);
     double subtracao = subtracao(a,b);
	 double divisao = divisao(a,b);
     double multiplicacao = multiplicacao(a,b);
	
     System.out.println("soma " + soma);
     System.out.println("sub " + subtracao);
     System.out.println("multiplicacao " + multiplicacao);
     System.out.println("divisao " + divisao);
     
	}
		
	public static int soma(double a,double b) {
return (int) (a + b);	
}
	
	public static int subtracao (int a, int b) {
	return a - b;
	}

	public static int divisao (int a, int b) {
		return a / b;
		}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
		}
	
	
}

