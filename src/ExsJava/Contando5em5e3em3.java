package ExsJava;

public class Contando5em5e3em3 {
	public static void main(String[] args) {
		
		for(int i=233; i<457; i++) {
			if(i>300 && i<400) {
				i = i + 2;
				System.out.println("Contagem de 3 em 3: " + i);
			}
			else{
				i = i + 4;
				System.out.println("Contagem de 5 em 5: " + i);
			}
		}
	}
}
