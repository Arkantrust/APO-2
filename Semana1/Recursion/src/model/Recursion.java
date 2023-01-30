/** 
 * Tema: Algoritmos recursivos
 * */

package model;

public class Recursion{

	public Recursion(){  }


	// f(n) = n * f(n-1) -> Definición de la función factorial.
	public long factorial(long n){
		// caso base
		if(n == 0){
			return 1;
		}
		// llamado recursivo.
		return n * factorial(n-1); 
	}

	// f(n) = f(n-1) + f(n-2) -> Definición de la función (definición del problema)
	public long fibonacci(long n){
		// Casos base 
		if(n == 0 || n == 1){
			return n; 
		}
		// llamado recursivo
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
