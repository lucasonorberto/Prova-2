package br.univas.edu;

import java.util.Scanner;

public class questão1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
				System.out.println("Por favor, digite seu peso:");
		float peso = leitura.nextFloat();
		
		System.out.println("Por favor, digite sua altura:");
		float altura = leitura.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5f) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 24.9f) {
			System.out.println("Peso normal");
		} else if (imc <= 29.9f) {
			System.out.println("Sobrepeso");
		}
		
		System.out.println("Porcentagem: " + imc /100);	

		}
	}

}