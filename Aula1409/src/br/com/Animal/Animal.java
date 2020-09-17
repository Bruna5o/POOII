package br.com.Animal;

public class Animal {

	private String raca;
    private String nome;
    


    public String getraca(){
    return raca;
    }

    public void setraca(String raca){
    this.raca = raca;
    }

    public String getnome(){
    return nome;
    }

    public void setnome(String nome){
    this.nome = nome;
    }
    
    public Animal (String raca, String nome) {
    	this.raca = raca;
    	this.nome = nome;
    }
	
	
	public String comer() {
		return "animal comendo";
	}
	
	public String dormir() {
		return "animal dormindo";
	}
	
	public String fazerbarulho() {
		return "animal fazendo barulho";
	}

	@Override
	public String toString() {
		return "Animal [Raça=" + raca + ", Nome=" + nome + "]";
	}
	
	
	
}
