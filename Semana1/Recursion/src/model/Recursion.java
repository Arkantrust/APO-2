/** 
 * Tema: Algoritmos recursivos
 * */

package model;

import java.util.ArrayList;

public class Recursion{

	private ArrayList<Integer> dp; 

	public Recursion(){
		dp = new ArrayList<Integer>(); 
		for(int i = 0; i < 100; i++){
			dp.add(null); 
		}
	}


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


	public int fibonacciDp(int n){
		if(dp.get(n) == null){
			// Casos base 
			if(n == 0 || n == 1){
				dp.set(n, n); 
				return n; 
			}
			// llamado recursivo
			int result = fibonacciDp(n - 1) + fibonacciDp(n - 2); 
			dp.set(n, result); 
			return result;
		}
		else{
			return dp.get(n); 
		}

	}



}
