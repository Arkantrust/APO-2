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
		// Se calcula el valor si no existe en el arreglo
		if(dp.get(n) == null){
			// Casos base 
			if(n == 0 || n == 1){
				dp.set(n, n); 
				return n; 
			}
			// llamado recursivo
			int result = fibonacciDp(n - 1) + fibonacciDp(n - 2); 
			// almacenamiento de los valores en DP 
			dp.set(n, result); 
			return result;
		}
		else{
			return dp.get(n); 
		}

	}

	/*
		 +-------+------------+---------------+
		 | index | next ==  6 | result        |
		 +-------+------------+---------------+
		 | 1     | false      | 12 += -1 = 11 |
		 | 2     | false      | 11 += 15 = 26 |
		 | 3     | false      | 26 += 2  = 28 |
		 | 4     | false      | 28 += 4  = 32 |
		 | 5     | flase      | 32 += 14 = 46 |
		 | 6     | true       | 46            |
		 +-------+------------+---------------+
		 */
	public int sum(int[] array){
		return sum(1, array, array[0]); 
	}

	private int sum(int index, int[] array, int result){
		if(index == array.length){
			return result; 
		}
		result += array[index]; 
		return sum(++index, array, result); 
	}

}
