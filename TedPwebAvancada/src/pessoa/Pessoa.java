package pessoa;

public class Pessoa {
	private String nome;
	private int idade ;
	private Double altura ;

		public Pessoa() {
			// TODO Auto-generated constructor stub
		}
		
		

		public Pessoa(String nome, int idade, Double altura) {
			
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
		}



		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public Double getAltura() {
			return altura;
		}

		public void setAltura(Double altura) {
			this.altura = altura;
		}
		
		public void setNomeInvertido(){
			for(int i = getNome().length()-1; i>=0 ; i--){
				System.out.println(nome.charAt(i));
			}
		}

		@Override
		public String toString() {
			return "Pessoa nome=" + nome + "\n idade=" + idade + "\n altura=" + altura  ;
		}
		
}
