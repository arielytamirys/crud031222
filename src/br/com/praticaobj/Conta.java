package br.com.praticaobj;

public class Conta {
	
	private String nomeCliente;
	private Double numConta;
	private String tipoConta;
	private boolean statusConta;
	private float saldoConta;
	
	public void estadiAtual() {
		System.err.println("----------------------------------");
		System.out.println("Conta" + this.getNumConta());
		System.out.println("Dono(a)" + this.getNomeCliente());
		System.out.println("Tipo" + this.getTipoConta());
		System.out.println("Saldo" + this.getSaldoConta());
		System.out.println("Status" + this.getStatusConta());
		
		
	}
	

	public Conta() {

		this.setSaldoConta(0);
		this.setStatusConta(false);
	}
	
	public void abrirConta(String t) {
		
		this.setTipoConta(t);
		this.setStatusConta(true);
		
		if (t == "cc" ) {
			this.setSaldoConta(50);
			
		} else  {
			this.setSaldoConta(150);
		}
		
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		
		if (this.saldoConta > 0) {
			System.out.println("Conta ainda possui valor, não pode ser fecha");
		} else if(this.saldoConta < 0) {
			System.out.println("Conta não pode ser fechada pois Possui debito");
		}else {
			this.setStatusConta(false);
			System.out.println("conta fechada com sucesso");
		}
		
	}
	
	public void depositar(float valor) {
		if (this.getStatusConta()) {
			this.setSaldoConta(this.getSaldoConta() + valor);
			System.out.println("Deposito realizado com sucesso  na conta de " + this.getNomeCliente());
		} else {
			System.out.println("impossivel deposita em uma conta fechada ou que não existe ");
		}
	}
	
	public void sacarConta(float valor) {
		if (this.getStatusConta()) {
			if (this.getSaldoConta() >= valor) {
				this.setSaldoConta(this.getSaldoConta() - valor);
				System.out.println("saque realizado na conta de " + this.getNomeCliente());
			} else {
				System.out.println("saldo insufuciente");
			}
		} else {
			System.err.println("NAO POSSUIMOS ESTA CONTA EM NOSSO SISTEMA");
		}
	}
	
	
	public void debito() {
		
		int v = 0;
		
		if (this.getTipoConta () == "CC") {
			v = 12;
		} else if (this.getTipoConta () == "CP") {
			v = 20;
		}
		
		if (this.getStatusConta()) {
			this.setSaldoConta(this.getSaldoConta() - v);
			System.out.println("Mensalidade paga com sucesso");
		}else{
				System.out.println("impossibel pagar conta por falta de saldo");		
			}
		}
		


	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getNumConta() {
		return numConta;
	}
	public void setNumConta(Double numConta) {
		this.numConta = numConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public boolean getStatusConta() {
		return statusConta;
	}
	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	public float getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	
	

}
