package pl.codeme.hackaton;

public class Stack {
	
	int tab[];
	int firstFree;
	
	//Konstruktor inicjuj¹cy wierzcho³ek
	public Stack(int MaxSize){
		tab = new int[MaxSize];
		firstFree = 0;
	}
	//Metoda zwracaj¹ca maksymalny rozmiar stosu
	int getMaximumStackSize(){
		return tab.length;
	}
	//Metoda zwracaj¹ca prawdê gdy stos jest pusty
	boolean isEmpty() {
		if (firstFree == 0){
			return true;
		} else return false;	
		}
	//Metoda zwracaj¹ca rozmiar stosu
	int getSize() {
		return firstFree;
	}
	//Dodawanie do stosu
	void Push(int E) throws ArrayIndexOutOfBoundsException{
		if (firstFree < tab.length){
			tab[firstFree] = E;
			firstFree++;
		} else {
			throw new ArrayIndexOutOfBoundsException(
					"Przepe³nienie stosu, operacja nie powiod³a siê");
		}
	}
	//Zdejmowanie ze stosu
	int Pop() throws IndexOutOfBoundsException {
		if (firstFree <= 0){
			throw new IndexOutOfBoundsException(
					"Stos jest pusty, operacja nie powiod³a siê");
		}
		int temp = tab[firstFree - 1];
		firstFree--;
		return temp;
	}
	//Wyœwietlanie zawartoœci stosu
	void display() throws IndexOutOfBoundsException{
		if (firstFree == 0) {
			throw new IndexOutOfBoundsException(
					"Stos jest pusty, operacja nie powiod³a siê");
		}
		int temp = firstFree -1;
		do {
			System.out.println(tab[temp]);
			temp--;
		} while (temp > -1);
	}
	//Metoda odwracaj¹ca kolejnoœæ elementów na stosie
	void reverse() {
		for (int i = 0; i < firstFree / 2; i++) {
			int temp = tab[i];
			tab[i] = tab[firstFree - 1 -i];
			tab[firstFree - 1 -i] = temp;
		}
	}
	
	public static void main(String[] args) {

		
	}
}