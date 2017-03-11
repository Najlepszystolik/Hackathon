package pl.codeme.hackaton;

import java.util.Scanner;

public class PerformOperation {
	
		
	public static void main(String[] args) {
		
		ScannerExampleCalculator new1 = new ScannerExampleCalculator();
		String[] dane = new1.getDzialanie().split(" ");	
		Stack nowystos = new Stack(dane.length);
		int a;
		int b;
		for (int i=0; i<dane.length;i++){
			
			switch(dane[i]){
			
			case "+":
				a = nowystos.Pop();
				b = nowystos.Pop();
				nowystos.Push(a + b);
				break;
				
			case "-":
				a = nowystos.Pop();
				b = nowystos.Pop();
				nowystos.Push(a - b);
				break;
				
			case "*":
				a = nowystos.Pop();
				b = nowystos.Pop();
				nowystos.Push(a * b);
				break;
			
			case "/":
				a = nowystos.Pop();
				b = nowystos.Pop();
				nowystos.Push(a / b);
				break;
				
			default:		
				nowystos.Push(Integer.parseInt(dane[i]));
				
			}
		}
		
		System.out.println("Twoje dane uzywane w operacji to: ");
		nowystos.display();
		System.out.println("Rozmiar stosu to: " + nowystos.getSize());
		System.out.println("Wynik operacji to: ");
		nowystos.display();
			
	}
}	

		
	
