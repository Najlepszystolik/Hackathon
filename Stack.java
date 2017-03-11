package pl.codeme.hackaton;

public class Stack {
	
	int tab[];
	int firstFree;
	
	//Konstruktor inicjuj�cy wierzcho�ek
	public Stack(int MaxSize){
		tab = new int[MaxSize];
		firstFree = 0;
	}
	//Metoda zwracaj�ca maksymalny rozmiar stosu
	int getMaximumStackSize(){
		return tab.length;
	}
	//Metoda zwracaj�ca prawd� gdy stos jest pusty
	boolean isEmpty() {
		if (firstFree == 0){
			return true;
		} else return false;	
		}
	//Metoda zwracaj�ca rozmiar stosu
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
					"Przepe�nienie stosu, operacja nie powiod�a si�");
		}
	}
	//Zdejmowanie ze stosu
	int Pop() throws IndexOutOfBoundsException {
		if (firstFree <= 0){
			throw new IndexOutOfBoundsException(
					"Stos jest pusty, operacja nie powiod�a si�");
		}
		int temp = tab[firstFree - 1];
		firstFree--;
		return temp;
	}
	//Wy�wietlanie zawarto�ci stosu
	void display() throws IndexOutOfBoundsException{
		if (firstFree == 0) {
			throw new IndexOutOfBoundsException(
					"Stos jest pusty, operacja nie powiod�a si�");
		}
		int temp = firstFree -1;
		do {
			System.out.println(tab[temp]);
			temp--;
		} while (temp > -1);
	}
	//Metoda odwracaj�ca kolejno�� element�w na stosie
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