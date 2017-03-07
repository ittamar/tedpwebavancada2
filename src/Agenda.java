
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

	// ArrayList<PessoaFisica> alPg = new ArrayList<>();
	ArrayList<PessoaGenerica> pessoa = new ArrayList<>();

	// Adicionar pessoas fisica
	public void addPessoa(PessoaGenerica pg) {
		int i = 0;
		if (i < 10) {
			pessoa.add(pg);
			i++;
		}

	}

	// exibi alista completa
	public void exibirArraylist() {
		Iterator<PessoaGenerica> it = pessoa.iterator();
		while (it.hasNext()) {

			System.out.println(it.next() + "\n");
		}

	}

	// remove pessoas da lista pelo nome
	public List<PessoaGenerica> removePessoa(String nome) {

		for (int i = 0; i < pessoa.size(); i++) {
			for (PessoaGenerica pg : pessoa) {
				if (pg instanceof PessoaFisica) {
					PessoaFisica pf = (PessoaFisica) pg;

				}
			}
			PessoaGenerica pFisica = pessoa.get(i);
			if (pFisica.getNome().equals(nome)) {
				pessoa.remove(pFisica);
				System.out.println("pessoa removida  " + nome);

				break;
			}
		}

		Iterator<PessoaGenerica> it = pessoa.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\n");
		}
		return pessoa;

	}

	// imprimi pessoa pelo index
	public void imprimiPessoaPeloIndex(int i) {
		System.out.println("Nome da pessoa" + pessoa.get(i));
	}

	// imprimi todas as pessoas
	public void imprimiTodasPessoas() {
		for (PessoaGenerica p : pessoa) {
			System.out.println("Todas pessoas" + p);
		}

	}

	// busca a pessoa pelo cpf
	public List<PessoaGenerica> buscarPessoaFisicaPorCpf(long doc) {
		// for (int i = 0; i < pessoa.size(); i++) {

		for (PessoaGenerica pg : pessoa) {

			if (pg instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) pg;
				if (pf.getCpf() == doc) {
					System.out.println("Possui documento de pessoa fisica está na posição..." + pessoa.indexOf(pf));

				}

			}
		}

		// }

		return null;
	}

	// busca a pessoa pelo cnpj
	public List<PessoaGenerica> buscarPessoaJuridicaPorCnpj(long doc) {

		for (int i = 0; i < pessoa.size(); i++) {
			for (PessoaGenerica pg : pessoa) {
				if (pg instanceof PessoaJuridica) {
					PessoaJuridica pj = (PessoaJuridica) pg;
					if (pj.getCnpj() == doc) {

						System.out.println("possui documentos de pessoa juridica esta na posição..." + pessoa.indexOf(pj));

					}

				}
			}

			break;
		}
		return null;
	}

	// busca a pessoa pelo cpf
	/*
	 * public List<PessoaGenerica> buscarPessoaJuridicaPeloCnpj(long cnpj){ for
	 * (int i = 0; i < pessoa.size(); i++) {
	 * 
	 * for(PessoaGenerica pg : pessoa){
	 * 
	 * if (pg instanceof PessoaJuridica){ PessoaJuridica pj =
	 * (PessoaJuridica)pg;
	 * 
	 * } } PessoaGenerica pJuridica = pessoa.get(i); if
	 * (pJuridica.getNome().equals(cnpj)) { //pessoa.remove(pJuridica);
	 * System.out.println("pessoa fisica  " + cnpj);
	 * 
	 * break; } } return null; }
	 */

}
