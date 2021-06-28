package br.univas.edu;
import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
				System.out.println("Por favor, digite sua nota:");
		float nota = leitura.nextFloat();
			
		
		if (nota >=60 ) {
			System.out.println("Passou direto");
		} else if (nota <= 59) {
			System.out.println("Recuperação: nota maior ou igual a 30 e menor que 60");
		} else if (nota <= 30) {
			System.out.println("Dependência: nota menor que 30");
		} else {
			System.out.println("Nenhuma das opções");
		}
	}
		leitura.close();
	}
	
}

