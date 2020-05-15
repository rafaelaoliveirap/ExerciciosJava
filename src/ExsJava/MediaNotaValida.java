package ExsJava;

import java.util.Scanner;

public class MediaNotaValida {
	public static void main(String[] args) {
		
		Scanner resposta = new Scanner (System.in);
		
		int i=1;		
		float nota1, nota2, media=0;
		String nome;
		
		while (i<6) {
			
			System.out.println("Digite seu nome: ");
			nome = resposta.next();
			
			System.out.println("Digite a sua nota 1: ");
			nota1= resposta.nextFloat();
			
			if (nota1<10 && nota1>0) {
				System.out.println("Digite a sua nota 2: ");
				nota2=resposta.nextFloat();
				media = (nota1*1 + nota2*2) / 3;
				System.out.println(nome + " sua média é: " + media);
				i++;
			} else {
			 System.out.println("Nota inválida");
			}
	
			}
		}
	}

