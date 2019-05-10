package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
	public static void main(String args[]) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Lucas Pereira Santos");
		System.out.println(pf.getNome());
		pf.falar();
		
		pj.setRazaosocial("Autonomo");
		System.out.println(pf.getRazaosocial());
		pj.falar();
		
	}

}