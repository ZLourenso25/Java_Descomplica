
public class Aluno1 {
	
	String nome;
	double teste, prova;
	
	//pode ser utilizar o caminho botão direito do mouse -> Source -> Generate Getters and Setters
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getTeste() {
		return teste;
	}



	public void setTeste(double teste) {
		this.teste = teste;
	}



	public double getProva() {
		return prova;
	}



	public void setProva(double prova) {
		this.prova = prova;
	}



	double getMedia() {
		return (teste + prova)/2;
		
	}

}
