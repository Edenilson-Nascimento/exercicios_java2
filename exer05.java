package br.com.generation.Atividades2;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);

	        int numb, resultado = 0;

	        do{
	            System.out.println("Digite um n�mero: ");
	            numb = entrada.nextInt();
	            
	            resultado += numb;
	            
	        }while(numb != 0);

	        System.out.println("A soma dos n�meros digitados �: " + resultado);

	        entrada.close();

	}

}
