package br.com.Cadeira;

public class Banco extends Cadeira{

	private String local;
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Banco(String local, double tamanho, double peso, String cor, String marca,String modelo) {
		super(tamanho, peso, cor, marca, modelo);
	}
	
    public void massagear(){
    	System.out.println("O banco n�o tem esse poder");
    }

	@Override
	public String toString() {
		return "O Banco est� localizado na " + local + ", tem o tamanho de " + getTamanho() + ", pesa " + getPeso() + ", e � da cor " + getCor() + ".";
	}
	
	

}
