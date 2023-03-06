package ui; 

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class Main {

	private Scanner reader; 

	public Main() {
		reader = new Scanner(System.in); 

	}

	public static void main(String[] args) {
		Main m = new Main(); 

		// la excepción se lanza al leer los valores del reader 
		int a = m.reader.nextInt(); 
		int b = m.reader.nextInt(); 

		
		try{

			int c = m.sum(a, b);
			System.out.print(c);

			m.readInfo();

		}
		catch(InputMismatchException ie){
			System.out.print("el valor debe ser un entero!");
		}
		//
		// la excepción se lanza al hacer la operación 
		int d = m.div(a, b); 
		System.out.print(d);
		
	}

	public int sum(int a, int b){
		return a + b;
	}

	public int div(int a, int b){
		int c = 0;

		try {
			c = a / b;
		}
		catch (ArithmeticException e) {
			
			System.out.print("La división por 0 no existe!");
		}
		return c; 
	}

	public void readInfo() throws InputMismatchException{

		if(reader.hasNextInt()){
			reader.nextInt();
		}
		else{
			throw new InputMismatchException();
		}

	}

}
