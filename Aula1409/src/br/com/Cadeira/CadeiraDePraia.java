package br.com.Cadeira;

public class CadeiraDePraia extends Cadeira{
	
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public CadeiraDePraia(String modelo, String marca, String cor, double peso, double tamanho, String material) {
		super(modelo, marca, cor, peso, tamanho);
		this.material = material;
	}
	
	

}
