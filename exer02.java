package br.com.generation.Atividades2;

public class exer02 {
	/*
	 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */

	public static void main(String[] args) {
		
		int i, totalP = 0, totalI = 0;
		
		for(i = 10; i <= 20; i++) {
			
			if(i % 2 == 0) {
				totalP++;
			}
			else if(i % 2 == 1) {
				totalI++;
			}
		}
		System.out.println("Temos o total de " + totalP + " n�meros Par");
		System.out.println("Temos o total de " + totalI + " n�meros �mpar");

	}

}
