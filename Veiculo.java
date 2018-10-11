
public class Veiculo{

	//variaveis de instancia
	private string matricula;
	private int kmTotal;
	private int kmParcial;
	private int capacidade;
	private int gasAtual;

	public Veiculo(){
		this.matricula = "";
		this.kmTotal = 0;
		this.kmParcial = 0;
		this.capacidade = 0;
		this.gasAtual = 0;
	}

	public Veiculo(String m, Int kT, Int kP, Int c, Int g){
		this.matricula = m;
		this.kmTotal = kT;
		this.kmParcial = kP;
		this.capacidade = c;
		this.gasAtual = g;
	}

	public Veiculo(Veiculo v){
		this.matricula = v.getMatricula();
		this.kmTotal = v.getKmT();
		this.kmParcial = v.getKmP();
		this.capacidade = v.getCapacidade();
		this.gasAtual = v.getGasAtual();
	}

	public string getMatricula(){
		return this.matricula;
	}

	public int getKmT(){
		return this.kmTotal;
	}

	public int getKmP(){
		return this.kmParcial;
	}

	public int getCapacidade(){
		return this.capacidade;
	}

	public int getGasAtual(){
		return this.gasAtual;
	}

	

}






























