package br.com.Cadeira;

public class Banco extends Cadeira{

	private String local;
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Banco(String modelo, String marca, String cor, double peso, double tamanho) {
		super(modelo, marca, cor, peso, tamanho);
	}
	
	

}
