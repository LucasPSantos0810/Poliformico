package model;

public class PessoaJuridica {
	private String razaosocial;

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public void falar() {
		System.out.println("Falando - Pessoa Juridica");
	}
}
