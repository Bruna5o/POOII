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
    
    public Animal (String nome, String raca) {
    	this.raca = raca;
    	this.nome = nome; 
    }
	
	
	public String comer() {
		return "Eu como";
	} 
	
	public String dormir() {
		return "eu durmo";
	}
	
	public String fazerbarulho() {
		return "animal fazendo barulho";
	}

	@Override
	public String toString() {
		return "Eu sou a "+ nome +". Sou uma cadela da raça " + raca;
	}
	
	public static void main(String[] args) {
		
		Animal anim = new Animal("Lessy", "Akita");
		Cavalo horse = new Cavalo("Ronaldo", "Bolinhas", "ferrari");
		Passaro bird = new Passaro("Zé", " Canário", 4);
		
		System.out.println(anim.toString());
		System.out.println(horse.toString());
		System.out.println(bird);
	}
	
}


