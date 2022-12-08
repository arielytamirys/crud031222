package br.com.scanneranimais.out;

import java.util.Scanner;

import br.com.scanneranimais.Animals;

public class Out {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animals am = new Animals();
		
		System.out.println(" qual o nome do seu cachorro? ");
		am.setnomeCachorro(sc.next());
		System.out.println(" qual o nome do seu gato?");
		am.setnomenomeGato(sc.next());
		
		System.out.println(am);
		
		sc.close();
		
	}
}
