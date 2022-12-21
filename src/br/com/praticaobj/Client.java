package br.com.praticaobj;

import java.util.Locale;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		Locale.setDefault(Locale.US);//serve para definir a pontuação por local igual ao .br
		Scanner digite = new Scanner(System.in);
	
		// para p1 foi usada a class escanner
		System.out.println("digite o numero da conta : ");
	    p1.setNumConta(digite.nextInt());
	    System.out.println("dite o nome do cliente : ");
		p1.setNomeCliente(digite.next());
		System.out.println("Digite saldo da conta: ");
		p1.setSaldoConta(digite.nextFloat());
		p1.setStatusConta(true);
		//p1.abrirConta("CC");
		
//		
		//para p2 foi somente criado o objeto
//		Conta p2 = new Conta();
//		p2.setNumConta (2222-1);
//		p2.setNomeCliente ("Alessandra Silva");
//		p2.abrirConta("CP");
//		
//		p1.depositar(500);
//		
//		
//		p2.depositar(1000);
//		p2.sacarConta(200);
//		
//		
//		p1.estadoAtual();
//		
//		p2.estadoAtual();
//		
		digite.close();
	
		
	}
}
