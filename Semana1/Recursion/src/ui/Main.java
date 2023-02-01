package ui; 

import model.Recursion; 

public class Main{

	public static void main(String[] args){
		System.out.println("Recursion Examples!!");

    Recursion r = new Recursion();
    System.out.println("Factorial Example:");
    System.out.println("f(0) = " + r.factorial(0));
    System.out.println("f(1) = " + r.factorial(1));
    System.out.println("f(2) = " + r.factorial(2));
    System.out.println("f(4) = " + r.factorial(4));
    System.out.println("f(5) = " + r.factorial(5));

    System.out.println("f(6) = " + r.factorial(6));

    System.out.println("Fibonacci Example:");

    System.out.println("f(0) = " + r.fibonacci(0));
    System.out.println("f(1) = " + r.fibonacci(1));
    System.out.println("f(2) = " + r.fibonacci(2));
    System.out.println("f(3) = " + r.fibonacci(3));
    System.out.println("f(4) = " + r.fibonacci(4));

    System.out.println("Fibonacci Dp Example:");

    System.out.println("f(0) = " + r.fibonacciDp(0));
    System.out.println("f(1) = " + r.fibonacciDp(1));
    System.out.println("f(2) = " + r.fibonacciDp(2));
    System.out.println("f(3) = " + r.fibonacciDp(3));
    System.out.println("f(4) = " + r.fibonacciDp(4));


	}
}
