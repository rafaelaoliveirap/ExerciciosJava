package ExsJava; 

public class SomaImparMultiplo3 {
	public static void main(String[] args) {
		
		int soma=0;
		
		for(int i=1; i<501; i++) {
			
			if(i%2!=0 && i%3==0) {
				
				//System.out.println(i);
				soma = soma + i;
				
			}
		}
		
		System.out.println("O resultado da soma dos números impares é: " + soma);
		
	}

}
