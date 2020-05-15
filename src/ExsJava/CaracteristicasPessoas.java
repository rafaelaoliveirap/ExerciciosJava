package ExsJava;

import java.util.Scanner; 

public class CaracteristicasPessoas {
	public static void main(String[] args) {
		Scanner resposta = new Scanner (System.in);
		int i=0, mulheresNervosas=0, homensAgressivos=0, pessoasCalmas=0, pessoasNervosas40=0, pessoasCalmas18=0;
		
		for(i=0; i<=2; i++) {
			System.out.println ("Digite seu sexo");
			char sexo = resposta.next().charAt(0);
			System.out.println ("Digite sua idade: ");
			int idade = resposta.nextInt();
			System.out.println("Você se considera 1) calma(o) 2) nervosa(o) ou 3) agressiva(o)?");
			int emocional = resposta.nextInt();
			
			if(sexo=='F' && emocional==2) {
				mulheresNervosas = mulheresNervosas +1;
			} if(sexo=='M' && emocional==3) {
				homensAgressivos = homensAgressivos +1;
			} if(emocional==1) {
				pessoasCalmas = pessoasCalmas + 1;
			} if(emocional==2 && idade>40) {
				pessoasNervosas40 = pessoasNervosas40 + 1;
			} if(emocional==1 && idade<18) {
				pessoasCalmas18 = pessoasCalmas18 +1;
			}
		}
			System.out.println("O número de mulheres nervosas é de: " + mulheresNervosas);
			System.out.println("O número de homens agressivos é de: " + homensAgressivos);
			System.out.println("O número de pessoas calmas é de: " + pessoasCalmas);
			System.out.println("O número de pessoas nervosas com mais de 40 anos é de: " + pessoasNervosas40);
			System.out.println("O número de pessoas calmas com menos de 18 anos é de: " + pessoasCalmas18);
		}
}
