package br.com.vantec.estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.vantec.estudo.model.Pessoa;

public class EstudoDesignPatterns {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Michell Adam Bento", "Programador Java");
		Pessoa p2 = new Pessoa("Vanessa Ribeiro Gomes", "HelpDesk");
		Pessoa p3 = new Pessoa("Raissa Eduarda Francisco", "Estudante");
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas = Arrays.asList(p1, p2, p3);
		System.out.println(" ----- Lista de Pessoas ------");
		pessoas.forEach(p -> {
			System.out.println(p);
		});

	}

}
