package br.com.Cadeira;

public class Cadeira {
	
    public double tamanho;
    public double peso;
    public String cor;
    private String marca;
    private String modelo;
    
    
    
    public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Cadeira(double tamanho, double peso, String cor, String marca,String modelo) {
    	this.modelo = modelo;
    	this.marca = marca;//pra usar equals colocar o set
    	this.cor = cor;
    	this.peso = peso;
    	this.tamanho = tamanho;
    }
	



	public void inclinar(double graus){
		System.out.println("O banco inclina de 90 a 45 graus");
	      
    }

    public void massagear(){
    	System.out.println("Massagem à dois conto");
    }
    
	public static void main(String[] args) {
		
		Cadeira cad = new Cadeira(1.03, 2.00 , "Azul", "RaizBem", "GIO320");
		CadeiraDePraia cp = new CadeiraDePraia("Madeira", 1.30, 2.00, "Verde", "Top", "DAS123");
		Banco ocnab = new Banco("Praça Pequena", 3.00, 4 , "Cinza", "LG","PET984");
		
		System.out.println(cad.toString());
		System.out.println(cp.toString());
		System.out.println(ocnab.toString());
	}

}
