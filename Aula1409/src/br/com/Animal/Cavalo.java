package br.com.Animal;

public class Cavalo extends Animal{
	
	private String ferradura;
	
	public String getFerradura() {
		return ferradura;
	}

	public void setFerradura(String ferradura) {
		this.ferradura = ferradura;
	}

	public Cavalo(String raca, String nome, String ferradura) {
		super(raca,nome);
		this.ferradura = ferradura;
	}


	public String mama() {
		return "Animal com mamas";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return super.comer() + "cenoura e capim.";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return super.dormir() + "no estabulo.";
	}

	


}
