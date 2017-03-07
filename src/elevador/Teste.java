package elevador;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevador elevador = new Elevador();
		elevador.setQtdDepessoasNoElevador(11);
		elevador.inicializa(2000,5);
		elevador.entra();
		elevador.sair();
		

	}

}
