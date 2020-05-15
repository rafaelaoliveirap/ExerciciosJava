package ExsJava; 

public class Divisivel11Resta5 {
	public static void main(String[] args) {

		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 0) {
				System.out.println("Esses números são divisiveis por 11: " + i);

			} else if (i % 11 == 5) {
				System.out.println("Esses números divididos por 11 restam 5:  " + i);
			}

		}
	}

}
