package br.com.Animal;

public class Passaro extends Animal{
	
	private int ovoquant;
	
	public int getOvoquant() {
		return ovoquant;
	}

	public void setOvoquant(int ovoquant) {
		this.ovoquant = ovoquant;
	}

	public Passaro(String nome, String raca, int ovoquant) {
		super(nome,raca);
		this.ovoquant = ovoquant;
	}
	
	public String voa() {
		return "eu vôo";
	}
	
	public String botaOvo() {
		return "boto ovo";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return super.comer() + " alpiste";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return super.dormir() + " no ninho";
	}

	@Override
	public String toString() {
		return "Eu sou o " + getnome() + " da raça " + getraca() + ". " + comer() + 
				" e " + dormir() + "." + " Como sou um passaro " + voa() + " e " + botaOvo() + ", por exemplo, nesta semana botei " + ovoquant + ".";
	}
	
	 
	

}
