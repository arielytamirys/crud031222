package br.com.praticaobj;

public class Client {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta (11111-1);
		p1.setNomeCliente ("Silvio Moe");
		p1.abrirConta("CC");
		
		Conta p2 = new Conta();
		p2.setNumConta (2222-1);
		p2.setNomeCliente ("Alessandra Silva");
		p2.abrirConta("CP");
		
		p1.depositar(500);
		
		
		p2.depositar(1000);
		p2.sacarConta(200);
		
		
		p1.estadoAtual();
		
		p2.estadoAtual();
	}
}
