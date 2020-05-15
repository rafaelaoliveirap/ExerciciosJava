package ExsJava;

import java.util.Scanner;

public class DoWhileValores {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		int valor = 0, soma = 0, i = 0;
		float media = 0;
		String erro;

		do {
			System.out.println("Digite um valor: ");
			valor = resposta.nextInt();

			try {
				if (valor > 0) {
					soma = soma + valor;
					i++;

				}
			} catch (ArithmeticException e) {
				erro = e.getMessage();
				System.out.println(erro);
			}

		} while (valor > 0);

		try {
			media = soma / i;
		} catch (ArithmeticException e) {
			erro = e.getMessage();
			System.out.println("Não são permitidos números negativos para obter a média! Erro: " + erro);
		}

		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);
	}

}
