package ui;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
	

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(); 

		arr.add(40); 
		arr.add(-2);
		arr.add(-22);
		arr.add(30);
		arr.add(4);
		arr.add(8);

		Collections.sort(arr);

		int r = binarySearch(arr, 8); 
		System.out.println("index: " + r);

		int rr = binarySearchRecursion(arr, 40); 
		System.out.println("index recursive: " + rr);

	}
	
	static int binarySearch(ArrayList<Integer> arr, int goal){
		int left = 0; // obtenemos una referencia al puntero inicial  
		int right = arr.size() - 1; // obtenemos una referencia al puntero final 

		while(left <= right){ // repetimos el siclo mientras estemos en el rango del arreglo  
			// calculamos el punto medio del arreglo 
			int mid = (right + left)/2;  // mid = left + (right - left)/2;

			// comparamos el elemento central con el valor objetivo 
			if(goal < arr.get(mid)){
				right = mid - 1;  
			}
			else if(goal > arr.get(mid)){
				left = mid + 1; 
			}
			// si lo encontramos retornamos el elemento 
			else {
				return mid; 
			}
		}

		// si no retornamos -1
		return -1;
	}

	static int binarySearchRecursion(ArrayList<Integer> arr, int goal){
		return binarySearchRecursion(arr, goal, 0, arr.size()-1); 
	}

	static int binarySearchRecursion(ArrayList<Integer> arr, int goal, int left, int right){
		// caso base -> el goal es igual al elemento del medio 
		int mid = (right + left)/2; 
		if(goal == arr.get(mid)){
			return mid;
		}
		// caso base -> el elemento no esta en el arreglo 
		if(left >= right){
			return -1;
		}
		// caso recursivo -> se actualizan los indices y busco por una de las mitades del arreglo. 
		if(goal < arr.get(mid)){
			right = mid - 1; 
		}
		else {
			left = mid + 1; 
		}

		return binarySearchRecursion(arr, goal, left, right);
	}


}
