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

	public Elevador() {

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

	public void inicializa(int capacidade, int andar) {
		setCapacidadeDoElevador(capacidade);
		setNumerodeAndares(andar);

		System.out.println("Capacidade do elevador..." + getCapacidadeDoElevador() + "KG" + "\n"
				+ "Quantos andares tem o prédio..." + getNumerodeAndares());
	}

	public void entra() {
		System.out.println("O elevador suporta até...." + getCapacidadeDoElevador());
		if (getQtdDepessoasNoElevador() <= 10) {
			System.out.println("O elevador ainda não atingiu seu limete de peso");
		} else {
			System.out.println("Peso acima do limite permitido " + "tem que descer alguém");
		}

	}

	public void sair() {

		if (getQtdDepessoasNoElevador() > 0) {
			System.out.println("Em algum momento algué poderá sair do elevador");

		}

	}

	public void sobe() {
		int x = getAndar();
		for (int i = 0; i < getNumerodeAndares(); i++) {
			++x;
			System.out.println("O elevador se encontra no andar Nº..." + x);

			if (x == getNumerodeAndares())
				System.out.println("O elevador se encontra no andar Nº..." + x + " O elevador chegou ao último andar");

		}

	}

	public void desce() {
		int x = getNumerodeAndares();
		for (int i = 0; i != x; x--) {
		
			System.out.println("O elevador esta descendo Nº..." +x);

			
			}
		System.out.println("O elevador não desce mais");
	}

	@Override
	public String toString() {
		return "Elevador [andar=" + andar + ", numerodeAndares=" + numerodeAndares + ", capacidadeDoElevador="
				+ capacidadeDoElevador + ", qtdDepessoasNoElevador=" + qtdDepessoasNoElevador + "]";
	}

}
