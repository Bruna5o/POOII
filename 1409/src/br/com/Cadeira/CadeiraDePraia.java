package br.com.Cadeira;

public class CadeiraDePraia extends Cadeira{
	
	private String material;

	public String getMaterial() { 
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public CadeiraDePraia(String material,double tamanho, double peso, String cor, String marca,String modelo) {
		super(tamanho, peso, cor, marca, modelo);
		this.material = material;
	}

	@Override
	public String toString() {
		return "A cadeira de praia foi feita do material " + material + ", de tamanho "  + getTamanho() + " e peso " + getPeso()
				+ ". Possui a cor " + getCor() + " e pertence a marca " + getMarca() + " modelo " + getModelo() + ".";
	}
	
	

}
