package br.com.praticaobj;

public class Conta {
	
	private String nomeCliente;
	private Double numConta;
	private String tipoConta;
	private boolean statusConta;
	private int saldoConta;
	

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
			System.out.println("conta aberta com sucesso");
		}
		
	}
	
	public void depositar(float valor) {
		if (this.getStatusConta()) {
			this.setSaldoConta(this.getSaldoConta() + valor);
			
		} else {

		}
		
	}
	
	public void sacarConta() {
		
	}
	
	public void debito() {
		
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
	public int getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(int saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	
	

}
