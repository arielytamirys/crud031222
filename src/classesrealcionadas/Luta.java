package classesrealcionadas;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria())  
			&& l1 != l2) {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.err.println("+++ Desafiado +++");
			 this.desafiado.apresentar();
			 System.err.println("+++ Desafiante +++");
			 this.desafiante.apresentar();
			 
			 Random aleatorio = new Random();
			 
			 int vencedor = aleatorio.nextInt(3);
			 switch (vencedor) {
			   case 0: //impate
				   System.err.println("Empatou Luta");
				   this.desafiado.empatarLuta();
				   this.desafiante.empatarLuta();
				   break;
				   
			   case 1:// desafiante vence
				   System.out.println("Venceu a Luta" + this.desafiado.getNome());
				   this.getDesafiado().ganharLuta();
				   this.getDesafiante().perderLuta();
				   break;
			   case 2://desafiado vence 
				   System.out.println("Venceu a Luta" + this.desafiante.getNome());
			  		this.getDesafiante().ganharLuta();
			  		this.getDesafiado().perderLuta();
			} 
			
		}else {
			System.err.println("A Luta não pode acontece");
		}
	
		
		
	}
	
	

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	
}
