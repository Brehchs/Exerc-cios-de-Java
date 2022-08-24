/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package com.generation.patinete.model;

public class Patinete {
	private String cor;
	private String tipo;
	private String material;
	private String marca;
	private float velocidade;
	
public Patinete(String cor, String tipo, String material, String marca, float velocidade) {
		this.cor = cor;
		this.tipo = tipo;
		this.material = material;
		this.marca = marca;
		this.velocidade = velocidade;
	}



public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}



public float getVelocidade() {
	return velocidade;
}

public void setVelocidade(float velocidade) {
	this.velocidade = velocidade;
}

public void visualizar() {
	System.out.println("____________________________________________");
	System.out.println("\n\tInformações do Patinete");
	System.out.println("____________________________________________");
	System.out.println("\nVelocidade máxima: "+this.velocidade+" Km/H");
	System.out.println("Tipo do Patinete: "+this.tipo);
	System.out.println("Material: "+this.material);
	System.out.println("Marca : "+this.marca);
	System.out.println("Cor: "+this.cor);
	
	
}
	
	

}
