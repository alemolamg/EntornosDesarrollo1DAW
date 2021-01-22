package UsoJUnit;

public class MenorMayor_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		calcularNumPrimo(50);
		primos(14);
		int arrayMenMay[] = menorMayor(5, 23, 1);
		
	}
	
	/**
	 * Metodo que valida si un numero es primo o no.
	 * @param numero(int)
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		for (int j = 2; j <= numero / 2; j++) {
			if (numero % j == 0) { 		// entramos si no es primo
				return false;
			}
		}
		return true;			// Si llegamos a este punto, es primo
	}
	
	
	public static int[] menorMayor(int num1, int num2, int num3) {
		int array[] = {num1, num2,num3};
		ordena(array);
		return array;
	}
	
	
	/**
	 * algoritmo de ordenación Ejercicio02
	 * @param array
	 */
	public static void ordena(int array[]) {
		int iterator = 0, valorAux = 0, j = 0;
		
	    for( iterator = 0; iterator < array.length; iterator++) {
	    	valorAux = array[iterator];
	    	for ( j = iterator; j > 0 && array[j - 1] > valorAux; j--) {
	            array[j] = array[j - 1];
	    	}
	    	array[j] = valorAux;
	    }
	}
	
	
	/**
	 * Metodo que pide un numero y guarda en un array los 3 ultimos numeros primos del mismo.
	 * El metodo devuelve un array de 3 elementos.
	 * @param numero
	 * @return array(int) con los primos
	 */
	public static int[] primos(int numero) {
		int array[] = new int [3]; // Creo array de 3 elementos
		int i = 0; // Posicion del array
		
		for (int j = numero -1; j > 1 && i < 3; j--) { // Recorro el array a partir del numero en decremento
			if (esPrimo(j)) { // Comparo si el numero es primo 
				array[i] = j; // En caso de serlo, se guardara en la posicion i
				i++; // i se incrementa
			}
		}	
		
		//	ordeno el array
		int aux=0;
		for(i = 0; i < array.length / 2; i++){
			aux = array[i]; 
			array[i] = array[array.length-1-i];  
			array[array.length-1-i] = aux; 
		}
		
		return array; // Devuelvo el array con los 3 numeros
	}

}
