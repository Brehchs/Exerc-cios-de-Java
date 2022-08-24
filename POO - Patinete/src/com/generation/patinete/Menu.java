package com.generation.patinete;

import com.generation.patinete.model.Patinete;

public class Menu {

	public static void main(String[] args) {
		Patinete p1 = new Patinete("Azul", "Elétrico", "Carbono", "Xiaomi", 30.0f);
		p1.visualizar();
		
		Patinete p2 = new Patinete("Vermelho", "Manual", "Alumínio", "Vollo", 20.0f);
		p2.visualizar();
	

	}

}
