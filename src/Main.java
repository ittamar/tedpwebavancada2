import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Pessoa p = new Pessoa("ted",20,1.64);
		Calendar d = Calendar.getInstance();
		Date date = d.getTime();

		Agenda ag = new Agenda();

		PessoaJuridica pgj = new PessoaJuridica();
		pgj.setNome("monica");
		pgj.setDiaCadastro(date);
		pgj.setTelefone("3333-33333");
		pgj.setCnpj(22);
		
		ag.addPessoa(pgj);

		PessoaFisica pg3 = new PessoaFisica();
		pg3.setNome("boy");
		pg3.setTelefone("55555-6666");
		pg3.setDiaCadastro(d.getTime());
		pg3.setCpf(000001);

		ag.addPessoa(pg3);

		PessoaFisica pg4 = new PessoaFisica();
		pg4.setNome("girl");
		pg4.setTelefone("55555-6666");
		pg4.setDiaCadastro(d.getTime());
		pg4.setCpf(000000);

		PessoaFisica pg5 = new PessoaFisica();
		pg5.setNome("auuuu");
		pg5.setTelefone("11111-6666");
		// pg5.setDiaCadastro(null);
		pg5.setCpf(101010);
		// PessoaGenerica pg2 = new
		// PessoaGenerica("ju","555-4444","10/04/2000",55555,88888);

		ag.addPessoa(pg4);
		ag.addPessoa(pg5);
		// ag.addPessoa(pg2);
		

		ag.exibirArraylist();
		ag.removePessoa("girl");
		ag.imprimiPessoaPeloIndex(0);
		ag.imprimiTodasPessoas();
		ag.buscarPessoaFisicaPorCpf(000000);
		ag.buscarPessoaJuridicaPorCnpj(22);
		/*
		 * System.out.println("Nome..."+p.getNome()+"\n Idade..."+p.getIdade()+
		 * "\n Altura"+p.getIdade()); p.setNomeInvertido();
		 */

	}

}
