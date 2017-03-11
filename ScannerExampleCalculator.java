package pl.codeme.hackaton;

import java.util.Scanner;

public class ScannerExampleCalculator {
	
	private static String dzialanie;
	
	public String getDzialanie() {
		return dzialanie;
	}

	public void setDzialanie(String dzialanie) {
		this.dzialanie = dzialanie;
	}
	
	public ScannerExampleCalculator(){
		
		 Scanner calculator = new Scanner(System.in);;
		 System.out.println("Wywolaj dzialanie" );
		 dzialanie = calculator.nextLine();
		 System.out.println("Dzialanie, ktore chcesz wykonac to " + dzialanie);
	 
	}
}
