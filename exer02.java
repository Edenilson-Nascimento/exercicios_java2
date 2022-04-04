package br.com.generation.Atividades2;

public class exer02 {
	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
		System.out.println("Temos o total de " + totalP + " números Par");
		System.out.println("Temos o total de " + totalI + " números Ímpar");

	}

}
