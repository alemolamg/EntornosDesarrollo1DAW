package UsoJUnit;

public class menormayor_primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		calcularNumPrimo(50);
		
	}
	
	
	public static void calcularNumPrimo(int num) {

		for (int i = 2; i < num; i++) {
			boolean esPrimo = true;
			for (int j = i; j > 1; j--) 
				if (i % j == 0 && i != j)
					esPrimo = false;
			
			if(esPrimo)
				System.out.println("El número " + i + " es primo.");
		}
		
	}

}
