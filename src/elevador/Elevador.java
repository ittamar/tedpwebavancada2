package elevador;

public class Elevador {
	private int andar;
	private int numerodeAndares;
	private long capacidadeDoElevador;
	private int qtdDepessoasNoElevador;
	
	public Elevador(int andar, int numerodeAndares, long capacidadeDoElevador, int qtdDepessoasNoElevador) {
		
		this.andar = andar;
		this.numerodeAndares = numerodeAndares;
		this.capacidadeDoElevador = capacidadeDoElevador;
		this.qtdDepessoasNoElevador = qtdDepessoasNoElevador;
	}
	public Elevador(){
		
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumerodeAndares() {
		return numerodeAndares;
	}

	public void setNumerodeAndares(int numerodeAndares) {
		this.numerodeAndares = numerodeAndares;
	}

	public long getCapacidadeDoElevador() {
		return capacidadeDoElevador;
	}

	public void setCapacidadeDoElevador(long capacidadeDoElevador) {
		this.capacidadeDoElevador = capacidadeDoElevador;
	}

	public int getQtdDepessoasNoElevador() {
		return qtdDepessoasNoElevador;
	}

	public void setQtdDepessoasNoElevador(int qtdDepessoasNoElevador) {
		this.qtdDepessoasNoElevador = qtdDepessoasNoElevador;
	}
	
	
	public void inicializa(int capacidade, int andar){
		setCapacidadeDoElevador(capacidade);
		setAndar(andar);
		
		System.out.println("Capacidade do elevador..."+getCapacidadeDoElevador()+"KG"+"\n"+
		"Quantos andares tem o prédio..."+getAndar());
	}
	
	public void entra(){
		System.out.println("O elevador suporta até...."+ getCapacidadeDoElevador());
		if(getQtdDepessoasNoElevador()<=10){
			System.out.println("O elevador ainda não atingiu seu limete de peso");
		}else{
			System.out.println("Peso acima do limite permitido "
					+  "tem que descer alguém");
		}
		
	}
	
	public void sair(){
		if(getQtdDepessoasNoElevador()>0){
			System.out.println("Em algum momento algué poderá sair do elevador");
			
		}
	}

}