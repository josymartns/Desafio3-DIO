package desafio_controle_de_fluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}finally {
			terminal.close();
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		
		int contagem = parametroDois - parametroUm;
		
		for(int numeros =1; numeros <= contagem; numeros++) {
			System.out.println("Imprimindo o número " + numeros);
		}
	}
}
	
 class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException(String message) {
		super(message);
	}
		
}


