package ExsJava;

import java.util.Scanner;

public class DoWhileValores {

	public static void main(String[] args) {
		
		Scanner resposta = new Scanner (System.in);
		int valor=0, soma=0, i=0;
		float media = 0;
		
		do {
			System.out.println("Digite um valor: ");
			valor = resposta.nextInt();
			
			
			if(valor>0) {
			soma= soma + valor;
			i++;
			
			
			}else {
				System.out.println("N�o s�o permitidos n�meros negativos!");
			}
		}while(valor>0);
		
		media= soma/i;
		
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("A m�dia dos valores �: " + media);
	}
			
			
			
}


