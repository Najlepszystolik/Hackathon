package pl.codeme.hackaton;

import java.util.Scanner;

public class ScannerExampleCalculator {

	public static void main(String[] args) {
        
         String dzialanie = "";
		 Scanner calculator = new Scanner(System.in).useDelimiter("|\n");;
		 System.out.println("Wywolaj dzialanie" );
		 dzialanie = calculator.nextLine();
		 System.out.println("Dzialanie, ktore chcesz wykonac to " + dzialanie);
		
	}

}
