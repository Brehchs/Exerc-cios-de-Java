package com.generation.collections;

import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		
		ArrayList <String> itens = new ArrayList<String>();

        itens.add("Jaqueta Jeans");
        itens.add("Calça Jeans");
        itens.add("Short Jeans");
        itens.add("Camiseta");
        
        

        System.out.println(itens.toString());

        itens.remove(3);
        System.out.println(itens.toString());

        itens.set(1, "Jaqueta Couro");
        System.out.println(itens.toString());

	}

}
