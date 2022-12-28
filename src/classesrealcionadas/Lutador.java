package classesrealcionadas;

public class Lutador {
	
	private String nome,nascionalidade,categoria ;
	private float altura, peso ;
	private int idade, vitorias, derrotas, empates;

public void apresentar() {
	System.err.println(" *********  Lutador  ********* ");
	System.out.println("Nome: " + this.getNome());
	System.out.println("idade: " + this.getIdade());
	System.out.println("Nacionalidade: " + this.getNascionalidade());
    System.out.println("Altura: " + this.getAltura() );
    System.out.println("Peso: " + this.getPeso());
   
    ;
}


public void status() {
	System.err.println(" ___________ Vitorias | Empates | Derrotas ___________________");
	System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Empates:" + this.getEmpates());
    System.out.println("Derrotas:" + this.getDerrotas());
}

public void ganharLuta() {
	this.setVitorias(this.getVitorias() + 1);
}

public void perderLuta() {
	this.setDerrotas(this.getDerrotas() + 1);
}

public void empatarLuta() {
	this.setEmpates(this.getEmpates() + 1);
}

public Lutador(String nome, String nascionalidade, float altura, float peso, int idade, int vitorias, int derrotas,
		int empates) {
	super();
	this.nome = nome;
	this.nascionalidade = nascionalidade;
	this.altura = altura;
	this.setPeso(peso); 
	this.idade = idade;
	this.vitorias = vitorias;
	this.derrotas = derrotas;
	this.empates = empates;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNascionalidade() {
	return nascionalidade;
}

public void setNascionalidade(String nascionalidade) {
	this.nascionalidade = nascionalidade;
}

public String getCategoria() {
	return categoria;
}
//condição para o sistema selecionar automaticamente a categoria
private void setCategoria() {
	if (this.peso < 52.2) {
		this.categoria = "Invalido";
		
	}else if (this.peso <= 70.2) {
		this.categoria = "Peso Leve";
		
	}else if (this.peso <= 83.9) {
		this.categoria = "Peso Medio";
	}else if (this.peso <= 120.2 ) {
			this.categoria = "Peso Pesado";
	}else {
		this.categoria = "Invalido";		
			}	
	}

public float getAltura() {
	return altura;
}

public void setAltura(float altura) {
	this.altura = altura;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
	this.setCategoria();
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public int getVitorias() {
	return vitorias;
}

public void setVitorias(int vitorias) {
	this.vitorias = vitorias;
}

public int getDerrotas() {
	return derrotas;
}

public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}

public int getEmpates() {
	return empates;
}

public void setEmpates(int empates) {
	this.empates = empates;
}




}

