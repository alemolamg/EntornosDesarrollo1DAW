package ejerciciosDebug;

public class invertir_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaramos array a invertir y la variable que nos va a servir para
		//intercambiar los valores del array
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux=0;
		
		// imprimimos array para comprobar
		int longitud=array.length;
		for (int i = 0; i < longitud; i++)	// 20201126 eliminamos opción i = array.length	
			System.out.print(array[i] + " ");
		
			// invertimos array recorriéndolo hasta la mitad e intercambiando valores
		for(int i=0;i<=longitud/2; i++){	//vamos guardando la posición que vamos a intercambiar desde el final
			if(!(longitud-i-1 == i)){	// 20201130 añadimos if para no cambiar el mismo valor 
				//aux = array[longitud-i];
				aux = array[longitud-i-1];	// 20201126 longitud-0 sale del límite, ponemos -1 para mantenerlo
			
				//como ya tenemos guardada la posición longiutd-i-1, ya podemos guardar en
				//esa posición un valor
				array[longitud-i-1] = array[i];
			
				//guardamos en las posiciones iniciales el valor de aux que ya estaba
				//guardado
				array[i] = aux;
			}
		}
		// comprobamos que se ha invertido el array
		System.out.println();
		for (int i = 0; i < longitud; i++)
			System.out.print(array[i] + " ");
	}
}
