/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package com.generation.paciente.model;

public class Paciente {
	private String nome;
	private int idade;
	private String genero;
	private String status;
	private String grauUrgência;
	
public Paciente(String nome, int idade, String genero, String status, String grauUrgência) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.status = status;
		this.grauUrgência = grauUrgência;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getGrauUrgência() {
	return grauUrgência;
}

public void setGrauUrgência(String grauUrgência) {
	this.grauUrgência = grauUrgência;

}



public void visualizar(){
	System.out.println("___________________________________________");
	System.out.println("\n\tInformações do Paciente");
	System.out.println("___________________________________________");
	System.out.println("\nNome do paciente: "+this.nome);
	System.out.println("Idade: "+this.idade);
	System.out.println("Gênero: "+this.genero);
	System.out.println("\nGrau de urgência: "+this.grauUrgência);
	System.out.println("Status: "+this.status);
}
	

	
	

}
