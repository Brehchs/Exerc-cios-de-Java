package com.generation.paciente;

import com.generation.paciente.model.Paciente;

public class Menu {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("Brenda Lima", 28, "Fem", "Triagem", "Moderado");
		p1.visualizar();
		
		p1.setStatus("Consultório Médico");
		p1.setGrauUrgência("Grave");
		p1.visualizar();
	}

}
