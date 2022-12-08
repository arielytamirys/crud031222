package br.com.scanneranimais;

public class Animals {

	private String nomeCachorro;
	private String nomenomeGato;
	
	public Animals() {
		
	}
	
	public String getnomeCachorro() {
		return nomeCachorro;
	}
	public void setnomeCachorro(String nomeCachorro) {
		this.nomeCachorro = nomeCachorro;
	}
	public String getnomenomeGato() {
		return nomenomeGato;
	}
	public void setnomenomeGato(String nomenomeGato) {
		this.nomenomeGato = nomenomeGato;
	}

	@Override
	public String toString() {
		return "Minha cachorra se chama: " + nomeCachorro + 
				"\n,e do meu Gato " + nomenomeGato ;
	}
	
	
}
